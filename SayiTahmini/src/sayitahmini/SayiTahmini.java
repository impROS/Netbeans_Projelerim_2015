
package sayitahmini;

import java.util.Scanner;
import java.util.Random;
public class SayiTahmini {
    public static void main(String[] args) 
    {
Scanner giris=new Scanner(System.in);
Random rastgele=new Random();
int tutulansayi;
tutulansayi=rastgele.nextInt(10);
int sayi1=-999999999;
int sayac=1;
 sayi1 = giris.nextInt();
     while(sayi1!=tutulansayi)
     {
         sayac++;
     if(sayi1>tutulansayi)
     {
     System.out.println("Daha aşağıda bir tahmin üretin");
     }
      else if(sayi1<tutulansayi)
     {
     System.out.println("Daha yukarıda bir tahmin üretin");
     }
        sayi1 = giris.nextInt();
     }
         System.out.println("Tebrikler doğru bildiniz.Deneme sayınız="+sayac);
    }
    
}
