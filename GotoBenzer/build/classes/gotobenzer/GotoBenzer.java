
package gotobenzer;

public class GotoBenzer {

    public static void main(String[] args) {
   boolean kontrol = true;
    gidilecekYer: 
    do {
      System.out.println("Bunu Yapar");
      kontrol =false;
      if (kontrol) {
          continue gidilecekYer;
      }
      System.out.println("Bunu yapmaz");
    } while(kontrol);
    }
    
}
