
package beyinfirtinasi;

public class BeyinFirtinasi {
public static void main(String[] args) {
//String[] kelimeHavuzu={"kod","code","bank",,"yazilim","merkezi","yaz","soft","developer"};
//String[] kelimeHavuzu={"arı","vızvız,","osman","danger"};
String[] kelimeHavuzu={"yazilim" ,"egitim" ,"kod"};
    kombinasyon(kelimeHavuzu);
    }
   static void kombinasyon(String[] dizi){
        int j=0;
        while(j!=dizi.length){
    for(int i=0;i<dizi.length;i++){
        System.out.println(dizi[j]+" "+dizi[i]);
    }
        j++;
    }
   }
}
