
package urlboyutogrenme;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UrlBoyutOgrenme {

 
    public static void main(String[] args) {
        try {
            //int boyut = getFileSize(new URL("http://download.netdrive.net/build/NetDrive2_Setup_2_6_0_680.exe"));
            int boyut = getFileSize(new URL("https://qsmirror.gdatasecurity.de/qs/WEB/SECURITY2014/TUR/AV/TUR_R_FUL_2014_AV.exe"));
            System.out.println("Url Boyut = "+boyut);
        } catch (MalformedURLException ex) {
            System.out.println("Hata");
        }
    }
         private static int getFileSize(URL url) {
    HttpURLConnection conn = null;
    try {
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("HEAD");
        conn.getInputStream();
        return conn.getContentLength();
    } catch (IOException e) {
        return -1;
    } finally {
        conn.disconnect();
    }
}
}
