
package golankm;
import java.util.Scanner;
public class GolanKm {
    public static void main(String[] args) {
 ortalama();
    }
    public static void yaz(String yazi){
    System.out.println(yazi);
    }
    static void ortalama(){
        
           Scanner giris = new Scanner(System.in);
           int km=1,galon=1,ort,toplamkm = 0,toplamGalon=0;
           while(km!=0 || galon!=0){
           yaz("Km yi giriniz");
           yaz("cikis icin 0 yaziniz");
           km=giris.nextInt();
           if(km==0){
           break;
           }
           yaz("Galonu Giriniz");
           yaz("cikis icin 0 yaziniz");
           galon=giris.nextInt();
           if(galon==0){
           break;
           }
         ort=km/galon;
         yaz("Km\\yol="+ort);
         toplamkm=toplamkm+km;
         toplamGalon=toplamGalon+galon;
           }
           int sonuc=toplamkm/toplamGalon;
    yaz("Toplam yol-galon ortalaması"+sonuc);
    }
}

