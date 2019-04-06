
package filesizefromurl;
import java.io.*;
import java.net.*;

public class FileSizeFromURL {
  public static final void main(String[] args) {
      System.out.println("Usage: FileSizeFromURL ");
      args[0]="http://www.rgagnon.com/varia/copyrightnotice.txt";
    
    URL url;
    URLConnection conn;
    int size;

    if(args.length != 1) {
      System.out.println("Usage: FileSizeFromURL ");
      return;
      }

    try {
      url = new URL(args[0]);
      conn = url.openConnection();
      size = conn.getContentLength();
      if(size < 0)
         System.out.println("Could not determine file size.");
      else
        System.out.println(args[0] + "\nSize: " + size);
      conn.getInputStream().close();
      } 
    catch(Exception e) {
      e.printStackTrace();
      }
    }
}