
package effectivesoru;

public class EffectiveSoru {

    public static void main(String[] args) {
     int a = 12 + 21 * 3 - 9 / 2;
        System.out.println("a kontrol"+a);
     int b = (14 -3) +2 * 4 + (175/8);
      System.out.println("b kontrol"+b);
     if(++a>71 && --b < 20)
     {
         System.out.println("a = " + a + " b = " + b);
     }
      System.out.println("a kontrol"+a);
     if(b-- == -97 || a-- < 100)
     {
         System.out.println("a = " + a + " b = "+b);
     }
    }
    
}
