
package javaapplication105;
import java.util.Random;
public class JavaApplication105 {

    public static void main(String[] args)
    {
 Random rastgele=new Random();
    System.out.println("rastgele sayi1= rastgele.Next(0, 10)");
    int RastgeleSayi1 = 0;
    int sayi1 = 0;
    int sayac=1;
   while (sayi1 != RastgeleSayi1)
   {
    sayac++;
    if (sayi1 > RastgeleSayi1)
{
System.out.println("Daha asagida bir tahmin uretin");
}
else if (sayi1 < RastgeleSayi1)
{
    System.out.println("Daha yukarida bir tahmin uretin");
    }
System.out.println("sayi1 = int.Parse");
}
   System.out.println("Tebrikler dogru bildiniz.Deneme sayiniz="+sayac);
   System.out.println();
    }
    
}
