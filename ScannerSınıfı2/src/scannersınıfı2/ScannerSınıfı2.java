package scannersınıfı2;
import java.util.Scanner;

public class ScannerSınıfı2 {


    public static void main(String[] args)
    {
     Scanner giris =new Scanner(System.in);
     int sayi1,sayi2,sonuc;
     sayi1=giris.nextInt();
     sayi2=giris.nextInt();
     sonuc=sayi1*sayi2;
     System.out.println(sonuc);
    }
    
}
