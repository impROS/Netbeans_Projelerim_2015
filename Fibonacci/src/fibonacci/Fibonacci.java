//impROS
package fibonacci;
public class Fibonacci {

    public static void main(String[] args) 
    {
int sayi1=1,sayi2=1,sayi3=1;
System.out.print( sayi1+" - ");
for(int i=1;i<10;i++)
{
System.out.print( sayi2+" - ");
sayi3=sayi1+sayi2;
sayi1=sayi2;
sayi2=sayi3;
       
        }
    }
    
}
