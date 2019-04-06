package online_ceviri;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

//import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class cevirmeClass {

    public enum DocumentType {

        Ingilizce,
        Turkce,
    }

    public static String dilSec(DocumentType kaynak, DocumentType hedefDil) {
        if (kaynak == DocumentType.Ingilizce && hedefDil == DocumentType.Turkce) {
            return "ingilizce/to-turk";
        } else if (kaynak == DocumentType.Turkce && hedefDil == DocumentType.Ingilizce) {
            return "turk/to-ingilizce";
        }
        return null;
    }

    public String cevir(String kelime, DocumentType kaynak, DocumentType hedefDil) {
        String strCevrilen = "";
        try {
            String strFromToLanguage = dilSec(kaynak, hedefDil);

            System.out.println("Ceviriliyor..");
            String value= urlOku("http://ceviri.babylon.com/" + strFromToLanguage + "/"+kelime);
            System.out.println("http://ceviri.babylon.com/" + strFromToLanguage + "/"+kelime);

            String[] tds = StringUtils.substringsBetween(value, "<div style=\"color: #6c8aa9; font-weight: bold;\"> ", "</div>");
            
            for (String td : tds) {
                strCevrilen += td.trim();
            }

        } catch (Exception ex) {
           System.err.println("Hata || " + ex.getMessage());
           return "Kelime Cevrilemedi"; 
        }
        System.out.println("Cevrilen =  "+strCevrilen);
        return strCevrilen;

    }

    public static String urlOku(String url) throws MalformedURLException, IOException {
        String strVeri = "";
        URL okuyucu = new URL(url);//url olarak internetten rastgele bir txt dosyası verdim
        try (BufferedReader bf = new BufferedReader(//bf  adında karakter tabanlı  okuyucumuzu oluşturduk
                new InputStreamReader(okuyucu.openStream()))) {// input stream ile urlmizi okumaya calisiyoruz
            String veri;//her bir satıra veri diyoruz
            while ((veri = bf.readLine()) != null)//veri boş bir değere eşit olmadığı sürece
            {
                strVeri += veri;

            }
        }
        //  strVeri = strVeri.replace("<br>", "\n");
        return strVeri;
    }
}
