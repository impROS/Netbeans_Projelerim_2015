
package kalitim2;
public class Ogrenci extends Personel{
    private int ogrenciNo = 0;
  //default yapilandiriciyi olusturup super sinifin default yapilandiricisini cagirdik
      //personel sinifinda bulunmayan ogrenci no degiskenini tanimladik
    public Ogrenci(){
        super();
        ogrenciNo =0;
    }
    //parametre alan yapilandirici v super sinifin yapilandiricini cagirdik
    public Ogrenci(String adi,String soyadi,int yasi,int ogrenciNo){
    super(adi,soyadi,yasi);
    setOgrenciNo(ogrenciNo);
    }
    //getter ve setter ile metotları olusturduk
    
    public int getOgrenciNo(){
    return ogrenciNo;
    }
    public void setOgrenciNo(int ogrenciNo){
    if(ogrenciNo < 0){
    } 
    
}    
    
    //islevi calistiran metodu cagirdik ve eksik olan ogrenci no bilgisini ekledik
    @Override
    public String getKimlikBilgileri(){
    return super.getKimlikBilgileri()+"Ogrenci No :"+ogrenciNo;
    }
}
