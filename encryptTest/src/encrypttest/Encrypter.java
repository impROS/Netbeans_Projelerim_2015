/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypttest;
/*
 * Encrypter.java
 *
 * Created on 09 February 2002, 11:18
 */

/**
 *
 * @author  Alen Ribic
 * @version 
 * @Copyright   Alen Ribic
 */
import java.util.Random;

public class Encrypter {
    
    protected int encryptKey[];
    private char tmpChar;
    private Character obChar;
    private char convChar;
    private int tmpVal;
    private char newChar;
    private String encryptString="";
    private String decryptString="";
    
    
    //Construct key upon the instantiation of 'this' class
    Encrypter(int keySpace) {
        
        encryptKey = new int[keySpace];
        
        //Single-key..................................................................
        Random rand = new Random();
        for (int i = 0; i < encryptKey.length; i++) encryptKey[i] = rand.nextInt(9);
        //............................................................................
        
    }
    
    

    public String encrypt(String strToEncrypt) {
        
        for (int s = 0; s < strToEncrypt.length(); s++) {
            
            //Split each character
            tmpChar = strToEncrypt.charAt(s);
            obChar = new Character(tmpChar); 
            
            //Decimal value for character - XORed - with key value 
            tmpVal = obChar.charValue() ^ encryptKey[s]; 
           
            //From 'int' to 'char' cast required...
            newChar = (char) tmpVal;
            encryptString += newChar;

            if (s > encryptKey.length) 
                s = 0;
            
        }

        return encryptString; //ciphertext
        
    }
    
    
    
    public String decrypt(String strToDecrypt, int key[]) {
        
        for (int d = 0; d < strToDecrypt.length(); d++) {
            
            //Split each character
            tmpChar = strToDecrypt.charAt(d);
            obChar = new Character(tmpChar); 
            
            //Decimal value for character - XORed - with stored key value 
            tmpVal = obChar.charValue() ^ key[d];
            
            //From 'int' to 'char' cast required...
            newChar = (char) tmpVal;
            decryptString += newChar;
            
        }
        
        return decryptString; //plaintext
        
    }
    
    
}
