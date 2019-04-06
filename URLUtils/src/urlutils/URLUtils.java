
package urlutils;
import java.net.*;
import java.io.*;
import java.util.Properties;

public class URLUtils {

  public static void main(String s[]) {
    System.out.println(exists("http://www.rgagnon.com"));
    System.out.println(exists("http://www.yahoo.com"));
  }


  public static boolean exists(String URLName){
    try {
      Properties systemSettings = System.getProperties();
      systemSettings.put("proxySet", "true");
      systemSettings.put("http.proxyHost","proxy.mycompany.local") ;
      systemSettings.put("http.proxyPort", "80") ;

      URL u = new URL(URLName);
      HttpURLConnection con = (HttpURLConnection) u.openConnection();
      //
      // it's not the greatest idea to use a sun.misc.* class
      // Sun strongly advises not to use them since they can 
      // change or go away in a future release so beware.
      //
      sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();
      String encodedUserPwd =
         encoder.encode("domain\\username:password".getBytes());
      con.setRequestProperty
         ("Proxy-Authorization", "Basic " + encodedUserPwd);
      con.setRequestMethod("HEAD");
      System.out.println
         (con.getResponseCode() + " : " + con.getResponseMessage());
      return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
    }
    catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
}