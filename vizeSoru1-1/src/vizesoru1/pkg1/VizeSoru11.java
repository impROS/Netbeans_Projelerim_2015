//impROS
package vizesoru1.pkg1;
public class VizeSoru11 {
 public static void main(String[] args) {
       int[] dizi1={3,4,2,1};
       
       int sonuc;
       sonuc=elemanCarpim(dizi1);
        System.out.println("Dizinin Elemanlarının Carpimi = "+sonuc);
        
        sonuc=kareToplam(dizi1);
        System.out.println("Dizinin Elemanlarının karelerinin toplamı = "+sonuc);
    }
    
  static int elemanCarpim(int[] dizi2){
  int carpimSepeti=1;
  for(int i=0;i<=dizi2.length-1;i++){
  carpimSepeti=carpimSepeti*dizi2[i];
  }
  return carpimSepeti;
  }  
 
  static int kareToplam(int[] dizi3){
  int elemanKare;
  int kareToplam=0;
  for(int i=0;i<=dizi3.length-1;i++){
  elemanKare=dizi3[i]*dizi3[i];
  kareToplam=kareToplam+elemanKare;
  }
  return kareToplam;
  } 
}
