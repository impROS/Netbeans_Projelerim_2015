package tersyildiz2;
import java.util.Scanner;
public class TersYildiz2 {
 public static void main(String[] args) 
    {
        Scanner giris = new Scanner(System.in);
        System.out.println("Hangi sekille ucgen yapmak istersiniz ?");
        String sekil = giris.next();
           ayrac("-");
        yildiz(sekil);
        ayrac("-");
    normalucgen(sekil);
     ayrac("-");
    tersucgen(sekil);
     ayrac("-");
        
}
 static String yildiz(String sekil)
 {
     int sayacbosluk = 1, sayacyildiz = 1;
     for (int i = 1; i < 6; i++) {
         for (int j = 9; j > sayacbosluk; j--) {
             System.out.print(" ");
         }
         for (int k = 0; k < sayacyildiz; k++) {
             System.out.print(sekil);
         }
         System.out.println();

         sayacbosluk += 2;
         sayacyildiz += 2;
     }
     return null;
 }
 static  String normalucgen(String sekil)
 {
     for(int i=1;i<=9;i+=2)
     {
     for(int j=0;j<i;j++)
     {
     System.out.print(sekil);
    
     }
     System.out.println();
     }
     return sekil;
 
 }
 static String tersucgen(String sekil)
 {
     for(int i=9;i>=1;i-=2)
     {
     for(int j=1;j<=i;j++)
     {
     System.out.print(sekil);
     }
     System.out.println();
     }
     return null;
 
 }
 static String ayrac(String ayrac)
 {
     for(int i=1;i<=15;i++)
     {
 System.out.print(ayrac);
     }
     System.out.println();
     return null;
 }
    }
    

