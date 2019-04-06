package ikiboyutludiziler2;//impROS
import java.util.Scanner;
public class IkiBoyutluDiziler2 {
public static void main(String[] args) {
    Scanner giris = new Scanner(System.in);
  //java da 2 boyutlu dizilerin kullanimi da 1 boyutlu dizilere benzerdir..Tanimlama su sekil yapilir
    //diziTuru[][] diziAdi = new diziAdi [satir genisligi] [sutun genisligi];  Ornek olarak 2 ye 3 luk bir matris tanimlayalım
    int[][] Sayilar = new int[2][3];
    int satir,sutun;//dizinin satir ve sutunlarini tanimladik
    for( satir=0;satir<2;satir++){//Dizinin satir kismini tanimladik.Dizi  0-1 olunca calisacak..yani toplam 2 defa
        for( sutun=0;sutun<3;sutun++){//Simdi de sutun kismini tanimladik..Simdi sirayla sutunlara deger atayacagiz
        System.out.println("Lutfen "+satir+" , "+sutun+" daki elemanı giriniz");
        Sayilar[satir][sutun]=giris.nextInt();
        }
    }
        //simdi bu degerleri sirasiyla gosterelim
        for(satir=0;satir<2;satir++){
        for(sutun=0;sutun<3;sutun++){
         System.out.println("Lutfen "+satir+" , "+sutun+" daki eleman = "+Sayilar[satir][sutun]);
        }
        }
    } 
}//impROS
