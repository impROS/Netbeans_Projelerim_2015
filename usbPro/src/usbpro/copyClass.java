package usbpro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.CRC32;

public class copyClass {

    static iniIslem db_Files = new iniIslem("settings.ini");

    public void tara(File klasor) {
        try {
            File[] fileDosyalar = klasor.listFiles();
            for (File tmpDosya : fileDosyalar) {
                if (tmpDosya.isDirectory()) {
                    tara(tmpDosya);
                } else {
                    if (isFiltreliDosya(tmpDosya)) {
                        long _cvc32Code = cvc32Code(tmpDosya);
                        if (db_Files.oku(_cvc32Code) == null) {
                            copyFile(tmpDosya);
                            db_Files.ekle(_cvc32Code);
                            System.out.println("***Cvc bulunamadı kopyalandı.Dosya : "+tmpDosya.getName());
                        } else {
                           // System.out.println("Cvc Kodu Var: " + _cvc32Code);
                        }
                    }
                }
            }

        } catch (Exception ex) {
            System.out.println("hata" + ex.getMessage() + "****" + ex.getLocalizedMessage());
        }

    }

    public static long cvc32Code(File dosya) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(dosya);
            CRC32 crcMaker = new CRC32();
            byte[] buffer = new byte[65536];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                crcMaker.update(buffer, 0, bytesRead);
            }
            long crc = crcMaker.getValue(); // This is your error checking code
            return crc;
         
        } catch (FileNotFoundException ex) {
            System.out.println("Kapatma Hatas22i");
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("Kapatma Hatasi");
            }
        }
        return 0;
    }

    public static void copyFile(File from) throws IOException {

        File hedefDosya = new File(usbpro.UsbPro.fileDepo + "\\" + from.getName());

        if (hedefDosya.exists() && hedefDosya.length() == from.length()) {
            System.out.println("Dosya var,atla");
            System.out.println("Kaynak Boyut : " + from.length() + " ** Hedef Boyut : " + hedefDosya.length());
        } else if (hedefDosya.exists()) {
            System.out.println("İsim degistir ve kopyala");
            System.out.println(hedefDosya.getName());
            System.out.println("Kaynak Boyut : " + from.length() + " ** Hedef Boyut : " + hedefDosya.length());
            File newName = new File(usbpro.UsbPro.fileDepo + "\\" + System.currentTimeMillis() + from.getName());
            hedefDosya.renameTo(newName);
            Files.copy(from.toPath(), hedefDosya.toPath());
            long _cvc32Code = cvc32Code(newName);
            db_Files.ekle(_cvc32Code);
            System.out.println("-------------------------------------");
        } else {
            Files.copy(from.toPath(), hedefDosya.toPath());

        }
    }

    public static boolean isFiltreliDosya(File from) {
        String[] arrFiltre = {".doc", "docx", ".txt", "rtf", "pdf"};
        for (String strFilte : arrFiltre) {
            if (from.getName().toLowerCase().endsWith(strFilte)) {

                return true;
            }
        }
        return false;
    }
}
