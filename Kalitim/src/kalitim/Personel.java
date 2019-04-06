
package kalitim;
public class Personel {
    //data alanları
    public String adi;
   public String soyadi;
    public int yasi;
    
    //default yapılandırıcı
    public Personel(){
    adi="isim yok";
    soyadi = "Soyadi yok";
    yasi =0;
    }
    
    //parametre alan yapilandirici
    public Personel(String adi,String soyadi,int yasi){
    this.adi = adi;
    this.soyadi = soyadi;
    setYasi(yasi);
    //this.yasi = yasi;
    }
    //getter ve setter ile asagidaki metotlari olusturduk
    //yas  degiskeninin negatif deger almaması icin gerekli islemleri yaptik
    public void setYasi(int yasi){
    if(yasi < 0){
    this.yasi = 0;
    }else{
    this.yasi=yasi;
    }
    }
    public String getAdi(){
        return adi;
        
    }
    public void setAdi(String adi){
    this.adi = adi;
    }
    
    public String getSoyadi(){
    return soyadi;
    }
    
    public void setSoyadi(String soyadi){
    this.soyadi=soyadi;
    }
    public int getYasi(){
    return yasi;
    }
    //islev tasiyan metodu olusturuyoruz
    public String getKimlikBilgileri(){
    return "Bilgiler :İsim:"+adi+"Soyadi : "+soyadi+"Yasi : "+yasi;
    }
    
    //toString metodunu cagirip duzenleyelim

    @Override
    public String toString() {
        return "Bilgileri : "+adi+" "+soyadi+ ""+yasi;
    }
    
    
}
