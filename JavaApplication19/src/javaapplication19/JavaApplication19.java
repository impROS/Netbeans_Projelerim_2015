/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author impROS
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    String büyükharfler="ABCDEFGH";
    String küçükharfler="abcdefgh";
   System.out.println(büyükharfler.length());
   System.out.println("ilk harf"+büyükharfler.charAt(0));
  System.out.println("son harf"+büyükharfler.charAt(büyükharfler.length()-1));
  System.out.println(büyükharfler.substring(4));
  System.out.println(büyükharfler.compareTo("rhaba"));
  büyükharfler+=küçükharfler;
  System.out.println(büyükharfler);
  
    }
    
}
