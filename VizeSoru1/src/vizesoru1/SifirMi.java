//impROS

//SifirMi classi
package vizesoru1;
public class SifirMi {
    
    boolean sifirMi(int[] dizi1){ //boolean turunde,yani true veya false donduren,sifirMi adinda bir metot tanimladik
        
    int ilkEleman = dizi1[0]; // dizi1 in 0 .indexine ilkEleman dedik ve bunu hafizada tuttuk
    int sonEleman = dizi1[dizi1.length-1];//dizi1 in "eleman uzunlugunun" 1 eksigine de sonEleman dedik. -1 yapmamizin sebebi indexlerin sifirdan baslamasi
    
    if(ilkEleman==0 && sonEleman==0){//eger ilk eleman ve son eleman sifira esitse
    return true;//true dondur
    }
    else{//degilse
    return false;//false dondur
    }
    }
}
