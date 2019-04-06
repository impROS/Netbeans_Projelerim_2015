
package denefonksiyon;//bu programın kendi ürettiği adı
import java.util.Scanner;//bu da klavyeden giris yapilmasıni sağlıyor

public class DeneFonksiyon {

    public static void main(String[] args)
            /* bu ve alt satırlarda metot calistirarak kullanıcıdan deger alıyor 
            ve bunu surekli soruyor..normalde kapanır bir kere islem yaptıktan sonra ama fonksiyon seklinde 
            yapınca sonsuz donguye giriyor,o yüzden ben de fonksiyonla yaptım ki kapanmasın hemen..*/
    {
        int x = 0,z = 0;
        //do{
        DegerAlma(x,z);
        //}while(1==1);
    }
    public static int toplama(int a,int b)
{
int c;
        c=a+b;
System.out.println(a+" + "+b+" = "+c);
     return c;
    }
        public static int DegerAlma(int k,int l)
{
    try {
Scanner klavye =new Scanner(System.in);
        
        System.out.println("Lutfen ilk sayiyi giriniz");
        k=klavye.nextInt();
        
        System.out.println("Lutfen ikinci sayiyi giriniz");
        l=klavye.nextInt();
      int sonuc;
      sonuc=k+l;
      System.out.println("sonuc = "+sonuc);
        return 0;
    }
    catch(Exception e ){
     System.out.println("Hata verdi");
     int h = 0,j = 0;
     DegerAlma(h,j);
       return 0;  
    }

    }
}
