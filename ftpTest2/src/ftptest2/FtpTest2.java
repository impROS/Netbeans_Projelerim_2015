package ftptest2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
 
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class FtpTest2 {

    public static void main(String[] args) throws IOException {

        ftpUpload ftp1 = new ftpUpload("depolog.hol.es", "u162212072", "xxxx");
        if (ftp1.Upload("C:\\Users\\x.impROS.x\\Desktop\\deneme.php", "/../public_html/depo/deneme.php")) {
            System.out.println("Successful");
        } else {
            System.err.println("Error!");
        }
       // ftpDownload();
//        DosyaIndirme dosyaIndir = new DosyaIndirme();
//        dosyaIndir.basla();
        
    }

    static void ftpDownload() {
        String server = "depolog.hol.es";
        int port = 21;
        String user = "u162212072";
        String pass = "xxxxx";

        FTPClient ftpClient = new FTPClient();
        try {

            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            // APPROACH #1: using retrieveFile(String, OutputStream)
            String remoteFile1 = "/../public_html/depo/muzik.txt";
            File downloadFile1 = new File("C:\\Users\\x.impROS.x\\Desktop\\mdeneme.txt");
            boolean success;
            try (OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream(downloadFile1))) {
                success = ftpClient.retrieveFile(remoteFile1, outputStream1);
            }

            if (success) {
                System.out.println("File #1 has been downloaded successfully.");
            }

          

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}



