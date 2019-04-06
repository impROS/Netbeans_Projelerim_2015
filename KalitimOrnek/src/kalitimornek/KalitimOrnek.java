
package kalitimornek;
public class KalitimOrnek {
    public static void main(String[] args) {
        //nesne oluşturup onunla çağırıp çalıştırıyoruz
        Personel personelNesne = new Personel("Rıdvan","Akar",20);
        System.out.println(personelNesne.getKimlikBilgileri());
        //toString metodunu çağırıp çalıştırıyoruz
        System.out.println(personelNesne.toString()+ "\n");
        
        //nesne oluşturup onunla çağırıp çalıştırıyoruz
        Ogrenci ogrenciNesne =new Ogrenci("ORıdvan", "Akar", 20, 546);
        System.out.println(ogrenciNesne.getKimlikBilgileri());
        //toString metodunu çağırıp çalıştırıyoruz.
        System.out.println(ogrenciNesne.toString());
        
        Ogrenci o2=new Ogrenci();
        System.out.println("\n"+o2.toString());
       
        
    }
    
}
