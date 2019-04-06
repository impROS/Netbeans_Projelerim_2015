
package recursiffonksiyon;

import java.util.Scanner;
public class RecursifFonksiyon {


    public static void main(String[] args) {
Scanner giris = new Scanner(System.in);
int sayi = 0;
while(sayi!=2){
 sayi=giris.nextInt();
 int sonuc=deneme(sayi);
 System.out.println(sonuc);
}
    }
    static int deneme(int deger){
   if(deger==0) return 1;
   else return deger*deneme(deger-1);
}
   
    }

