package elifornek;
import java.util.Scanner;
public class ElifOrnek {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);    
   int sayi1=giris.nextInt();//integer turunde sayi tanimladik ve klavyeden girilecek bir tamsayiya atadik
   int sayi2=giris.nextInt();//integer turunde sayi2 tanimladik ve klavyeden girilecek bir tamsayiya atadik
   int sonuc=topla(sayi1,sayi2); //integer turundeki sonuca,topla fonksiyonuna gonderilen sayi1 ve sayi2 nin ciktisini atadik
   System.out.println("toplama"+sonuc);//bu sonucu ekrana yazdik
   
   sonuc=cikar(sayi1,sayi2); //integer turundeki sonuca,cikar fonksiyonuna gonderilen sayi1 ve sayi2 nin ciktisini atadik
   System.out.println("cikarma"+sonuc);//bu sonucu ekrana yazdik
    }
    static int topla(int temsilisayi1,int temsilisayi2){ //burda püf nokta returnle fonksiyon turu uyusmali..ve parantezler icine f(x,y) gibi temsili degerler sirayla yazilmalı
    return temsilisayi1 + temsilisayi2;//temsili degerleri kendi arasinde topla dedik yani kısaca f(x,y)=x+y gibi bir fonksiyon urettik
    }
     static int cikar(int temsilisayi1,int temsilisayi2){ //burda püf nokta returnle fonksiyon turu uyusmali..ve parantezler icine f(x,y) gibi temsili degerler sirayla yazilmalı
    return temsilisayi1 - temsilisayi2;//temsili degerleri kendi arasinde cikar dedik yani kısaca f(x,y)=x-y gibi bir fonksiyon urettik
    }
}
