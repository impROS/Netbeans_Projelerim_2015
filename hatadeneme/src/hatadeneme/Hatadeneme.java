
package hatadeneme;

public class Hatadeneme {
    public static void main(String[] args) {
        try{
       int a=5,b=0,c;
       c=a/b;
        }
        catch(ArithmeticException hata){
        System.out.println("hata olustu"+hata);
        System.out.println("bir sayi 0 a bölünmez");
        }
               
    }
    
}
