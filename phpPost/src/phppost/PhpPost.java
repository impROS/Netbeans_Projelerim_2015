/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phppost;

import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author x.impROS.x
 */
public class PhpPost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
    // open a connection to the site
    URL url = new URL("http://depolog.hol.es/depo/deneme.php");
    URLConnection con = url.openConnection();
    // activate the output
    con.setDoOutput(true);
           // send your parameters to your site
           try (PrintStream ps = new PrintStream(con.getOutputStream())) {
               // send your parameters to your site
               ps.print("deger=impROS2\n");
            
               
               // we have to get the input stream in order to actually send the request
               con.getInputStream();
               
               // close the print stream
           }
    } catch (MalformedURLException e) {
        System.err.println("Hata "+e.getMessage() );
    } catch (IOException e) {
           System.err.println("Hata "+e.getMessage() );
    
    }
    }
    }