
package personeldene;
public class Personel {
public String isim;
public String sicilNo;
public String vergiNo;
public String ePosta;

    public void maasHesabi(int Gun,int Maas,String isim)
    {
        
        int sonuc=Gun*Maas;
    System.out.println(isim+"'in maası ==>"+sonuc);
    }
    public void ePostaYollama(){
        System.out.println(isim);
        System.out.println("e posta yollandı");
    }
}