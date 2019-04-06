/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.util.Scanner;

/**
 *
 * @author impROS
 */
public class JavaApplication39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
                 System.out.println("Haftanın kacinci gununde olduğumuzu giriniz"); 
        Scanner klavye=new Scanner(System.in);
         int sayi1;
        sayi1=klavye.nextInt();

        if (sayi1==1)
            System.out.println("Pazar Gunundeyiz");
        else if(sayi1==2)
            System.out.println("Pazartesi Gunundeyiz");
        else if(sayi1==3)
            System.out.println("Salı Gunundeyiz");
        else if(sayi1==4)
            System.out.println("Carsamba Gunundeyiz");
        else if(sayi1==5)
            System.out.println("Persembe Gunundeyiz");
        else if(sayi1==6)
            System.out.println("Cuma Gunundeyiz");
        else if(sayi1==7)
            System.out.println("Cumartesi Gunundeyiz");
        else //yukardaki alternatiflerin hiçbiri değilse
            System.out.println("Hafta 7 gundur kardesim,duzgun deger gir :D ");
    }
    
}
