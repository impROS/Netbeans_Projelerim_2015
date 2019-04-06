package randomnida;
import java.util.Random; //şimdi burda Random sınıfını kullanabilmek için import ettik
import java.util.Scanner;//burda da klavyeden sayı girebilmek için Scanner sınıfımızı import ettik..kitaplar önümüzde şu an yani..
public class RandomNida 
{
    public static void main(String[] args) 
    {
        Scanner giris =new Scanner(System.in);//burda scanner sınfımızı tanımlayarak,onu kullanmaya hazır hale getirdik
Random rastgeleNida = new Random();//burda da random sınıfımızı tanımladık

int tahminEdilenSayi,bilgisayarinTuttuguSayi;//burda iki tane değer tanımladık integer(sayi) değerinde..bunları tahmin ve bilgisayarın ürettiği 

bilgisayarinTuttuguSayi=rastgeleNida.nextInt(10); 
    
tahminEdilenSayi =giris.nextInt();//burda da klavyeden tahmin girilmesini istedik

while( tahminEdilenSayi!= bilgisayarinTuttuguSayi )//burda da dedik ki tahminle sayi uyuşmadığı sürece şu kodu çalıştır
        {
    System.out.println("Yanlis tahmin girdiniz");
        tahminEdilenSayi= giris.nextInt();//klavyeden tahmin edilen sayiyi gir

        }
System.out.println("Tebrikler Dogru Bildiniz-Usta Nida ");
    }
    
}
