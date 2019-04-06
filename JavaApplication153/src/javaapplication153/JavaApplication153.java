/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication153;

import java.util.Scanner;
import java.util.Random;
public class JavaApplication153 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner giris = new Scanner(System.in);
  Random rastgele = new Random();
  int sayi=rastgele.nextInt(5);
  while(sayi==0){
     sayi=rastgele.nextInt(5);
  }
  System.out.println(sayi);
  String yazi=giris.next();
switch(sayi){
    case 1:
        
        if(yazi.equals("Ridvan")){
        System.out.println("Dogru");
        break;
        }
    else
            System.out.println("yanlis");
         break;
    case 2:
        
        if(yazi.equals("Ahmet")){
        System.out.println("Dogru");
        break;
        }
    else
            System.out.println("yanlis");
        break;
                    case 3:
        
        if(yazi.equals("Ferhat")){
        System.out.println("Dogru");
        break;
        }
    else
            System.out.println("yanlis");
                        break;
                            case 4:
        
        if(yazi.equals("Ridvan")){
        System.out.println("Dogru");
        break;
        }
    else
            System.out.println("yanlis");
                                break;
                                    case 5:
        
        if(yazi.equals("Ali")){
        System.out.println("Dogru");
        break;
        }
    else
            System.out.println("yanlis");

}
}
    }
    
