//impROS
package javaapplication156;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class JavaApplication156 {

    public static void main(String[] args) {
        List liste = new ArrayList();
        List cift = new ArrayList();
        List tek = new ArrayList();
 Scanner giris = new Scanner(System.in);

 int sayac=0;
 while(sayac!=10){
     sayac++;
     System.out.println(sayac+". sayiyi giriniz");
  int sayi=giris.nextInt();
  liste.add(sayi);
 }
 for(int i=0;i<=liste.size()-1;i++){
  int sonuc=(int) liste.get(i)%2;
     if(sonuc==0){
     cift.add((int)liste.get(i) ) ;
     }
     else if(sonuc==1){
     tek.add((int)liste.get(i));
     }
 }
 System.out.println("Tek sayilar =  "+tek+" ==> "+tek.size()+" tane");
  System.out.println("Cift sayilar = "+cift+" ==> "+cift.size()+" tane");
    }
}
