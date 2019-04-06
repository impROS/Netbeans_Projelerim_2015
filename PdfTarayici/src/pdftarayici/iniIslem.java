package pdftarayici;
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


    public void ekle(String strKelime,String strBulunduguDosyalar) {
        try {

            Properties ozellikler = new Properties();
            ozellikler.load(new FileInputStream(iniFile));
            ozellikler.put(strKelime, strBulunduguDosyalar);
            FileOutputStream out = new FileOutputStream(iniFile);
            ozellikler.save(out, "Son Gucellenme Tarihi :");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String oku(String strArananKelime) {
        try {
            Properties ozellikler = new Properties();
            ozellikler.load(new FileInputStream(iniFile));
            return ozellikler.getProperty(strArananKelime);
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


    public void iniTarihGuncelle(String strYeniAnahtar) {
        FileOutputStream fileOutStream = null;
        Properties ozellikler = new Properties();
        ozellikler.put("today", new Date().toString());
        ozellikler.save(fileOutStream, "Guncellendi");

    }
}
