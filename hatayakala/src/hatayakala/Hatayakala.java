
package hatayakala;
import java.util.Scanner;

public class Hatayakala {


    public static void main(String[] args) 
    {
  try
  {
      Scanner giris=new Scanner(System.in);
      
  int a,b,c;
  a=giris.nextInt();
  b=giris.nextInt();
  c=a+b;
  System.out.println(c);
  }
  catch(Exception e)
          {
              System.out.println("Hata verdi");
  
  }
    }
    
}
