/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication133;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author impROS
 */
public class JavaApplication133 {

  public static void main(String[] args)
    {
  Scanner giris=new Scanner(System.in);
Random rastgele=new Random();

int sayi1;
int tutulansayi;  
int sayac=1;

System.out.println("lutfen bir tahmin giriniz");
tutulansayi=rastgele.nextInt(100);

 sayi1 = giris.nextInt();
     while(sayi1!=tutulansayi)
     {
         
         sayac++;
     if(sayi1>tutulansayi)
     {
     System.out.println("lutfen asagida bir tahmin giriniz");
     }
      else if(sayi1<tutulansayi)
     {
     System.out.println("lutfen yukarıda bir tahmin giriniz");
     }
        sayi1 = giris.nextInt();
        
     }
         System.out.println("Tebrikler."+sayac+" da buldunuz");
    }
    
}
