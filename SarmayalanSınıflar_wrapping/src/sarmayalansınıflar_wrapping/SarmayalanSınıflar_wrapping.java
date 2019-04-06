
package sarmayalansınıflar_wrapping;
import java.util.Arrays;

public class SarmayalanSınıflar_wrapping {

    public static void main(String[] args) {
        int[] dizi ={2,3};
        System.out.println("1."+Arrays.toString(dizi));
        denemeDizi(dizi);
        System.out.println("2."+Arrays.toString(dizi));
//    Integer i =new Integer(3);
//    deneme(i);
//        System.out.println("a = "+i);
    }
    public static void deneme(Integer sayi){
    sayi=sayi*sayi;
    }
    public static void denemeDizi(int[] dizi2){
    dizi2[0]=dizi2[0]*dizi2[0];
    dizi2[1]=dizi2[1]*dizi2[1];
    }
}
