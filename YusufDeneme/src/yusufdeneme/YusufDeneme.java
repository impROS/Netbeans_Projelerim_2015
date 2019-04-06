
package yusufdeneme;

import java.util.Scanner;


public class YusufDeneme {

 
    public static void main(String[] args) {
 double taban,yukseklik,oran;
    Scanner tara = new Scanner (System.in);
    System.out.println("Üçgenin taban uzunluğunu giriniz");
    taban = tara.nextBoolean();
    System.out.println("Yüksekliği giriniz");
    yukseklik = tara.nextBoolean();
    System.out.println("Üçgenin alanı " + alan(taban,yukseklik) + " birimdir " );
    static double (double taban , double yukseklik){
        return alan = (taban*yukseklik)/2;}
    double oran2=oran(taban,yukseklik);
    System.out.println("Tabanın yükseliğe oranı : " + oran2);
        if (oran>=1){
    System.out.println("Geniş tabanlı bir üçgen");
    }
            else
    System.out.println("Dar tabanlı bir üçgen");
}
    static double oran (double taban , double yukseklik){
        return  (taban/yukseklik);
    }

    }
   
