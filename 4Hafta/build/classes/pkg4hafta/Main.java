
package pkg4hafta;
//<editor-fold defaultstate="collapsed" desc="Kutuphaneler">
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//</editor-fold>

public class Main {
    public static int []satisSayisi0={0,0,0,0,0};
    public static int []satisSayisi1={0,0,0,0,0};
    public static  int []satisSayisi2={0,0,0,0,0};
    public static  int []satisSayisi3={0,0,0,0,0};
    public static String urunler[]=new String[5];
public static Scanner giris=new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException, AWTException  {
      yaz("impROS Pazarlama A.S ne Hosgeldiniz");
        String isim[]=new String[4];
       
      
           int secilen1,secilen2,secim;
       urunGir(urunler);
      //  System.out.println(Arrays.toString(urunler)+"");

   System.out.println("Urunler = "+Arrays.toString(urunler)+"");
   //yaz("calisti2");
       saticiGir(isim);
       System.out.println("Satici İsimleri = "+Arrays.toString(isim)+"");
       while(1==1){
    secim= menu();
   if(secim==1){
        yaz("Lutfen Urunu satan saticiyi seciniz");
    secilen1=listele(isim,"Satici")-1;
         yaz("Lutfen Satmak İstediginiz Urunu seciniz");
     secilen2=(listele(urunler,"Urun"))-1;
  urunArtir(secilen1,secilen2);

    }
   else if(secim==2){
         yaz("Lutfen Urunu satan saticiyi seciniz");
    secilen1=listele(isim,"Satici")-1;
   saticiSorgulama(secilen1);
   
   }
   else if(secim==3){
       yaz("impROS Pazarlama A.S iyi Gunler Diler..Tekrar Bekleriz..");
   System.exit(0);
   }
       }
   }
    //<editor-fold defaultstate="collapsed" desc="Yazi Yazma Metodu">
    public static void yaz(String yazi){
        System.out.println(yazi);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Urun Gir">
    public static void urunGir(String[] urunler2) throws InterruptedException, AWTException {
    for(int i=0;i<5;i++){
        yaz((i+1)+".Urunun Adini Giriniz");
    urunler2[i]=giris.next();
    }
   
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Satici Gir">
        public static void saticiGir(String[] saticilar) throws InterruptedException, AWTException {
    for(int i=0;i<4;i++){
        yaz((i+1)+".Saticinin Adini Giriniz");
    saticilar[i]=giris.next();
    }
    ekranSil();
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Menu">
        public static int menu(){ 
           
            Scanner giris2 =new Scanner(System.in);
            int secim = 0;
          System.out.println("Lutfen Seciminizi Yapiniz\n1.Urun Sat\n2.Satici Sorgula\n3.Cikis");
    secim=giris2.nextInt();
   
    return secim ;
        }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Ekrani Silme">
      
      
        public final static void ekranSil() throws InterruptedException, AWTException{//ctrl+l ekrani siliyor
{
            ThreadB b = new ThreadB();
            b.start();
            synchronized(b){
                try{
           try{
                    Robot pressbot = new Robot();
  pressbot.keyPress(17);
    pressbot.keyPress(76); //  L ye bas.
   pressbot.keyRelease(17);
   pressbot.keyRelease(76);
   } catch (AWTException ex) {
    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
}
                b.wait();
                
            }catch(InterruptedException e){
                yaz("hata");
            }
 
           yaz("** impROS Pazarlama A.S **");
        }
    }

 
   
    
 //Runtime.getRuntime().exec("cls"); 
 

}
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Listele">
        public static int listele(int[] dizi,String isim){
        for(int i=0;i<dizi.length;i++){
        yaz((i+1)+". "+isim+" = "+dizi[i]);
        }
        int secim =giris.nextInt();
        return secim;
        }
             public static int listele(String[] dizi,String isim){
        for(int i=0;i<dizi.length;i++){
        yaz((i+1)+". "+isim+" = "+dizi[i]);
        }
        int secim =giris.nextInt();
        return secim;
        }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Urun Artirma">
                 public static void urunArtir(int kisi,int urun){
   if(kisi==0){
   satisSayisi0[urun]++;
   }
   else if(kisi==1){
   satisSayisi1[urun]++;
   }
   else if(kisi==2){
  satisSayisi2[urun]++;
   }
   else if(kisi==3){
   satisSayisi3[urun]++;
   }
   yaz("Urun Kaydi Basarili");
     }
  
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Satici Sorgulama">
                                  public static void saticiSorgulama(int kisi){
   if(kisi==0){
     for(int i=0;i<5;i++){
       yaz(urunler[i]+" ==> "+satisSayisi0[i]+" Tane Satildi.");
       }
   }
   else if(kisi==1){
        for(int i=0;i<5;i++){
       yaz(urunler[i]+" ==> "+satisSayisi1[i]+" Tane Satildi.");
       }
   }
   else if(kisi==2){
    for(int i=0;i<5;i++){
       yaz(urunler[i]+" ==> "+satisSayisi2[i]+" Tane Satildi.");
       }
   }
   else if(kisi==3){
    for(int i=0;i<5;i++){
       yaz(urunler[i]+" ==> "+satisSayisi3[i]+" Tane Satildi.");
       }
   }
     }
//</editor-fold>
                                
}