
package personeldene;
import java.util.Scanner;
public class PersonelDene {
public static void main(String[] args){
    Scanner giris = new Scanner(System.in);
Personel bilgisayarMuhBlmBaskani;
//nesneyi olusturur
bilgisayarMuhBlmBaskani=new Personel();
bilgisayarMuhBlmBaskani.isim="Ridvan2";
//System.out.println("Calistigi Gun Sayisini Giriniz");
yaz("Personel ismi Giriniz");
 String isim= giris.next();
yaz("Calistigi Gun Sayisini Giriniz");

int calistigiGun=giris.nextInt();
//System.out.println("Gunluk maasi giriniz");
yaz("Gunluk maasi giriniz");
int gunlukMaas=giris.nextInt();

bilgisayarMuhBlmBaskani.maasHesabi(gunlukMaas,calistigiGun,isim);

bilgisayarMuhBlmBaskani.ePostaYollama();
}
 static void yaz(String yazi){
System.out.println(yazi);
}
}