package veritaban2015;

import java.util.Arrays;
import java.util.Scanner;

public class VeriTaban2015 {

    static Scanner giris = new Scanner(System.in);
    static iniIslem db_kisiler = new iniIslem("sozluk.ini");

    public static void main(String[] args) {
//veriEkle();
        menu();

    }

    public static void menu() {
        System.out.println("----------------------------");
        System.out.println("Lutfen Seciminizi Yapiniz.");
        System.out.println("1.Kisi Ekle");
        System.out.println("2.Kisileri Listele");
        System.out.println("3.Kisi Sorgula");
        System.out.println("0.Cikis");
        try {
            int secim = giris.nextInt();
            while (true) {

                if (secim == 1) {
                    veriEkle();
                } else if (secim == 2) {
                    veriListele();
                } else if (secim == 3) {
                    giris = new Scanner(System.in);
                    String strSorgula = giris.nextLine();
                    veriSorgula(strSorgula);
                } else if (secim == 0) {
                    System.exit(0);
                } else {
                    System.out.println("Lutfen Gecerli Bir Menu Seciniz.");
                    menu();
                }
                menu();
            }
        } catch (Exception ex) {
            System.err.println("Lutfen Gecerli Bir Deger Giriniz");
            menu();
        }
    }

    public static void veriEkle() {
        giris = new Scanner(System.in);
        try {
            System.out.println("Ad Soyad : ");
            String adSoyad = giris.nextLine();
            System.out.println("Mail Adresi : ");
            String mail = giris.next();
            System.out.println("Telefon Numarasi");
            String telefon = giris.next();

            db_kisiler.ekle(adSoyad + "," + mail + "," + telefon);
            System.out.println(adSoyad + " Adli Kisi Basariyla Eklendi");
        } catch (Exception ex) {
            System.out.println("Hata.Kisi Eklenemedi");
        }
    }

    public static void veriListele() {
        int son = Integer.parseInt(db_kisiler.oku("sonID"));

        for (int i = 1; i < son; i++) {
            String strKisi = db_kisiler.oku(i);
            if (strKisi != null) {
                System.out.println(strKisi);
            }
        }
    }

    public static void veriSorgula(String veri) {
        System.out.println(veri + " Araniyor..");
        boolean arama;
        int son = Integer.parseInt(db_kisiler.oku("sonID"));

        for (int i = 1; i < son; i++) {
            String strKisi = db_kisiler.oku(i);
            //System.out.println(strKisi);
            int sorgu = strKisi.indexOf(veri);
            //   System.out.println("Sorgu : " + sorgu);

            if (sorgu != -1) {
                arama = true;
                System.out.println(db_kisiler.oku(i));
                System.out.println("Bulundu!");
            }

        }

    }
}
