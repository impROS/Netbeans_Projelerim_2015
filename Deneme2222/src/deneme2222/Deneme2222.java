
package deneme2222;

import java.util.Scanner;
public class Deneme2222 {

    /**
     @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner giris = new Scanner(System.in);
   System.out.println("1.sayiyi giriniz");
   int sayi1=giris.nextInt();
   System.out.println("2.sayiyi giriniz");
   int sayi2=giris.nextInt();
if(sayi1>sayi2){
System.out.println(sayi1+" buyuk");
}
else if(sayi2>sayi1){
System.out.println(sayi2+" buyuk");
}
else
    System.out.println("sayilar esit");
   
    }
    
}
