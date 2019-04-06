package ornek2;

import java.util.Scanner;

class ogrenci {


    public static void sinirdegistir() {
           Scanner giris = new Scanner(System.in);
        String secim = giris.next();
        for (int i = 0; i < sinir.length; i++) {
            String deger = System.console().readLine(harfler[i] + "(" + sinir[i] + "):");
            if (deger.length() > 0) {
                try {
                    int yeninot = Integer.parseInt(deger);
                    sinir[i] = yeninot;
                } catch (Exception ex) {
                    System.out.println("Girilen bilgi sayi değil!");
                }
            }
        }
    }

    public ogrenci() {
        adsoyad = System.console().readLine("Öğrenci Ad ve Soyadı:");
        no = System.console().readLine("Öğrenci No:");

        boolean islem = true;
        do {
            String vize_n = System.console().readLine("Vize:");
            String final_n = System.console().readLine("Final:");
            try {
                vizenotu = Integer.parseInt(vize_n);
                finalnotu = Integer.parseInt(final_n);

                if (vizenotu >= 0 && vizenotu <= 100 && finalnotu >= 0 && finalnotu <= 100) {
                    islem = false; // vize ve final girisi dogru olarak yapildi
                } else {
                    System.out.println("Not degerleri 0-100 araliginda olmalidir!");
                }

            } catch (Exception ex) {
                System.out.println("Not bilgisi hatali olarak girildi!");
            }
        } while (islem);

    }

    public void hesapla() {
        int ort = (int) Math.round(vizenotu * 0.4 + finalnotu * 0.6);
        String harf = "FF";
        for (int i = 0; i < sinir.length; i++) {
            if (ort >= sinir[i]) {
                harf = harfler[i];
                break;
            }
        }
        System.out.println("Ortalama: " + ort + " Harf: " + harf);
    }

    public void ogrenciyazdir() {
        System.out.println("Öğrencinin Adı: " + adsoyad + " No: " + no);
        System.out.println("Vize: " + vizenotu + " Final: " + finalnotu);
        hesapla();
    }
}

public class ornek1 {

    ogrenci[] ogr = new ogrenci[10];

    public ornek1() {
     
        int ogrencisay = 0;
        boolean islem = true;
        do {
            System.out.println("1)Öğrenci oluştur\n2)Öğrencileri yazdir\n3)Sınırlar\n4)Çıkış");

            

            switch (secim) {
                case "1":
                    if (ogrencisay < ogr.length) {
                        ogr[ogrencisay] = new ogrenci();
                        ogrencisay++;
                    } else {
                        System.out.println("Maksimum öğrenci sayısına ulaşıldı! ");
                    }

                    break;
                case "2":
            for (ogrenci ogr1 : ogr) // ogr.length yerine ogrencisay degiskeni kullanilabilir, if e gerek kalmaz
            {
                if (ogr1 != null) {
                    ogr1.ogrenciyazdir();
                } else {
                    break;
                }
            }

                    break;
                case "3":
                    ogrenci.sinirdegistir();
                    break;
                case "4":
                    islem = false;
                    break;
                default:
                    System.out.println("Geçerli bir seçim yapmadınız!");
                    break;
            }
        } while (islem);
    }

    public static void main(String[] asdasd) {
        new ornek1();
    }
}
