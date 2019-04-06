
package cevirim3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Cevirim3 {

    static String strVeri = "";
    static byte[] veriler;
    static File dosya;

    public static void main(String[] args) throws IOException {
   byte[] bytDosya =  binaryOku("1.ico");
   
   for(byte bytVeri:bytDosya){
       System.out.println(bytVeri);
   }
   
   
   String[] strDosya = to_String(bytDosya);
        System.out.println(Arrays.toString(strDosya));
   bytDosya=to_Byte(strDosya);
   
        binaryYaz("resYaz.jpg", bytDosya);
   
    }

    static byte[] to_Byte(String[] strDizi) {
        int index = 0;
        byte[] bytDizi = new byte[strDizi.length];

        for (String strVeri : strDizi) {
            bytDizi[index] = (byte) Integer.parseInt(strVeri);
            index++;
        }
        return bytDizi;
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

    static void binaryYaz(String strYazilacakDosya, byte[] yazilacakVeri) throws IOException {
        dosya = new File(strYazilacakDosya);
        FileOutputStream binaryYaz = new FileOutputStream(strYazilacakDosya);
        BufferedOutputStream binaryTampon = new BufferedOutputStream(binaryYaz);
        binaryTampon.write(yazilacakVeri);
        binaryTampon.close();
    }

}
