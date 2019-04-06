package randomsayi22;

import java.util.Random;//Randomu import ettik
import java.util.Scanner;//Scanner ı import ettik

public class RandomSayi22
{

    public static void main(String[] args) 
    {
  Scanner giris=new Scanner(System.in);//giris adında bir scanner türü tanımladik
Random rastgele=new Random();//rastgele adinda bir random turu tanimladik

int tutulansayi;  //tutulan sayiyi hafizaya almak icin integer turunde bir deger tanimladik

tutulansayi=rastgele.nextInt(10);//random sınıfından 10 a kadar(10 dahil degil,cunku indexler 0 dan basliyor) atanacak olan bir degeri,tutulan sayiya esitledik

int tahmin;//kullanıcının girecegi degeri hafizada tutmak icin bir degisken tanimladik
int sayac=1;//kac defada bildigini anlamak icin bir sayac tanimladik ve bunu 1 e esitledik
System.out.println("BIR TAHMIN GIRIN");//kullanıcıyı bir deger girecegi konusunda bilgilendirdik
 tahmin = giris.nextInt();//tahmin adlı degerimizi,klavyeden girilecek olan bir integer degerine esitledik
     while(tahmin!=tutulansayi)//tahminle sayimiz uyusmadigi surece dedik
     {
         sayac++;//deneme sayisini tuttugumuz sayaci bir artir dedik
     if(tahmin>tutulansayi)//eger tahminimiz tutulan sayidan buyukse
     {
     System.out.println("Bilemediniz..Lutfen daha yukarida bir deger giriniz");//kullanicidan daha buyuk bir deger istedik
     }
      else if(tahmin<tutulansayi)//degilse ve eger tahmin tutulan sayidan kucukse
     {
     System.out.println("Bilemediniz..Lutfen daha yukarida bir deger giriniz");//daha asagida bir deger istedik
     }
     
        tahmin = giris.nextInt();//donguden cikabilmek icin tahmini tekrar girmesini istedik..dogru olana kadar surekli tahmin isteyecek..
     }
         System.out.println("Tebrikler dogru bildiniz. "+sayac+" defada bildiniz.");//while ın parantezlerinden cikinca,yani artık tahminimiz tutulan sayiya esit olunca
         //kullaniciyi tebrik ettik ve deneme sayisini gosterdik
    
}
