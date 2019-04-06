//generics yontemi aynı islemi yapan turleri tek bir cati altında toplar ve ilkel veri tiplerinde ise yaramaz
package genericsdeneme;
public class GenericsDeneme {

    public static void main(String[] args) {
       Integer[] intDizi ={1,2,3,4,5};
       String[] stringDizi ={"Bir","iki","uc","dort"};
       Double[] doubleDizi ={1.1,2.0,4.3};
       
        dizileriYazdir(intDizi);
        dizileriYazdir(stringDizi);
        dizileriYazdir(doubleDizi);
    }
    public static <E> void dizileriYazdir(E[] dizi){
    for(E x:dizi){
        System.out.print(x+" ");
    }
        System.out.println("");
    }
}
