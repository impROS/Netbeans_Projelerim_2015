package usbpro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class ftpClass {

    String host;
    String user;
    String pass;

    String filePath;
    String uploadPath;

    String ftpUrl = "ftp://%s:%s@%s/%s;type=i";
    File dosya;
    final int BUFFER_SIZE = 4096;
    static int progressBarSayac = 0;
    long dosyaSize;

    public ftpClass(String strHost, String strUser, String strPass) {
        host = strHost;
        user = strUser;
        pass = strPass;
    }

    public boolean Upload(String strFilePath, String strUploadPath) {
        progressBarSayac = 0;
        filePath = strFilePath;
        uploadPath = strUploadPath;
        dosya = new File(strFilePath);
        dosyaSize = dosya.length();
        ftpUrl = String.format(ftpUrl, user, pass, host, uploadPath);
        System.out.println("dosya = " + dosya.length());
        System.out.println("dosya size = " + dosyaSize);
        try {
            URL url = new URL(ftpUrl);
            System.out.println("ftpUrl : " + ftpUrl);
            URLConnection conn = url.openConnection();
            try (OutputStream outputStream = conn.getOutputStream();
                    FileInputStream inputStream = new FileInputStream(filePath)) {

                byte[] buffer = new byte[BUFFER_SIZE];
                int bytesRead = -1;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                    System.out.println(progressBar(bytesRead));
                }
                System.out.println("File uploaded");
                
                return true;
            }

        } catch (IOException ex) {
            System.out.println("Hata || " + ex.getMessage());
            return false;
        }
    }

    public String progressBar(int artis) {
        if (progressBarSayac == 100) {
            return "Uploaded";
        }
        try {
            progressBarSayac += artis;
            return "%" + (progressBarSayac / (dosyaSize / 100));
        } catch (ArithmeticException ex) {
            return "Uploaded";
        }
    }
}
