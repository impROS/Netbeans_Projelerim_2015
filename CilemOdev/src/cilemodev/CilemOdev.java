package cilemodev;

import java.util.ArrayList;
import java.util.Scanner;

public class CilemOdev {

    static ArrayList<Integer> arrAsalSayilar = new ArrayList<>();

    public static void main(String[] args) {
        // 4 ten büyük asal  sayılar 2 çift sayının toplamı seklinde yazilabilir mi ?
        Scanner giris = new Scanner(System.in);
        System.out.println("Lutfen 4 ten  buyuk bir çift sayi giriniz");
        int sinamaSinir = giris.nextInt();
        System.out.println("Kaca Kadar Sinasin");
        int sayiSinir = giris.nextInt();
        asalSayiBul(sayiSinir);
        System.out.println("Asal Sayilar = " + arrAsalSayilar);
        int sayac = 0;
        for (int sinamaSayisi = 0; sinamaSayisi < sinamaSinir; sinamaSayisi++) {

            for (int i = 0; i < arrAsalSayilar.size(); i++) {

                for (int j = 0; j < arrAsalSayilar.size(); j++) {
                    if ((arrAsalSayilar.get(i) + arrAsalSayilar.get(j)) == sinamaSayisi) {
//                        System.out.println("Sinanan = " + sinamaSayisi + " ==> " + arrAsalSayilar.get(i) + " + "
//                                + arrAsalSayilar.get(j) + "= " + (i + j) + " ==> " + (arrAsalSayilar.get(i) + arrAsalSayilar.get(j)));
                        sayac++;
                    }
                }
            }
            if (sayac <= 0) {
                System.out.println("*************Sayi Yazilamadi!!!" + sinamaSayisi);
            }

        }

    }

    static ArrayList<Integer> asalSayiBul(int sayiSiniri) {

        for (int sayi = 2; sayi < sayiSiniri; sayi++) {

            int bolenSayisi = 0;
            for (int sayac = 2; sayac <= sayi; sayac++) {
                if (sayi % sayac == 0) {
                    bolenSayisi++;
                }
                if (bolenSayisi >= 2) {
                    break;
                }
            }
            if (bolenSayisi < 2) {
                arrAsalSayilar.add(sayi);
            }
        }
        return arrAsalSayilar;

    }
}
