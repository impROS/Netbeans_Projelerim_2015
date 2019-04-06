/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author x.impROS.x
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String yazi = "impROS";
       int a =3;
       switch(yazi.charAt(2)){
           case 'i': System.out.println("1");
           case 'm': System.out.println("2");
           case 'p': System.out.println("3");
           case 'R': System.out.println("4");
           case 'O': System.out.println("5");
           case 'S': System.out.println("6");
     
           default: System.out.println(" Merhaba Rıdvan Ben Savaş Debug'u çalıştıramadım ");
       }
    }
    
}
