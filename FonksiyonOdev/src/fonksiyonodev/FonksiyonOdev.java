
package fonksiyonodev;

import java.util.Scanner;

public class FonksiyonOdev {

 
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
int sayi1 = 0,sayi2 = 0,secenek;
      double  sonuc;

System.out.println("Ne tür bir islem yapmak istiyorsunuz?\n1-Dairenin Alani\n2-Dikdortgenin Alani\n3-Ucgenin Alani\n4-Silindirin Alani\n5-Cikis");
secenek=giris.nextInt();
while(secenek!=5)
{
if(secenek==1)
{
    System.out.println("Yaricapi giriniz");
    sayi1=giris.nextInt();
sonuc=daire(sayi1);
System.out.println(sayi1+ " yaricaplı dairenin alani = "+sonuc);
}
else if(secenek==2)
{
       System.out.println("1.kenarı giriniz");
    sayi1=giris.nextInt();
           System.out.println("2.kenarı giriniz");
    sayi2=giris.nextInt();
    sonuc=dikdortgen(sayi1,sayi2);
System.out.println("Kenarlari "+sayi1+" ve "+sayi2+ " olan dikdortgenin alani = "+sonuc);
}
else if(secenek==3)
{
           System.out.println("Taban uzunlugunu giriniz");
    sayi1=giris.nextInt();
           System.out.println("Yuksekligi giriniz");
    sayi2=giris.nextInt();
    sonuc=ucgen(sayi1,sayi2);
System.out.println("Taban uzunlugu "+sayi1+" olan ve Yuksekligi "+sayi2+" olan ucgenin alani = "+sonuc);
}
else if(secenek==4)
{
           System.out.println("Yaricapi giriniz");
    sayi1=giris.nextInt();
           System.out.println("Yuksekligi giriniz");
    sayi2=giris.nextInt();
sonuc=silindir(sayi1,sayi2);
System.out.println("Yaricapi "+sayi1+" olan ve Yuksekligi "+sayi2+" olan silindirin yuzey alani = "+sonuc);
}
System.out.println("--------------------------------------------------------------");
    System.out.println("Ne tür bir islem yapmak istiyorsunuz?\n1-Dairenin Alani\n2-Dikdortgenin Alani\n3-Ucgenin Alani\n4-Silindirin Alani\n5-Cikis");
secenek=giris.nextInt();
}
System.out.println("Pogramdan cikis yaptiniz");
System.exit(0);
    }
    static double daire(int x)
    {
    return x*x*3.14;
    }
    static int dikdortgen(int x2,int y2)
    {
    return x2*y2;
    }
    static int ucgen(int x3,int y3)
    {
    return (x3*y3)/2;
    }
  static double silindir(int x3,int y3)
    {
    return 2*x3*y3*3.14;
    }
    
}
