
package metotla;

public class Metotla {
    public static void main(String[] args) {
   
      int[] dizi={53,5,5};
boolean sonuc=DiziKontrol(dizi);
       System.out.println("sonuc= "+sonuc);
    }
    
    
    
     static boolean DiziKontrol(int[] dizi){
    if(dizi[0]==0 && dizi[dizi.length-1]==0){
    return true;
    }
    else
        return false;
    }
     
     
     
}
