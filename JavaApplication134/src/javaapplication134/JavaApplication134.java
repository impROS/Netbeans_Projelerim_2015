/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication134;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author impROS
 */
public class JavaApplication134 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner giris=new Scanner(System.in);
Random rastgele=new Random();

int tutulansayi;  
System.out.println("BIR TAHMIN GIRIN");
tutulansayi=rastgele.nextInt(100);
int sayi1;

int sayac=1;

 sayi1 = giris.nextInt();
     while(sayi1!=tutulansayi)
     {
         sayac++;
     if(sayi1>tutulansayi)
     {
     System.out.println("DAHA ASAGI");
     }
      else if(sayi1<tutulansayi)
     {
     System.out.println("DAHA YUKARI");
     }
        sayi1 = giris.nextInt();
     }
         System.out.println("Tebrikler dogru bildiniz."+sayac+" DEFA DENEDİNİZ");
    }
    }
    

