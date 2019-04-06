
package donusummain;
public class DonusumMain {

    public static void main(String[] args) {
    Cevirim donusumIslemleri=new Cevirim();
    
    double sonuc =donusumIslemleri.kilometredenMetreye(1);
        System.out.println("1 Kilometre = "+sonuc+" metre");
        
        sonuc=donusumIslemleri.metredenKilometreye(10000);
        System.out.println("10000 metre ="+sonuc+" Kilometre");
        
    }
    
}
