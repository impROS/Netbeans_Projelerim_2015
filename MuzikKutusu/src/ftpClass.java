
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

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

    public void download(String kaynak,String hedef) {
   
        int port = 21;
       

        FTPClient ftpClient = new FTPClient();
        try {

            ftpClient.connect(host, port);
            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            // APPROACH #1: using retrieveFile(String, OutputStream)
            String remoteFile1 = "/../public_html/depo/"+kaynak;
            File downloadFile1 = new File(hedef);
            boolean success;
            try (OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream(downloadFile1))) {
                success = ftpClient.retrieveFile(remoteFile1, outputStream1);
            }

            if (success) {
                System.out.println("Dosya Basariyla Yuklendi");
            }

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
            }
        }
    }

    public boolean Upload(String strFilePath, String strUploadPath) {

        filePath = strFilePath;
        uploadPath = strUploadPath;
        dosya = new File(strFilePath);
        dosyaSize = dosya.length();
        ftpUrl = String.format(ftpUrl, user, pass, host, uploadPath);
        System.out.println("dosya = " + dosya.length());
        System.out.println("dosya size = " + dosyaSize);
        try {
            URL url = new URL(ftpUrl);
            URLConnection conn = url.openConnection();
            try (OutputStream outputStream = conn.getOutputStream();
                    FileInputStream inputStream = new FileInputStream(filePath)) {

                byte[] buffer = new byte[BUFFER_SIZE];
                int bytesRead = -1;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                    //   System.out.println(progressBar(bytesRead));
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
