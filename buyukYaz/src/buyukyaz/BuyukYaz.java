
package buyukyaz;

import java.io.PrintStream;
public class BuyukYaz {



  public static void main(String[] args) throws Exception {

    System.setOut(new PrintStream(System.out) {
       @Override
       public void println(String s) {
         super.println(s.toUpperCase());
       }
    });

    System.out.println("hello world"); // output :  HELLO WORLD
 }
}