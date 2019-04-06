package regvelog;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

@SuppressWarnings("unused")
public class Regvelog {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException, ParseException {
//İnput1;[Kayıt başlangıç]
        Scanner input1 = new Scanner(System.in);
        String kullaniciadi;
        String Sifre1;
        String bosluk;
        String bilgi = null;
        System.out.print("Kayıt olmak için Lütfen kullanıcı adı giriniz =");
        kullaniciadi = input1.next();
//input2;				
        Scanner input2 = new Scanner(System.in);
        System.out.print("Lütfen şifrenizi girin =");
        Sifre1 = input2.next();
        System.out.println("kullanıcı adınıız : " + kullaniciadi);
        System.out.println("şifreniz= " + Sifre1);
//input3;[kayıt Bitiş]	
        @SuppressWarnings({})
        Scanner input3 = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
        {
//input4;[Giriş]
            Scanner input4 = new Scanner(System.in);

            String kadi;
            String Sifre;
            System.out.print("Giriş yapmak için  Lütfen kullanıcı adı giriniz =");
            kadi = input1.next();
//[giriş devam]
            if (kadi.equals(kullaniciadi)) {
                System.out.println("Giriş başarılı , şimdi lütfen şifrenizi girin");
            } else {
                System.out.println("Başarısız");
                System.exit(1);
            }
            Scanner input5 = new Scanner(System.in);
            System.out.print("Lütfen şifrenizi girin =");
            Sifre = input5.next();
            if (Sifre.equals(Sifre1)) {
                System.out.println("şifre doğru , Teşekkür ederiz.Sayın " + kadi);
            }
            System.out.println("Lütfen Log' kaydına yazılacak herhangi bişey giriniz");
            bilgi = input5.next();
//[Giriş bitiş]{Log alma kayıt başlangıç}
            String path = "girisyapanlar.txt";
            File file = new File("dosya.txt");
            if (!file.exists()) {
                if (Sifre.equals(Sifre1));
                FileWriter file1 = new FileWriter(path);
                BufferedWriter writer = new BufferedWriter(file1);
                //{log alma Devam}
                Date simdikiZaman = new Date();
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                writer.write("saat : " + " " + simdikiZaman.toString());
                writer.write("Giriş yapan kullanıcılar \n");
                writer.write("kullanıcı adı :" + kadi);
                writer.write(" şifre:  " + Sifre + "\n");
                writer.write("Bilgi = " + bilgi);
                writer.close();
                //{Log alma bitiş}
                System.out.println("programın dizinine , TXT olarak giriş logları alındı ");
                Scanner input6 = new Scanner(System.in);
                //input6;{TXT log okutmak Başlangıç }
                for (int i = 0; i < 50; i++) ;
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    System.out.println("\nMenu\n");
                    System.out.println("(1) - Logu gör");
                    System.out.println("(2) - Çıkış yap ");
                    System.out.print("Please enter your selection:\t");
                    int selection = scanner.nextInt();
                    if (selection == 1) {
                    } else if (selection == 2) {
                        break;
                    }
                    File file2 = new File("girisyapanlar.txt");
                    BufferedReader reader = null;
                    reader = new BufferedReader(new FileReader(file2));
                    String satir = reader.readLine();
                    //{okuma Devam]	 
                    while (satir != null) {
                        System.out.println(satir);
                        satir = reader.readLine();
		//okuma Bitiş 
                        //PROGRAM FİNİSHED  ();
                    }
                }
            }
        }
    }
}
