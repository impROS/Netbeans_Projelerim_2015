package ftp3;

import static com.sun.org.apache.xerces.internal.xinclude.XIncludeHandler.BUFFER_SIZE;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class Ftp3 {

    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        String ftpUrl = "ftp://%s:%s@%s/%s;type=i";
        String host = "depolog.hol.es";
        String user = "u162212072";
        String pass = "xxxxx";
        String filePath = "İcon Changer 3.8.rar";
        String uploadPath = "/../public_html/Project.zip";
        int sayac =4096;
        ftpUrl = String.format(ftpUrl, user, pass, host, uploadPath);
        System.out.println("Upload URL: " + ftpUrl);
File dosya = new File(filePath);
        try {
            URL url = new URL(ftpUrl);
            URLConnection conn = url.openConnection();
            try (OutputStream outputStream = conn.getOutputStream(); FileInputStream inputStream = new FileInputStream(filePath)) {

                byte[] buffer = new byte[BUFFER_SIZE];
                int bytesRead = -1;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                    System.out.println("%"+sayac/(dosya.length()/100));
                    sayac +=4096;
                }

            }

            System.out.println("File uploaded");
        } catch (IOException ex) {
            //ex.printStackTrace();
            System.out.println("Hata");
        }
    }

}
