/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webelement;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.lang3.StringUtils;
//import org.apache.commons.lang.StringUtils;

public class WebElement {

    public static void main(String[] args) {

        try {
            System.out.println("şçğı");
            String testHtml = urlOku("https://tr.wiktionary.org/wiki/Vikis%C3%B6zl%C3%BCk:S%C3%B6zc%C3%BCk_listesi_%28B%29");
            String[] arrHtml = testHtml.split(" ");

            /*
             for(String strHtml:arrHtml){
             System.out.println(strHtml);
             }
             */
            System.out.println("---------------------------------------");
            byte ptext[] = testHtml.getBytes();
            String value = new String(ptext, "UTF-8");
         //   List<String> arrstringToSearch = 

            // the pattern we want to search for
            // <div style="color: #6c8aa9; font-weight: bold;">
            /*
            <span id="eow-title" class="watch-title " dir="ltr" title="Nurettin Rençber - Aşk Sana Benzer">
    Nurettin Rençber - Aşk Sana Benzer
  </span>
            */
            String[] tds = StringUtils.substringsBetween(value, "\" title=\"", "\">");
            for (String td : tds) {
                System.out.println("" + td.trim()); // good
            }

            String moreStuff = StringUtils.substringBetween(testHtml, "head");
            // System.out.println("\n'head' to 'head':" + moreStuff); // not so good

        } catch (Exception ex) {
            System.err.println("Hata || " + ex.getMessage());
        }

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

    public static byte[] urlKaydet(final String dosyaAdi, final String urlLinki)
            throws MalformedURLException, IOException {
        byte[] veriler;
        BufferedInputStream giris = null;
        FileOutputStream dosyaYazici = null;
        try {
            giris = new BufferedInputStream(new URL(urlLinki).openStream());
            dosyaYazici = new FileOutputStream(dosyaAdi);

            veriler = new byte[giris.read()];

        } finally {
            if (giris != null) {
                giris.close();
            }
            if (dosyaYazici != null) {
                dosyaYazici.close();
            }
        }
        return veriler;
    }
//</editor-fold>
}
