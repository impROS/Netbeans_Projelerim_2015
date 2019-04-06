//impROS
package cozum3;

import java.util.Scanner;

public class Cozum3 {

    static int min, max;

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
            max = girilenSayi;
        }
        return strSayilar;
    }

    static String farkBul(String strSayilar) {

        String strEksikSayilar = "";
        int index = 0;
        int beginIndex = 0;
        int endIndex ;

        while (endIndex != -1) {
            endIndex = strSayilar.indexOf(",", beginIndex);
            beginIndex = endIndex;
int ilkSayi =strSayilar.substring(beginIndex + 1, endIndex);

            for (int i = min; i < max; i++) {
               

                if (i != Integer.parseInt(strSayilar.charAt(index) + "")) {

                    while (i != sayi) {
                        strEksikSayilar += i + "  ";
                        i++;
                    }
                }
                index++;
            }
        }

        return strEksikSayilar;
    }
}    static int min, max;

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
            max = girilenSayi;
        }
        return strSayilar;
    }

    static String farkBul(String strSayilar) {

        String strEksikSayilar = "";
        int index = 0;
        int beginIndex = 0;
        int endIndex ;

        while (endIndex != -1) {
            endIndex = strSayilar.indexOf(",", beginIndex);
            beginIndex = endIndex;
int ilkSayi =strSayilar.substring(beginIndex + 1, endIndex);

            for (int i = min; i < max; i++) {
               

                if (i != Integer.parseInt(strSayilar.charAt(index) + "")) {

                    while (i != sayi) {
                        strEksikSayilar += i + "  ";
                        i++;
                    }
                }
                index++;
            }
        }

        return strEksikSayilar;
    }
}
