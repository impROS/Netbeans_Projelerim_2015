
package kacbuyukharfvar;
import java.util.Scanner;
public class KacBuyukHarfVar {

    public static void main(String[] args) {
Scanner giris = new Scanner(System.in);

        System.out.println("Lutfen bir yazi yaziniz");
        String yazi=giris.next();
        
System.out.println("\" "+yazi+" \" kelimesinin icinde "+buyukHarfSayaci(yazi)+" kadar buyuk harf vardir");
    }
    //metodumuz
    static int buyukHarfSayaci(String yazi){
        int sayac=0;
        for(int i=0;i<yazi.length();i++){
        if(Character.isUpperCase(yazi.charAt(i))){
        sayac++;
        }
        }
    return sayac;
    }
}
