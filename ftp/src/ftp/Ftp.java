package ftp;

import org.apache.commons.net.ftp.FTPClient;
import java.io.FileInputStream;
import java.io.IOException;

public class Ftp {

    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        FTPClient client = new FTPClient();
        FileInputStream fis = null;

        try {
            client.connect("ftp.domain.com");
            client.login("admin", "xxxxx");

          
            String filename = "A.dat";
            fis = new FileInputStream(filename);

           
            client.storeFile(filename, fis);
            client.logout();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                client.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
