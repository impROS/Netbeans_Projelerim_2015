
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author x.impROS.x
 */
public class threadSozcukCevirVeYaz extends Thread {

    private ArrayList<String> arrTurkceIngilizceWordList = new ArrayList<>();
    private ArrayList<String> arrHataliKelimeler = new ArrayList<>();
    private String strKaynakDosya;
    private String strHedefkDosya;
    private String strHataDosyasi;

    public threadSozcukCevirVeYaz() {
    }

    public threadSozcukCevirVeYaz(String strKaynakDosya, String strHedefkDosya, String strHataDosyasi) {
        this.strKaynakDosya = strKaynakDosya;
        this.strHedefkDosya = strHedefkDosya;
        this.strHataDosyasi = strHataDosyasi;
    }

    @Override
    public void run() {
        try {
            int sayac = 0;
            ArrayList<String> _arrTurkceWordList = dosyaOku(strKaynakDosya);
            System.out.println("Tüm Kelimeler alındı..");
            for (String strKelim : _arrTurkceWordList) {
                cevir(strKelim);
                sayac++;
                if (sayac % 10 == 0) {
                    System.out.println("%" + (sayac * 100 / _arrTurkceWordList.size()));
                }

            }

            System.out.println("Kelime Cevirme İslemi Basariyla Tamamlandi.");

            System.out.println("Cevrilen Dosyalar Yaziliyor");
            File cevrilenlerDosyasi = new File(strHedefkDosya);
            dosyaYaz(cevrilenlerDosyasi, arrTurkceIngilizceWordList);

            System.out.println("Bitti");

            System.out.println("Hata Dosyaları Yaziliyor");
            File HataDosyasi = new File(strHataDosyasi);
            dosyaYaz(HataDosyasi, arrHataliKelimeler);
            System.out.println("Bitti");
        } catch (IOException ex) {
            System.out.println("Hata || Run " + ex.getMessage());
        }

    }

    private void dosyaYaz(File dosya, ArrayList<String> arrCevrilenKelimeler) throws IOException {

        if (!dosya.exists()) {
            dosya.createNewFile();
        }

        FileWriter dosyaYazici = new FileWriter(dosya, true);
        try (BufferedWriter tamponYazici = new BufferedWriter(dosyaYazici)) {

            for (String strCevrilenKelime : arrCevrilenKelimeler) {
                tamponYazici.write(strCevrilenKelime);
                tamponYazici.newLine();
            }

        } catch (Exception ex) {
            System.out.println("Hata || Yazilamadi : ");
        }
    }

    private ArrayList<String> dosyaOku(String strYol) throws IOException {
        ArrayList<String> arrTurkceWordList = new ArrayList<>();
        int sayac = 0;
        File dosya = new File(strYol);
        String strYazi = "";
        FileReader dosyaOkuyucu = new FileReader(dosya);
        BufferedReader tamponOkuyucu = new BufferedReader(dosyaOkuyucu);

        while ((strYazi = tamponOkuyucu.readLine()) != null) {
            String[] arrTempYazi = strYazi.split(" ");
            arrTurkceWordList.addAll(Arrays.asList(arrTempYazi));
        }
        arrTurkceWordList.stream().forEach((strKelime) -> {
            System.out.println("Okunan : " + strKelime);
        });
        return arrTurkceWordList;
    }

    private void cevir(String kelime) {
        String strCevrilen = "";
        try {

            System.out.println("Ceviriliyor..");
            String value = urlOku("http://ceviri.babylon.com/turk/to-ingilizce/" + kelime + "/");
            System.out.println("http://ceviri.babylon.com/turk/to-ingilizce/" + kelime + "/");

            String[] tds = StringUtils.substringsBetween(value, "<div style=\"color: #6c8aa9; font-weight: bold;\"> ", "</div>");

            for (String td : tds) {
                strCevrilen += td.trim();
            }
            System.out.println(kelime + "=" + strCevrilen);
            this.arrTurkceIngilizceWordList.add(kelime + "=" + strCevrilen);
        } catch (Exception ex) {
            System.err.println("Kelime Çevirilemedi || " + ex.getMessage() + "Kelime  : " + kelime);
            arrHataliKelimeler.add(kelime);
            System.out.println("Hata Eklendi");
        }

    }

    private String urlOku(String url) throws MalformedURLException, IOException {
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
