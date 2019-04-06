
package hizliprint;

public class HizliPrint {
   public static void main(String...args) throws Exception {
     long start = System.currentTimeMillis();
     for (int i = 0; i < 100000; i++) {
       System.out.print("abcdefghijk ");
       System.out.print(String.valueOf(i));
       System.out.print('\n');
     }
     System.out.println("Loop time: " +
       (System.currentTimeMillis() - start));
   }
}