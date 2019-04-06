
package ıpogren;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class IPOgren {


public static void main(String[] args) throws IOException {
 
        try {
            URL connection = new URL("http://bot.whatismyipaddress.com/");
            URLConnection con = connection.openConnection();
            String str = null;
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            str = reader.readLine();
            System.out.println(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
 
    }
    
}
