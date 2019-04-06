package donusum;
public class Donusum {
    public static void main(String[] args) {
KilometreMetre cevirim = new KilometreMetre();

double sonuc =cevirim.KilometredenMetreye(1);
        System.out.println("1 Kilometre = "+sonuc+" metre");
        
        sonuc=cevirim.KilometredenMetreye(1.4);
        System.out.println("1.4 Kilometre = "+sonuc+" metre");
             
        sonuc=cevirim.MetredenKilometreye(10000);
        System.out.println("10000 Metre = "+sonuc+" kilometre");
        
        sonuc=cevirim.MetredenKilometreye(100.7);
        System.out.println("100.7 Metre = "+sonuc+" kilometre");
        
    }
    
}
