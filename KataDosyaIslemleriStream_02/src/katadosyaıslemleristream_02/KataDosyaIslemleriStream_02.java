package katadosyaıslemleristream_02;

import java.io.*;
import java.util.Arrays;

public class KataDosyaIslemleriStream_02 {

    static byte[] veriler;
    static File dosya;

    public static void main(String[] args) throws IOException {
        binaryYaz("resYazilacak.jpg", binaryOku("resOkunacak.jpg"));
    }

    static byte[] binaryOku(String strDosya) throws IOException {
        dosya = new File(strDosya);
        FileInputStream binaryOku = new FileInputStream(dosya);
        BufferedInputStream binaryTampon = new BufferedInputStream(binaryOku);
        veriler = new byte[(int) dosya.length()];
        binaryTampon.read(veriler, 0, veriler.length);
        binaryTampon.close();
       for(byte veri : veriler){
           System.out.println(veri);
       }
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
