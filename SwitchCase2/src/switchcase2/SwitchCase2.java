package switchcase2;
import java.util.Scanner;//Scanneri import ettik
public class SwitchCase2
{
    public static void main(String[] args) 
    {
  Scanner giris = new Scanner(System.in);// scanner turunde ve giris adında bir deger tanimladik
  System.out.println("5 e kadar bir secenek girin");
  int secenek=giris.nextInt();//integer turunde,secenek adlı degerimizi klavyeden girilecek olan bir integer degerine esitledik
  switch(secenek)//burda hangi secenek havuzu icinden secim yapacagimizi belirtiyoruz..Biz secenek havuzunu kullanıcının girecegi degerlere gore belirledik
  {
      case 1:System.out.println("1 i sectiniz");//secenek=1 ise program direkt buraya dallanacak 
          break;//1.secenek calistiktan sonra program bu komutu gorunce duracak..asagiya bakmayacak hic
      case 2:System.out.println("2 yi sectiniz");//secenek=2 ise program "direkt" buraya dallanacak yani 1 deki komutlara bakmayacak bile
          break;//2.secenek calistiktan sonra program duracak..
      case 3:System.out.println("3 u sectiniz");//secenek=3 ise program direkt buraya dallanacak 
          System.out.println("buraya 3 seceneğin devamı halinde kodlar yazabilirsiniz..Break e kadar istediginiz kadar kod yazarsınız..");
          break;
      case 4:System.out.println("4  u sectiniz,fakat break koymadiginiz icin 5.secenek de isledi");//secenek=4 ise program direkt buraya dallanacak 
          //buraya break yazmadıgım icin program devam edecek.Break komutu programın durmasını saglar..bunu yazmazsak program asagiya dogru calismaya devam eder
      case 5:System.out.println("5 i secmeden,4 u secsem dahi bu kod islenecek cunku break komutu yok,o yuzden kod asagiya dogru devam ediyor");
          break;
  }
    } 
}
