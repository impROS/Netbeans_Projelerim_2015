
package ftp2;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;

public class Ftp2 {
public static void main(String[] args) {
        FTPClient client = new FTPClient();
        FileInputStream fis = null;

        try {
            client.connect("depolog.hol.es");
            client.login("u162212072", "xxxxx");

            String filename = "ftp2.txt";
            fis = new FileInputStream(filename);

           
            client.storeFile("/../public_html/"+filename, fis);
            
           
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Hata");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                     System.out.println("Basarili");
                }
                client.logout();
                client.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
