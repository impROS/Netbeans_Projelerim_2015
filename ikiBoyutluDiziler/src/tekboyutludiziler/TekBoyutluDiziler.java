package tekboyutludiziler;//impROS
import java.util.Scanner;
public class TekBoyutluDiziler {
public static void main(String[] args) {
    Scanner giris = new Scanner(System.in);
    //tek boyutlu dizi tanimlaması su sekil olur ==> diziTuru[] DiziAdi = new diziTuru[diziBoyutu];
    //Ornegin 3 tane isim  alan bir string dizisi olusturalım
    String[] isim=new String[3];
    //Simdi buna for dongusuyle  klavyeden deger aktaralım
    for(int i=0;i<3;i++){//index  0 dan basladigi icin 0 dedik ve 3 kadar calissin bu dongu dedik..yani toplamda 0-1-2 olunca calisacagi icin 3 defa calisacak
            System.out.println("Dizinin " +(i+1)+".Elamanı Giriniz");
    isim[i]=giris.next();//burda isim adli String dizisinin i. elamanına klavyeden girilecek olan bir String degerini atadik
    }
    //Simdi bu degerleri ekranda gosterelim
    for(int j=0;j<3;j++){
    System.out.println("Dizinin " +(j+1)+".Elamanı = "+isim[j]);
    }
    }
}//impROS
