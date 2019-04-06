package bolunebilirmi2;
import java.util.Scanner;
public class BolunebilirMi2 {
public static void main(String[] args) {
       Scanner giris = new Scanner(System.in);
       int sayi1=0,sayi2=0;
       boolean kontrol=false;
    while(!kontrol){//kontrol yanlis oldugu surece
        System.out.println("1.sayiyi giriniz");
         sayi1=giris.nextInt();
        if(sayi1==0){//eger sayi sifir ise
            System.out.println("Sayi 0 olamaz.Lutfen baska bir sayi giriniz");
        }
        else{//sayi sifir degilse kontrolu true yap ve donguyu bitir
            kontrol=true;
        }
       }
       //2.sayiyi istiyoruz
    kontrol=false;//donguye girilmesi icin tekrar kontrolu false yapiyoruz
    while(!kontrol){//kontrol yanlis oldugu surece
        System.out.println("2.sayiyi giriniz");
         sayi2=giris.nextInt();
        if(sayi2==0){//eger sayi sifir ise
            System.out.println("Sayi 0 olamaz.Lutfen baska bir sayi giriniz");
        }
        else{//sayi sifir degilse kontrolu true yap ve donguyu bitir
            kontrol=true;
        }
       }
         String sonuc =bolunebilirMi(sayi1,sayi2) ? "Bolenebilir":"Bolunemez";
         System.out.println(sayi1+" - "+sayi2+" birbirine "+sonuc);
}
    static boolean bolunebilirMi(int sayi1,int sayi2){
        return !(sayi1%sayi2!=0 && sayi2%sayi1!=0);
    }
}