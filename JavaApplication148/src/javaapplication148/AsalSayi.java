
package javaapplication148;
import java.util.Scanner;//Scanneri import ettik(sayiyi kullanici girecek cunku,biz sabit olarak belirlemeyecegiz yani )
public class JavaApplication148 {
public static void main(String[] args) {
Scanner giris = new Scanner(System.in);//giris adında bir Scanner türü tanimladik

int sayi,yedeksayi,i;//bir sayi ve bu sayiyi klonlayacagimiz yedeksayi tanimladik
sayi=giris.nextInt();//sayiyi klavyeden girilecek olan bir integer degerine esitledik
yedeksayi=sayi;//sayimizi,yedeksayi adli integer degerimize yedekledik
for(i=2;i<=sayi;i++){//i=2 ve i kücük esit olana kadar sayidan,donguyu tekrarla ve i yi bir artir dedik
if(yedeksayi==2){//eger yedek sayimiz 2 ise 
System.out.println("Asal");//asal dir yaz
break;//programi durdur
}
yedeksayi--;//yedek sayiyi bir azalt..
if(sayi%i==0){//sayimizin "i" ile modundan kalan 0 ise
System.out.println("Asal degil");//sayi asal degil yazdik
break;//dur dedik
}
    }
    }
}

