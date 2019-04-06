package veritaban2015;

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

    static File iniFile;
    static int sonID;

    public iniIslem(String strYol) {
        iniFile = new File(strYol);
        if (!iniFile.exists()) {
            try {
                iniFile.createNewFile();
                yaz("sonID", 0);
                sonID++;
            } catch (IOException ex) {
                System.err.println("Dosya ousturulamadi");
            }
        }

    }
//new Date().toString()

    public void duzelt(String strAnahtar, String strDeger) {
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

    public void yaz(String strAnahtar, int sayiDegeri) {

        String strDeger = sayiDegeri + "";
        duzelt(strAnahtar, strDeger);
    }

    public void yaz(int strAnahtar, String strDeger) {

        String anahtar = strAnahtar + "";
        duzelt(anahtar, strDeger);
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

    public String oku(int Anahtar) {
        String strAnahtar = Anahtar + "";
        return oku(strAnahtar);
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

    public void ekle(String strDeger) {
        try {
            sonID=Integer.parseInt(oku("sonID"));
            sonID++;
            yaz(sonID, strDeger);
            
            yaz("sonID", sonID);
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
