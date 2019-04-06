package dosyaındirme;
//<editor-fold defaultstate="collapsed" desc="Kütüphaneler">
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
//</editor-fold>
public class DosyaIndirme {
    public static void main(String[] args) throws IOException {
 //urlKaydet("E:\\deneme.txt","http://www.cuddletech.com/veritas/vxcheatsheet.txt");
        oku("E:\\deneme.txt");
        System.out.println("--------------******************------------");
    //    urlOku("http://www.imdpune.gov.in/pune_forecast.txt");
    }
    //<editor-fold defaultstate="collapsed" desc="URL İndirme">
     public static void urlKaydet(final String dosyaAdi, final String urlLinki)
        throws MalformedURLException, IOException {
    BufferedInputStream giris = null;
    FileOutputStream dosyaYazici = null;
    try {
        giris = new BufferedInputStream(new URL(urlLinki).openStream());
        dosyaYazici = new FileOutputStream(dosyaAdi);
        final byte veriler[] = new byte[1024];
        int say;
        while ((say = giris.read(veriler, 0, 1024)) != -1) {
            dosyaYazici.write(veriler, 0, say);
        }
    } finally {
        if (giris != null) {
            giris.close();
        }
        if (dosyaYazici != null) {
            dosyaYazici.close();
        }
    }
}
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Dosya Okuma">
        public static void oku(String dosyaAdi) throws IOException{
            File dosya =new File(dosyaAdi);
   FileReader fileReader = new FileReader(dosya);
String veri;
 
        try (BufferedReader br = new BufferedReader(fileReader)) {
            while ((veri = br.readLine()) != null) {
                System.out.println(veri);
                
            }       }
   } 
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Url Okuma">
        public static void urlOku(String url) throws MalformedURLException, IOException{
         URL okuyucu = new URL(url);//url olarak internetten rastgele bir txt dosyası verdim
        try (BufferedReader bf = new BufferedReader(//bf  adında karakter tabanlı  okuyucumuzu oluşturduk
                new InputStreamReader(okuyucu.openStream()))) {// input stream ile urlmizi okumaya calisiyoruz
            String veri;//her bir satıra veri diyoruz
            while ((veri = bf.readLine()) != null)//veri boş bir değere eşit olmadığı sürece
                System.out.println(veri);//veriyi ekrana yaz
            }
        }
//</editor-fold>

}