//impROS
package asalsayi2;

import java.util.Scanner;

public class AsalSayi2 {

    public static void main(String[] args) {

        System.out.println("Bir Sayi Giriniz : ");
        Scanner giris = new Scanner(System.in);
        int sayi = giris.nextInt();
        int bolenSayisi = 0;
        for (int sayac = 2; sayac <= sayi; sayac++) {
            if (sayi % sayac == 0) {
                bolenSayisi++;
            }
            if (bolenSayisi >= 2) {
                System.out.println("Sayi Asal Degil");
                return;
            }
        }
        System.out.println("Sayi Asal");
    }
}
//impROS
