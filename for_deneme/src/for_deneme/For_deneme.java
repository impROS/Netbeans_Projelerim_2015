
package for_deneme;

public class For_deneme {

    public static void main(String[] args) {
        int a = 1;
        int [] denemeDizi  = new  int[10];
        System.out.println("Dizi"+say(denemeDizi));
        
        for (int b = 0; b < 10; b++) {
            int c = 0;
            c = c + b;
            a = a  + c;
        }
       // System.out.println(b);  // tanımlı degil hatasi
        System.out.println("a = "+a);
        //System.out.println(c);//tanimli degil
    }
    static int toplam=0;
    public static int say(int...sayilar){
        for (int i : sayilar) {
            toplam += i;
        }
        return toplam ;
    }
}
