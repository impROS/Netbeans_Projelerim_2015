
package kalitimornek;
public class Personel {
    //data alanlarımız
    private String adi;
    private String soyadi;
    private int yasi;
    
    //default yapilandiricilarımiz

    public Personel() {
        adi="isim yok";
        soyadi ="soyadi yok";
        yasi =0;
    }
    
    //parametre alan yapılandırıcı

    public Personel(String adi, String soyadi, int yasi) {
        this.adi = adi;
        this.soyadi = soyadi;
       setYasi(yasi);
       //this.yasi=yasi;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
    //islev taşıyan metodumuzu oluşturuyoruz
    
    public String getKimlikBilgileri(){
    return "Bilgiler: İsim: "+adi+" Soyadi: "+soyadi+" Yaşi "+yasi;
    }
   //toString metodumuzu çağırıp düzenleyelim

    @Override
    public String toString() {
        return "Bilgiler: "+adi+" "+soyadi+ " "+yasi;
                }
   
}
