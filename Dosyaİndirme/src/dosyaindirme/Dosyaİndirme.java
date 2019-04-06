
package dosyaindirme;

import java.io.*;

import java.net.*; 
public class Dosyaİndirme {


    public static void main(String[] args) throws MalformedURLException, IOException { 

URL url = new URL("http://java.sun.com/j2se/1.5/pdf/l.pdf”);

BufferedInputStream TampondanOkuyucu= new BufferedInputStream(url.openStream());

BufferedOutputStream TampondanYazıcı= new BufferedOutputStream(new FileOutputStream("C:/indirilen.pdf”));

byte i = 0;

do

{

i = (byte)TampondanOkuyucu.read();

TampondanYazici.write(i)

}

while (i != -1);

TampondanOkuyucu.close();

TampondanYazici.close();

System.out.println(”Dosya basarıyla kayıt edildi”); 
    }
    
}
