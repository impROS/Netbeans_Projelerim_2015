package ini2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class iniIslem {

    static String iniFile;

    public iniIslem(String strYol) {
        iniFile = strYol;

    }
//new Date().toString()

    public void yaz(String strAnahtar, String strDeger) {
        try {

            Properties ozellikler = new Properties();
            ozellikler.load(new FileInputStream(iniFile));
            ozellikler.put(strAnahtar, strDeger);
            FileOutputStream out = new FileOutputStream(iniFile);
            ozellikler.save(out, "Son Gucellenme Tarihi :");
        } catch (Exception e) {
            System.out.println(e);
        }
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

    public void listele() {
        try {
            Properties ozellikler = new Properties();
            ozellikler.load(new FileInputStream(iniFile));
            ozellikler.list(System.out);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void yeniAnahtar(String strYeniAnahtar) {
        try {
            if (oku(strYeniAnahtar) != null) {
                System.out.println("Boyle bir anahtar zaten mevcut,lutfen farkli bir anahtar ismi yaziniz");
            } else {
                yaz(strYeniAnahtar, "");
            }
        } catch (Exception e) {
            System.out.println("Hata"+e.getMessage());
        }
    }

    public void yeniAnahtar(String strYeniAnahtar, String strDeger) {
          try {
            if (oku(strYeniAnahtar) != null) {
                System.out.println("Boyle bir anahtar zaten mevcut,lutfen farkli bir anahtar ismi yaziniz");
            } else {
                yaz(strYeniAnahtar, strDeger);
                System.out.println("Yeni Anahtar Basariyla Yazildi");
            }
        } catch (Exception e) {
            System.out.println("Hata"+e.getMessage());
        }
    }

    public void iniTarihGuncelle(String strYeniAnahtar) {
        FileOutputStream fileOutStream = null;
        Properties ozellikler = new Properties();
        ozellikler.put("today", new Date().toString());
        ozellikler.save(fileOutStream, "Guncellendi");

    }
}
