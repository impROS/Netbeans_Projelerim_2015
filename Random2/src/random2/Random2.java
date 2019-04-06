
package random2;

import java.util.Random;
public class Random2 
{


    public static void main(String[] args) 
    {
Random rnd = new Random();
for(int i=0;i<100;i++)
{
int sayi=rnd.nextInt(5);
System.out.print(sayi+" - ");
}
    }
    
}
