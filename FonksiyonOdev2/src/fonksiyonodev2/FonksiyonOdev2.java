
package fonksiyonodev2;

import java.util.Scanner;

public class FonksiyonOdev2 {


    public static void main(String[] Args) {
     Scanner giris = new Scanner(System.in);
int sayi1,sayi2,secenek;
      double  sonuc;

System.out.println("Hangi islemi yapmak istiyorsunuz?\n1-Toplama\n2-Cikarma\n3-Bolme\n4-Carpma\n5-Cikis");
secenek=giris.nextInt();
while(secenek!=5)
{
System.out.println("1.sayiyi giriniz");
System.out.println("2.sayiyi giriniz");
sayi1=giris.nextInt();
sayi2=giris.nextInt();
if(secenek==1)
{
sonuc=daire(sayi1);
System.out.println(sayi1+ " yaricaplı dairenin alani = "+sonuc);
}
else if(secenek==2)
{
    sonuc=cikar(sayi1,sayi2);
System.out.println(sayi1+" - "+sayi2+" = "+sonuc);
}
else if(secenek==3)
{
    sonuc=bol(sayi1,sayi2);
System.out.println(sayi1+" / "+sayi2+" = "+sonuc);
}
else if(secenek==4)
{
sonuc=carp(sayi1,sayi2);
System.out.println(sayi1+" * "+sayi2+" = "+sonuc);
}
System.out.println("--------------------------------------------------------------");
    System.out.println("Ne tür bir islem yapmak istiyorsunuz?\n1-Daire\n2-Dikdortgen\n3-Ucgen\n4-Carpma\n5-Cikis");
secenek=giris.nextInt();
}
System.out.println("Pogramdan cikis yaptiniz");
System.exit(0);
    }
    static double daire(int x)
    {
    return x*x*3.14;
    }
    static int cikar(int x2,int y2)
    {
    return x2-y2;
    }
    static int bol(int x3,int y3)
    {
    return x3/y3;
    }
  static int carp(int x3,int y3)
    {
    return x3*y3;
    }
    
}
