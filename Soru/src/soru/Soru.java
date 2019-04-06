//impROS
//Banka İslem
package soru;
import java.util.Scanner;
public class Soru {

       
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
int bakiye=5000;
int secenek=0;
int istenilen=0;
int kontrol=0;
while(secenek!=4){
    System.out.println("Hangi İslemi Yapmak İstiyorsunuz?\n1.Para Cekme\n2.Para  Yatirma\n3.Bakiye Sorgulama\n4.Cikis");
secenek=giris.nextInt();

while(secenek>4) {
    System.out.println("Gecerli bir secim yapmadiniz,lutfen listeden yapmak istediginiz islemi seciniz");
    secenek=giris.nextInt();
            }
            
if(secenek==1){
     System.out.println("Cekmek istediginiz tutari yazin");
    istenilen=giris.nextInt();
kontrol=istenilen%10;
while(kontrol>0){
 System.out.println("Cekmek istediginiz tutar 10 ve 10 un katları olmalidir,lutfen tekrar giriniz");
istenilen=giris.nextInt();
kontrol=istenilen%10;
}
bakiye-=istenilen;
System.out.println(istenilen+" Tl cektiniz.Gecerli Bakiyeniz = "+bakiye+" Tl");
System.out.println("--------------------------------\n");
}

else if(secenek==2){
    System.out.println("Yatirmak istediginiz tutari yazin");
istenilen=giris.nextInt();
kontrol=istenilen%10;
while(kontrol>0){
 System.out.println("Yatirmak istediginiz tutar 10 ve 10 un katları olmalidir,lutfen tekrar giriniz");
istenilen=giris.nextInt();
kontrol=istenilen%10;
}

bakiye+=istenilen;
System.out.println(istenilen+" Tl Yatirdiniz.Gecerli Bakiyeniz = "+bakiye+" Tl");
System.out.println("--------------------------------\n");
}
else if(secenek==3){
    System.out.println("Gecerli Bakiyeniz = "+bakiye+" Tl");
    System.out.println("--------------------------------\n");
}
else if(secenek==4){
System.out.println("impROS Banki sectiginiz icin tesekkur eder,iyi gunler dileriz..");
System.exit(0);
}
}
    }
    
}
