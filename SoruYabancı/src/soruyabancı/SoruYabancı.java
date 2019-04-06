
package soruyabancı;

public class SoruYabancı {

    public static void main(String[] args) {
        
//   for(int i =10;i>=1;i--){
//   for(int j=1;j<=i;j++){
//   System.out.print(j);
//   }
//   System.out.println();
//   }
        int i=10,j=1;
        while(i>=1){
        while(j<=i){
            System.out.print(j);
            j++;
        }
        j=1;
        i--;
        System.out.println();
   }
    
}
}