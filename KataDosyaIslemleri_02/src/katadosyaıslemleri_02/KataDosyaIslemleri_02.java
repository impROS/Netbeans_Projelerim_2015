package katadosyaıslemleri_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class KataDosyaIslemleri_02 {

    private static Scanner giris = new Scanner(System.in);
    private static String strYazi = "";
    private static File dosya;

    public static void main(String[] args) throws IOException {
        dosyaYaz("E:\\dosya.txt");
        dosyaOku("E:\\dosya.txt");
    }

    public static void dosyaYaz(String strYol) throws IOException {
        dosya = new File(strYol);

        if (!dosya.exists()) {
            dosya.createNewFile();
        }

        FileWriter dosyaYazici = new FileWriter(dosya, true);
        BufferedWriter tamponYazici = new BufferedWriter(dosyaYazici);

        while (!strYazi.equalsIgnoreCase("Exit")) {
            strYazi = giris.nextLine();
            if (strYazi.equalsIgnoreCase("Exit")) {
                break;
            }
            tamponYazici.write(strYazi);
            tamponYazici.newLine();
        }
        tamponYazici.close();
    }

    public static void dosyaOku(String strYol) throws IOException {
        dosya = new File(strYol);
        FileReader dosyaOkuyucu = new FileReader(dosya);
        BufferedReader tamponOkuyucu = new BufferedReader(dosyaOkuyucu);

        while ((strYazi = tamponOkuyucu.readLine()) != null) {
            System.out.println(strYazi);
        }
    }
}
