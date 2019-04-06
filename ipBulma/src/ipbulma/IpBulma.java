/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipbulma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class IpBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
   Process islem;
       String string = "";
        try {
            islem = Runtime.getRuntime().exec(new String[] {"ipconfig", string});
            InputStream input = islem.getInputStream();
        BufferedReader okuyucu = new BufferedReader(new InputStreamReader(input));
        String ipconfig;
        while ((ipconfig = okuyucu.readLine()) != null) {
            System.out.println(ipconfig);
           }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}
