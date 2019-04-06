
package odev;

import java.util.Random;
import java.util.Scanner;

public class Odev {


    public static void main(String[] args)
    {
Scanner giris=new Scanner(System.in);
Random rastgele=new Random();
int tutulansayi;  
System.out.println("Bir tahmin uretin");
tutulansayi=rastgele.nextInt(10);
int sayi1;

int sayac=1;

 sayi1 = giris.nextInt();
     while(sayi1!=tutulansayi)
     {
         sayac++;
     if(sayi1>tutulansayi)
     {
     System.out.println("Daha asagida bir tahmin uretin");
     }
      else if(sayi1<tutulansayi)
     {
     System.out.println("Daha yukarida bir tahmin uretin");
     }
        sayi1 = giris.nextInt();
     }
     
         System.out.println("Tebrikler dogru bildiniz.Deneme sayiniz="+sayac);
    }
    
}
