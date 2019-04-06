/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author x.impROS.x
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HaftanÄ±n kacinci gununde olduÄŸumuzu giriniz"); 
        Scanner klavye=new Scanner(System.in);
         int sayi1;
        sayi1=klavye.nextInt();

        if (sayi1==1)
            System.out.println("Pazar Gunundeyiz");
        else if(sayi1==2)
            System.out.println("Pazartesi Gunundeyiz");
        else if(sayi1==3)
            System.out.println("SalÄ± Gunundeyiz");
        else if(sayi1==4)
            System.out.println("Carsamba Gunundeyiz");
        else if(sayi1==5)
            System.out.println("Persembe Gunundeyiz");
        else if(sayi1==6)
            System.out.println("Cuma Gunundeyiz");
        else if(sayi1==1)
            System.out.println("2");
        else //yukardaki alternatiflerin hicbiri degilse
            System.out.println("Hafta 7 gundur kardesim,duzgun deger gir :D ");
        
        if(sayi1==1)
            System.out.println("1");
    }
    }
    
