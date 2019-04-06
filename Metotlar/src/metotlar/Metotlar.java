package metotlar;
import java.util.Scanner;
public class Metotlar {
 public static void main(String[] args) {
     Scanner giris = new Scanner(System.in);
     
     System.out.println("1.sayiyi giriniz");
     int sayi1=giris.nextInt();
     
     System.out.println("2.sayiyi giriniz");
     int sayi2=giris.nextInt();
     
   //  int sonuc =Carp(sayi1,sayi2);
     
    Carp(sayi1,sayi2);
    }
 
 static void Carp(int sayi,int sayi3){
 int sonuc= sayi*sayi3;
 System.out.println("sonuc = "+sonuc);
 }
 
}
