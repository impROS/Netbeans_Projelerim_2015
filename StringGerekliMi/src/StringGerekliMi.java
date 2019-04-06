import java.util.Arrays;
public class StringGerekliMi  {
public static void main(String[] argsfds) {
  System.out.println("Merhaba yazi");
  main(1);
  int[] dizi={1,2,3,4};
  main(dizi);
    }
     public static void main(int sayi) {
         System.out.println("Merhaba sayi");
     }
	    public static void main(int[] sayi) {
         System.out.println("Merhaba dizi"+Arrays.toString(sayi));
     }
     }
