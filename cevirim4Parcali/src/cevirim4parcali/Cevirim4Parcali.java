package cevirim4parcali;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Cevirim4Parcali {

    static String strVeri = "";
    static byte[] veriler;
    static File dosya;

    public static void main(String[] args) throws IOException {
        byte[] bytDosya = binaryOku("resimOkunan.jpg");

        parseArr(bytDosya);
        /*
         String[] strDosya = to_String(bytDosya);
         System.out.println(Arrays.toString(strDosya));
         bytDosya = to_Byte(strDosya);
         */
        //binaryYaz("resYaz.jpg", bytDosya);
    }

    static void parseArr(byte[] panArr) throws IOException {
        byte[] dizi1 = new byte[65530];
        byte[] dizi2 = new byte[65530];
        byte[] dizi3 = new byte[65530];
        byte[] dizi4 = new byte[65530];

        int index = 0;
        int fromIndex = 0;
        int diziSayisi = panArr.length % 65530;
        System.out.println(" Dizi Boyutu = " + panArr.length + " - Parcali Dizi Sayisi");
        while (fromIndex != panArr.length) {
            if (fromIndex < 65530) {
                System.out.println("Dizi1 || ");
                dizi1[index] = panArr[fromIndex];
                index++;
                fromIndex++;
            } else if (fromIndex >= 65530 && fromIndex < (65530 + 65530 - 1)) {

                if (fromIndex == 65530) {
                    index = 0;
                    System.out.println("girildi");
                }
                System.out.println("Dizi2 || ");
                dizi2[index] = panArr[fromIndex];
                index++;
                fromIndex++;
            } else if (fromIndex >= (65530 + 65530 - 1) && fromIndex < (65530 + 65530 + 65530 - 2)) {
                if (fromIndex == (65530 + 65530)) {
                    index = 0;
                    System.out.println("girildi2");
                }
                System.out.println("Dizi3 || ");
                dizi3[index] = panArr[fromIndex];
                index++;
                fromIndex++;
            }
            System.out.println("index = " + index + " || FromIndex = " + fromIndex);
        }
        System.out.println("1.Dizi = " + Arrays.toString(dizi1));
        txtYaz("1.Dizi.txt", dizi1);
        System.out.println("2.Dizi = " + Arrays.toString(dizi2));
          txtYaz("2.Dizi.txt", dizi2);
        System.out.println("3.Dizi = " + Arrays.toString(dizi3));
          txtYaz("3.Dizi.txt", dizi3);

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
    static void txtYaz(String strYazilacakDosya,byte[] yazilacakVeri) throws IOException{
    dosya = new File(strYazilacakDosya);
    if(!dosya.exists()){
    dosya.createNewFile();
    }
    FileWriter dosyaYaz = new FileWriter(dosya,false);
    BufferedWriter tamponYazici = new BufferedWriter(dosyaYaz);
    tamponYazici.write(Arrays.toString(yazilacakVeri));
    tamponYazici.close();
    
    }

}
