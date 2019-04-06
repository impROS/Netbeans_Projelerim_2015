package gericevirim2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class GeriCevirim2 {

    static String strVeri = "";
    static byte[] veriler;
    static File dosya;

    public static void main(String[] args) throws IOException {
        byte[] byteVeri = {0, 0, 1, 0, 1, 0, 16, 16, 0, 0, 1, 0, 24, 0, -48, 0, 0, 0, 22, 0, 0, 0, -119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 16, 0, 0, 0, 16, 8, 6, 0, 0, 0, 31, -13, -1, 97, 0, 0, 0, -105, 73, 68, 65, 84, 56, -115, 99, 96, -96, 6, 48, -13, -87, 63, 108, -27, -41, -12, -97, 20, 108, -26, 83, 127, 24, 110, -128, 75, -20, -20, -1, 30, 73, -117, 73, -62, 46, -79, -77, -1, -61, 13, -64, -89, 48, 44, 119, -43, -1, 99, -25, 30, -3, -1, -11, -5, -49, -1, -9, 31, -65, -1, -65, 113, -9, 53, 92, -114, 40, 3, -10, -97, -72, -9, 31, 29, -112, 100, -64, -41, 111, 63, -1, -1, -1, -1, -1, 127, 126, -35, 18, -72, -1, 73, 50, 0, 6, 92, 98, 103, 97, -56, -31, 53, 0, 23, 120, -4, -4, 35, 101, 6, 44, 89, 119, -100, 56, 3, 96, -2, -123, 1, 24, -33, 33, 98, 18, 121, 97, -128, 77, 110, 56, 25, -32, 18, -73, -32, 48, -87, 6, -72, -58, 47, 56, 66, 100, 94, -59, 15, 0, 5, -62, -6, -33, -53, -19, -3, 12, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
        try {
            binaryYaz("1.ico", byteVeri);
            System.out.println("basarili");
        } catch (IOException ex) {
            System.out.println("basarisiz");
        }
    }

    static void binaryYaz(String strYazilacakDosya, byte[] yazilacakVeri) throws IOException {
        dosya = new File(strYazilacakDosya);
        FileOutputStream binaryYaz = new FileOutputStream(strYazilacakDosya);
        BufferedOutputStream binaryTampon = new BufferedOutputStream(binaryYaz);
        binaryTampon.write(yazilacakVeri);
        binaryTampon.close();
    }
}
