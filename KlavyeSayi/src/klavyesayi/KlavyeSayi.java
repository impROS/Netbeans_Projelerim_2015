//impROS
//TahminOyunu
package klavyesayi;
import java.util.Scanner; //Scanneri import ediyoruz
import java.util.Random; //Random u import
public class KlavyeSayi {
public static void main(String[] args) {
    
     Scanner giris = new Scanner(System.in);//giris adinda ve Scanner turunde bir degisken olusturduk
     Random rastgele = new Random(); // rastgele adinda bir Random turu tanımladik
     
     int rastgelesayi = rastgele.nextInt();//rastgele isimli random sınıfından uretilen random sayiyi,rastgelesayi adli integer degerinde hafızaya aldik
          System.out.println("bir tahmin girin");///kullaniciyi tahmin girmesi konusunda bilgilendirdik
     int tahmin = giris.nextInt();//klavleyeden girilecek olan bir integer turunde degiskeni,yine integer turundeki tahmin adli degerimizde tuttuk..
     
     while(tahmin!=rastgelesayi){//"tahmin esit olmadigi surece" donguyu tekrarla..
     if(tahmin<rastgelesayi){//eger tahmin kucukse rastgelesayi dan
     System.out.println("Daha yukarida bir tahmin girin");///daha yukarida tahmin uret yaz
     }
     else if(rastgelesayi<tahmin){//degilse,ve eger rastgelesayi kucukse tahmin den
          System.out.println("Daha asagida bir tahmin girin");//daha asagida tahmin uret yaz
     }
     tahmin = giris.nextInt();// en son da tahmin degerini tekrar girmesini iste ki donguden cikabilsin
     }
   System.out.println("Tebrikler dogru bildiniz");//donguden ciktiginda,yani "while(tahmin!=rastgelesayi) kosulu uymadigi zaman;yani tahmin=rastgele sayi oldugunda 
   //tebrikler dogru bildiniz yaz
    }
    
}
