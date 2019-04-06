
package javaapplication165;
import java.util.Scanner ;
public class JavaApplication165 {

   
    public static void main(String[] args) {
Scanner tara =new Scanner(System.in);
System.out.println("Hangi sekille ucgen yapmak istersiniz?");
  String A = tara.next();
        int i,j ;

       
        for (i=1 ; i<=7 ; i++){
            for (j=1 ; j<=i ; j++ ){
                System.out.print(A);
            }
            System.out.println();
        }
        
        System.out.println("  " + "  " + "  ");
        System.out.println("B)");
        for (i=6 ; i>=1 ; i--){
            for (j=i ; j>=1 ; j--){
                System.out.print(A);
            }
           System.out.println();
        }
        
         System.out.println("  " + "  " + "  ");
         System.out.println("C)");
         for (i=1 ; i<=7 ; i++){
             for(j=1 ; j<=7 ; j++){
                 System.out.print(A);
                 }
             System.out.println();
         }     
         System.out.println("Lütfen yukarıdaki şekillerden birini seçiniz");
         String secoku=tara.next();
         System.out.println("Seçtiğiniz şekil");
         if (secoku == A)
         {
             for (i=1 ; i<=7 ; i++){
            for (j=1 ; j<=i ; j++ ){
                System.out.print(A);
            }
            System.out.println();
        }

    }
    
}
    }
