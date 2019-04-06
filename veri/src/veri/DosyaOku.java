/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri;
import java.io.FileInputStream; // Dosya okuma için gerekli kütüphane.

public class DosyaOku{
    public static void main(String []vars) {
        
        FileInputStream fis;
        int b = -1;
        int kac_byte = 0;
        // Dosya işlemlerinde kesinlikle try cach kullanılması gerekmektedir. Bunun nedeni ise her hangi bir işlemden dolayı dosyaya erişme, yazma, okuma gibi durumlardaki hataları sistemin algılaması gerekmektedir.
        try {
            fis = new FileInputStream("c:\\veri.txt");  //dosyamız d sürücüsünde ve veri.txt adında.

            do{ // Dosya sonuna kadar onumak için yaptımız do while döngüsü.
                b = fis.read();
                if (b!=-1)
                {
                    System.out.print((char)b ); // Tum karekterleri ekrana yazdırıyoruz.
                }
            }while( b!=-1);
            System.out.println( " Dosya boyutu:" + kac_byte ); // Yazım işlemi bittikten sonra bir boşluk bırakarak dosya boyutunu giriyoruz.
            fis.close();

        } catch (Exception e) {
            System.out.println("Invalid file operation"); // Eğer işlem sırasında bir hata oluşursa bunu konsol ekranında bildirelim.
            
        }
    }
}