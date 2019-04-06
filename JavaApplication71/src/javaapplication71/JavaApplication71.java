/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication71;

import java.util.Scanner;

/**
 *
 * @author impROS
 */
public class JavaApplication71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);//Dışardan girilen veriyi inputta tut.
        int yukseklik;

        System.out.print("Okun yuksekligini giriniz (3'ten buyuk olmali): ");
        yukseklik = input.nextInt();//Tam sayı değerinde girilen veriyi yukseklik değişkeninde tut.

        if (yukseklik > 3) {
            for (int i = 3, k = 0; i > 0 && k < 3; i--, k++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < k + 1; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j < k + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int a = 0; a < yukseklik - 3; a++) {
                System.out.print("    ");
                System.out.print("*\n");
            }

        } else {
            System.out.println("Hata! 3'ten buyuk bir sayi girmelisiniz.");
        }
      
    }
    }
    

