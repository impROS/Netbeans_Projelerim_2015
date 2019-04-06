/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication74;

import java.util.*;
public class fonksiyonlufaktoriyel {
    
    public static void main(String[] args) 
    {
        
    Scanner klavye=new Scanner(System.in);
       
    System.out.print("Bir Sayı Giriniz: ");
    int k=klavye.nextInt();
        System.out.println(" Faktoriyel:" + faktoriyel(k));
   }
   
    
public static int faktoriyel (int a)
{
     int i,fak=1;
     for(i=1; i<=a; i++)
      fak=fak*i;
     return fak;
    }
    }

