
package sifirkontrol;


public class SifirMi {
    boolean SifirMiDegilMi(int[] dizi){
    int ilkEleman=dizi[0];
    int sonEleman=dizi[dizi.length-1];
    
    if(ilkEleman==0 && sonEleman==0){
    return true;
    }
    else{
    return false;
    }
        
    }
}