package rastgeletahmin;
import java.util.Random;
import java.util.Scanner;
public class RastgeleTahmin {

    public static void main(String[] args) {
Random rastgele = new Random();
Scanner giris = new Scanner(System.in);
int tutulansayi=rastgele.nextInt(10);
System.out.println("Bir tahminde bulununuz");
int tahmin = giris.nextInt();
int sayac=1;
while(tahmin!=tutulansayi)
{
    sayac++;
    if (tahmin<tutulansayi)
System.out.println("Daha buyuk bir sayi tahmin edin");
    else if(tahmin>tutulansayi)
        System.out.println("Daha kucuk bir sayi tahmin edin");
tahmin = giris.nextInt();
    }
System.out.println("TEBRIKLER "+ sayac+" DENEMEDE DOGRU BILDINIZ");
    }
    
}
