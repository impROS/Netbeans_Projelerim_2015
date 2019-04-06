
package odev5hafta;

import java.util.Scanner;
public class Odev5Hafta {


    public static void main(String[] args) {
        Dikdortgen d4=new Dikdortgen();
Scanner giris = new Scanner(System.in);
yaz("Lutfen ilk kenarı giriniz");
int kenar1=giris.nextInt();
yaz("Lutfen ikinci kenarı giriniz");
int kenar2=giris.nextInt();
        System.out.println("Alan  = "+d4.AlanHesapla(kenar1, kenar2));
        System.out.println("Cevre = "+d4.CevreHesapla(kenar1, kenar2));
    }
    public static void yaz(String yazi){
        System.out.println(yazi);
    }
}
