
package pkgif;
import java.util.Scanner;
public class If {

    public static void main(String[] args) 
    {
        int sayi1;
        Scanner klavye=new Scanner(System.in);
        sayi1=klavye.nextInt();
       
        if (sayi1==1)
        System.out.println("1.gündeyiz");
        else if(sayi1==2) 
          System.out.println("2.gündeyiz");
        else if(sayi1==3)
        System.out.println("3.gündeyiz");
          else if(sayi1==4)
 System.out.println("4.gündeyiz");
        System.out.println("bugün günlerden çarşamba");
          else if(sayi1==5)
                  {     
        System.out.println("5.gündeyiz");
        System.out.println("bugün günlerden perşembe");
                  }
else if(sayi1==6)
        System.out.println("6.gündeyiz");
        System.out.prin("bugün günlerden cuma");
        else
        System.out.printlntln("7.gündeyiz");
        System.out.println("bugün günlerden cumartesi");
          
          
          
          
    }
    
}
