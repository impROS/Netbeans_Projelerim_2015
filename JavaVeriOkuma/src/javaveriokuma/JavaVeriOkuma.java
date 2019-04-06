
package javaveriokuma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class JavaVeriOkuma {

 
    public static void main(String[] args) throws  IOException { //Giriş çıkış türünde hata fırlatıyor
      URL okuyucu = new URL("http://www.cuddletech.com/veritas/vxcheatsheet.txt");//url olarak internetten rastgele bir txt dosyası verdim
        try (BufferedReader bf = new BufferedReader(//bf  adında karakter tabanlı  okuyucumuzu oluşturduk
                new InputStreamReader(okuyucu.openStream()))) {// input stream ile urlmizi okumaya calisiyoruz
            String veri;//her bir satıra veri diyoruz
            while ((veri = bf.readLine()) != null)//veri boş bir değere eşit olmadığı sürece
                System.out.println(veri);//veriyi ekrana yaz
        }
    }
    
}
