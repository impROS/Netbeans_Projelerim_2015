package dosyatotext;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class DosyaToText {

    static String strVeri = "";
    static byte[] veriler;
    static File dosya;

    public static void main(String[] args) throws IOException {
      byte[] arrByte =  binaryOku("resimOkunan.jpg");
       // txtYaz("resimYazilanText.txt", arrByte);
        
        ///////////////////reverse
       String strVeriler = dosyaOku("resimYazilanText.txt");
        strVeriler = strVeriler.replace("[", "");
        strVeriler = strVeriler.replace("]", "");
        strVeriler = strVeriler.replace(" ", "");
        String[] arrVeriler = strVeriler.split(",");
//        for (String veri : arrVeriler) {
//            System.out.println(veri);
//        }
        System.out.println("Bitti");
        arrByte = to_Byte(arrVeriler);
        binaryYaz("yeniDosya.jpg", arrByte);
        
    }
   static byte[] to_Byte(String[] strDizi) {
        int index = 0;
        byte[] bytDizi = new byte[strDizi.length];

        for (String strVeri2 : strDizi) {
            try{
            bytDizi[index] = (byte) Integer.parseInt(strVeri2);
            index++;
            }catch(Exception ex){
                System.out.println("Hata"+ex.getMessage());
            }
        }
        return bytDizi;
    }
    static void binaryYaz(String strYazilacakDosya, byte[] yazilacakVeri) throws IOException {
        dosya = new File(strYazilacakDosya);
        FileOutputStream binaryYaz = new FileOutputStream(strYazilacakDosya);
        BufferedOutputStream binaryTampon = new BufferedOutputStream(binaryYaz);
        binaryTampon.write(yazilacakVeri);
        binaryTampon.close();
    }
       public static String  dosyaOku(String strYol) throws IOException {
            String veriler="",strYazi;
        dosya = new File(strYol);
        FileReader dosyaOkuyucu = new FileReader(dosya);
        BufferedReader tamponOkuyucu = new BufferedReader(dosyaOkuyucu);

        while ((strYazi = tamponOkuyucu.readLine()) != null) {
            veriler += strYazi;
        }
        return veriler;
    }
    static String[] to_String(byte[] bytDizi) {
        int index = 0;
        String[] strDizi = new String[bytDizi.length];

        for (byte bytVeri : bytDizi) {
            strDizi[index] = bytVeri + "";
            index++;
        }
        return strDizi;
    }

    static byte[] binaryOku(String strDosya) throws IOException {
        dosya = new File(strDosya);
        FileInputStream binaryOku = new FileInputStream(dosya);
        BufferedInputStream binaryTampon = new BufferedInputStream(binaryOku);
        veriler = new byte[(int) dosya.length()];
        binaryTampon.read(veriler, 0, veriler.length);
        binaryTampon.close();

        return veriler;
    }

    static void txtYaz(String strYazilacakDosya, byte[] yazilacakVeri) throws IOException {
        dosya = new File(strYazilacakDosya);
        if (!dosya.exists()) {
            dosya.createNewFile();
        }
        FileWriter dosyaYaz = new FileWriter(dosya, false);
        BufferedWriter tamponYazici = new BufferedWriter(dosyaYaz);
        tamponYazici.write(Arrays.toString(yazilacakVeri));
        tamponYazici.close();

    }
}
