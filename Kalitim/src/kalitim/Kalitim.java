
package kalitim;
public class Kalitim {
    private int ogrenciNo  = 0;
    public static void main(String[] args) {
   //nesne olusturup onunla cagırip calistiriyoruz
        Personel personelNesne = new Personel("impROS","impROS",19);
        System.out.println(personelNesne.getKimlikBilgileri());
        //toString metodunu cagirip calistiriyoruz
        System.out.println(personelNesne.toString()+"\n");
        //nesne olusturup onunla cagirip calistiriyoruz
        Ogrenci ogrenciNesne = new Ogrenci("Fenerbahce","Sampiyon",1907,2014);
        System.out.println(ogrenciNesne.getKimlikBilgileri());
        //toString metodunu cagirip calistiriyoruz
        System.out.println(ogrenciNesne.toString());
        
}
}