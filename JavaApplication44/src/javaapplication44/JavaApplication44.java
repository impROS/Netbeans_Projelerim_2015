
package javaapplication44;

import java.util.Scanner;
public class JavaApplication44 {

    public static void main(String[] args) 
    {
        Scanner giris=new Scanner(System.in);
        int sayi1=giris.nextInt();
        int b;
        switch(sayi1)
        {
            case 1:b=10;
                break;
            case 2:b=20;
                break;
            default:b=100;
        }
        System.out.println(b);
    }
    
}
