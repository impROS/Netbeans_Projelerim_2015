
package sayitahminifonsiyon;
import java.util.Scanner;
import java.util.Random;

public class SayiTahminiFonsiyon {


    public static void main(String[] args) 
    {
Scanner giris=new Scanner(System.in);
Random rastgele=new Random();

        int tutulansayi = rastgele.nextInt(10);


        int sayi1 = giris.nextInt();
        Rastgele(sayi1,tutulansayi);
    }
   public static int  Rastgele(int tahmin,int rastgeleSayi)
 {
     Scanner giris=new Scanner(System.in);
     int sayac=1;
     while(tahmin!=rastgeleSayi)
     {
         sayac++;
     if(tahmin>rastgeleSayi)
     {
     System.out.println("Daha asagida bir tahmin uretin");
     }
      else if(tahmin<rastgeleSayi)
     {
     System.out.println("Daha yukarida bir tahmin uretin");
     }
        tahmin = giris.nextInt();
     }
         System.out.println("Tebrikler dogru bildiniz.Deneme sayiniz="+sayac);
         return 0;
    }
}
       
         