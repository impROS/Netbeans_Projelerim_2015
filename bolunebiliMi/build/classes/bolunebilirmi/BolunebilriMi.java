package bolunebilirmi;
import java.util.Scanner;
public class BolunebilriMi {
public static void main(String[] args) {
       Scanner giris = new Scanner(System.in);
       int sayi1,sayi2;
       boolean kontrol=true;
       kontrolNoktasi1 :do{
        System.out.println("1.sayiyi giriniz");
         sayi1=giris.nextInt();
        if(sayi1==0){
            kontrol=false;
            System.out.println("Sayi 0 olamaz.Lutfen baska bir sayi giriniz");
            continue kontrolNoktasi1;
        }
        kontrol=true;
       }while(!kontrol);
       //2.sayiyi istiyoruz
         kontrolNoktasi2 :do{
        System.out.println("2.sayiyi giriniz");
         sayi2=giris.nextInt();
        if(sayi2==0){
            kontrol=false;
            System.out.println("Sayi 0 olamaz.Lutfen baska bir sayi giriniz");
            continue kontrolNoktasi2;
        }
        kontrol=true;
       }while(!kontrol);
         String sonuc =bolunebilirMi(sayi1,sayi2) ? "Bolenebilir":"Bolunemez";
         System.out.println(sayi1+" - "+sayi2+" birbirine "+sonuc);}
    static boolean bolunebilirMi(int sayi1,int sayi2){
        return !(sayi1%sayi2!=0 && sayi2%sayi1!=0);
    }
}