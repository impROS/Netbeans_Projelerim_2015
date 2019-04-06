//impROS
package cozum2;

import java.util.Scanner;

public class Cozum2 {
static int min,max;
    public static void main(String[] args) {
        String eksikSayilar = farkBul("1359");
        System.out.println("Eksik Sayilar = " + eksikSayilar);;
    }

    static String sayilariAl() {
        Scanner giris = new Scanner(System.in);
        int girilenSayi;
        String strSayilar = "";
        System.out.println("Lutfen Tek Tek Sayiları Giriniz.\nCikmak icin 0 a basiniz");
        girilenSayi = giris.nextInt();
        min = girilenSayi;
        while (girilenSayi != 0) {
            girilenSayi = giris.nextInt();
            strSayilar += girilenSayi + ",";
            max =girilenSayi;
        }
        return strSayilar;
    }

    static String farkBul(String strSayilar) {
        String strEksikSayilar = "";
        int index = 0;

        for (int i = Integer.parseInt(strSayilar.charAt(0) + ""); i < Integer.parseInt(strSayilar.charAt(strSayilar.length() - 1) + ""); i++) {
            int sayi = Integer.parseInt(strSayilar.charAt(index) + "");

            if (i != Integer.parseInt(strSayilar.charAt(index) + "")) {

                while (i != sayi) {
                    strEksikSayilar += i + "  ";
                    i++;
                }
            }
            index++;
        }
        return strEksikSayilar;
    }
}
