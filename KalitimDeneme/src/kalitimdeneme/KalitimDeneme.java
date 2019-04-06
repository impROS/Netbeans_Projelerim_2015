
package kalitimdeneme;

public class KalitimDeneme extends SuperSinif{
    public static void main(String[] args) {

        
 KalitimDeneme d1=new KalitimDeneme();
 int sonuc;
 sonuc = d1.topla(4,2);//hem extends edilir,hem override edilir
 sonuc = d1.bol(4, 2);//bolme islemi extends edilir,fakat final olarak tanımlandigi icin override edilemez
 //sonuc = d1.carp(4, 2); //SuperSinifte carp metodu private olarak tanımlandığı için extends edilemez
sonuc = d1.cikar(4,2);//protected oldugu icin alt sinif tarafindan extends edilebilir ve override edilebilir.

    }

    @Override
    public int topla(int sayi1, int sayi2) {
        return super.topla(sayi1, sayi2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override//izin verilir
    protected int cikar(int sayi1, int sayi2) {
        return super.cikar(sayi1, sayi2); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override //izin verilmez
//    public int bol(int sayi1, int sayi2) {
//        return super.bol(sayi1, sayi2); //To change body of generated methods, choose Tools | Templates.
//    }

    

    
}
