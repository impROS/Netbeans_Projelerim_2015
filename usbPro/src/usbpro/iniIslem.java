package usbpro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class iniIslem {

    static File iniFile;

    public iniIslem(String strYol) {
        iniFile = new File(strYol);
        if (!iniFile.exists()) {
            try {
                iniFile.createNewFile();

            } catch (IOException ex) {
                System.err.println("Dosya ousturulamadi");
            }
        }

    }
//new Date().toString()

    public void duzelt(String strAnahtar) {
        try {

            Properties ozellikler = new Properties();
            ozellikler.load(new FileInputStream(iniFile));
            ozellikler.put(strAnahtar, "1");
            FileOutputStream out = new FileOutputStream(iniFile);
            ozellikler.save(out, "Son Gucellenme Tarihi :");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void yaz(long strAnahtar) {

        String anahtar = strAnahtar + "";
        duzelt(anahtar);
    }
    public String oku(String strAnahtar) {
        try {
            Properties ozellikler = new Properties();
            ozellikler.load(new FileInputStream(iniFile));
            return ozellikler.getProperty(strAnahtar);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public String oku(long Anahtar) {
        String strAnahtar = Anahtar + "";
        return oku(strAnahtar);
    }

    public void ekle(long cvc32) {
        try {

            yaz(cvc32);

            //  System.out.println("Yeni Anahtar Basariyla Yazildi");
        } catch (Exception e) {
            System.out.println("Hata" + e.getMessage());
        }
    }

    public void iniTarihGuncelle(String strYeniAnahtar) {
        FileOutputStream fileOutStream = null;
        Properties ozellikler = new Properties();
        ozellikler.put("today", new Date().toString());
        ozellikler.save(fileOutStream, "Guncellendi");

    }
}
