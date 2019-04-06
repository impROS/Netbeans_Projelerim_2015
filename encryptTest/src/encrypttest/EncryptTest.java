/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypttest;
/*
 * encryptTest.java
 *
 * Created on 08 February 2002, 07:45
 */

/**
 *
 * @author  Alen Ribic
 * @version 
 * @Copyright   Alen Ribic
 */
import java.io.*;

class EncryptTest {
  
    
    public static void main(String[] args) {
       
       try {

            System.out.print("\n>");
           
            BufferedReader ln = new BufferedReader
                    (new InputStreamReader(System.in));

            
            String line = ln.readLine();
            Encrypter en = new Encrypter(line.length());
            
            //Encryption*********************************
            String enc = en.encrypt(line);
            //*******************************************
            System.out.println("\n\n\nEncrypted message ");
            System.out.println("------------------");
            System.out.println(enc + "\n");
            
            
            System.out.print("Would you like to decrypt this message now? (y/n) ");
            String line2 = ln.readLine();
            
            if ((line2.trim().compareToIgnoreCase("y")) == 0) {
                //Decryption*********************************
                String dnc = en.decrypt(enc, en.encryptKey);
                //*******************************************
                System.out.println("\n\n\nMessage decrypted ");
                System.out.println("------------------");
                System.out.println(dnc + "\n");
            }
            else 
                System.out.println("\n\n\nMessage was not decrypted!");
            
            

       } catch(IOException i) {
           System.out.println(" |");
           System.out.println(" +-- IO exception --\n");
           
       }
        
    }


}