
package kalitimornek;

public class Ogrenci extends Personel{
    private int ogrenciNo =0;
    
    //default yapılandırıcıyı oluşturup süper sınıfın default yapılandırıcını çağırdık
    //personel sınıfında bulunmayan öğrenci no değişkenini ekliyoruz

    public Ogrenci() {
        super();
        ogrenciNo=0;
    }
    //parametre alan yapılandıcı ve super sınıfın yapılandırıcısını çağırdık

    public Ogrenci(String adi, String soyadi, int yasi,int ogrenciNo) {
        super(adi, soyadi, yasi);
        this.ogrenciNo=ogrenciNo;
        
    }
    public int getOgrenciNo(){
    return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
      if(ogrenciNo < 0){
      
      }
    
    }
    //islevi çağıran metodumuzu çağırdık ve eksi olan ogrenci no bilgisini ekledik

    @Override
    public String getKimlikBilgileri() {
        return super.getKimlikBilgileri()+" Ogrenci No:"+ogrenciNo; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString()+" No: "+ogrenciNo; //To change body of generated methods, choose Tools | Templates.
    }

}
