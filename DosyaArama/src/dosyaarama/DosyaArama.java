package dosyaarama;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class DosyaArama {

    private static String AranacakKlasor;
    private static String DosyaAdi;
    private static ArrayList DosyaIsimHavuzu = new ArrayList<String>();

    public static void main(String[] args) {

        AranacakKlasor = dizinYoluAl();
        DosyaAdi = dosyaAdiAl();
        aramaYap(AranacakKlasor, DosyaAdi);
    }

    private static void aramaYap(String klasor, String dosya) {

        try {
            File dizin = new File(klasor);
            listele(dizin);
//            for(Object file:DosyaIsimHavuzu){
//                System.out.println(file);
//            }
//            System.out.println(DosyaIsimHavuzu);
            
            for (Iterator it = DosyaIsimHavuzu.iterator(); it.hasNext();) {
                File file = (File) it.next();
                if (file.getName().equals(dosya)) {
                    System.out.println("Aranan Dosya bulundu.\n");
                    System.out.println(file.getAbsolutePath());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

    private static void listele(File klasor) {
        File[] klasoricindekiler = klasor.listFiles();
        for (File klasoricindekiler1 : klasoricindekiler) {
            if (klasoricindekiler1.isDirectory()) {
                listele(klasoricindekiler1);
            } else {
                DosyaIsimHavuzu.add(klasoricindekiler1);
            }
        }
    }

    private static String dizinYoluAl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Arama Yapilacak Klasor Yolunu Giriniz:\n");
        return sc.nextLine();

    }
//////////////////////////////////////////////////////////////////////////////

    private static String dosyaAdiAl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aranacak Dosya Ismini Giriniz:\n");
        return sc.nextLine();
    }
}
