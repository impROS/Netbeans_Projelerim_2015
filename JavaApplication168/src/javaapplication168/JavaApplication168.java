
package javaapplication168;

import java.util.Scanner;
public class JavaApplication168 {

   
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
int a=giris.nextInt();
int b=giris.nextInt();
if(a<b){
System.out.println(a+" kucuktur");

}
else if(b<a){
System.out.println(b+" kucuktur");
}
else{
System.out.println("a=b");
}
    }
    
}
