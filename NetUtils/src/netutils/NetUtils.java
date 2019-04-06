/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netutils;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class NetUtils {

  private NetUtils() {}

  public static String getTextContent(URL url) throws IOException {
      Scanner s = new Scanner(url.openStream()).useDelimiter("\\Z");;
      String content = s.next();
      return content;
  }

  public static void main(String[] args) throws IOException {
    URL url = new URL("http://www.rgagnon.com/varia/copyrightnotice.txt");
    System.out.println(NetUtils.getTextContent(url));
  }
}