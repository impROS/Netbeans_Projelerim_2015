package soyutsiniflar;

public abstract   class SoyutSinif {//sınıfın soyut oldugunu belirtmek icin abstract yazıyoruz
    public abstract void alanHesapla();//alt sınıf bunu override etmek zorunda
    
    public void daireHesapla(){//bunu override etmese de olur
        System.out.println("Daire Hesaplandi");
    }
}
