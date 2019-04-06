
package javaapplication73;


import java.util.*;
public class JavaApplication3 {
    public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
       
    System.out.print("Bir Sayı Giriniz: ");
    double k=klavye.nextDouble();
    System.out.print("Girdiğiniz Sayinin Kacinci Kuvvetini Almak İstersiniz: ");
      double l=klavye.nextDouble();
        System.out.println("nÜStel OLarak Hesap: "+ustel(k,l) + "  Faktoriyel:" + faktoriyel(k));
   }
   
    
public static double faktoriyel (double a){
     int i,fak=1;
     for(i=1; i<=a; i++)
      fak=fak*i;
     return fak;
    }
    public static double ustel(double x,double y){
     return Math.pow(x, y);
    }
}

