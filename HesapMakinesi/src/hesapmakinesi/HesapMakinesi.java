package hesapmakinesi;
import java.util.Scanner;
import java.util.Random;
public class HesapMakinesi
{
    public static void main(String[] args)
    {
 double sayi1,sayi2,sonuc;
 int secim,faktoriyel;
 do{
     
     secim = MenuDegerAl();
     switch(secim)
     {
     
     }
 }while(secim!=7);
 }
    public static void MenuGoster()
    {
    System.out.println("1-Toplama\n+"+
            "2-Çıkarma\n"
            + "3-Çarpma\n"
            + "4-Bölme\n"
            + "5-Faktoriyel\n"
            + "6-Rastgele Sayi\n"
            + "7-Çıkış");
    }
    public static int MenuDegerAl()
    {
    Scanner input = new Scanner(System.in);
    int sayi;
     MenuGoster();
    sayi = input.nextInt();
   
    while(sayi < 1 || sayi > 7)
    {
    MenuGoster();
    System.out.println("\nLütfen Menüden bir geçerli seçim yapınız:");
    }
    return sayi;
    }
    }
public statick double OndalikSayiAl()
{

}
    

