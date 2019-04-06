
package sıralama2;

import java.util.Arrays;

public class Sıralama2 {
int adim=0;
    public static void main(String[] args) {
int[] dizi={1,2,3,4};
Sıralama2 s1=new Sıralama2();
s1.sirala(dizi);
        System.out.println(Arrays.toString(dizi));
        System.out.println("Adim Sayisi = "+s1.adim);
    }
    void degis(int ilk,int ikinci,int[] dizi){
    int temp =dizi[ilk];
    dizi[ilk]=dizi[ikinci];
    dizi[ikinci]=temp;
    }
    int i=0;int j=0;
    
    void sirala(int[] dizi){
    for(int i=0;i<dizi.length;i++){
    for(int j=0;j<dizi.length;j++){
    if(dizi[i]<dizi[j]){
        //if(i==dizi.length-1){j++;}
        degis(i, j, dizi);
        
        //adim++;break;
    }
    adim++;
    }
    }
    }
    
}
