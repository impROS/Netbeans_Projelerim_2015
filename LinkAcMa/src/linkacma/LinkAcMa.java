/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkacma;

import java.awt.Desktop;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author impROS
 */
public class LinkAcMa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        //------------------------------------------------------------------------
//try {
//    
//    String link ="http://m.facebook.com";
//    Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+link);
//    p.waitFor();
//} catch (Exception ex) {
//   yaz("hata olustu.Baglanilamiyor");
//}
//------------------------------------------------------------------------
        try {
    Desktop.getDesktop().browse(new URL("http://m.facebook.com").toURI());
} catch (Exception e) {
    e.printStackTrace();
}
    }
 public static void yaz(String yazi){
   System.out.println(yazi);
   }
    
}
