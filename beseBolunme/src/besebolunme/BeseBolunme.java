package besebolunme;
import java.util.Scanner;
public class BeseBolunme 
{
    public static void main(String[] args)
    {
Scanner giris=new Scanner(System.in);
int sayi1,sayi2;
System.out.println("Lutfen 1.sayiyi giriniz");
sayi1=giris.nextInt();
System.out.println("Lutfen 2.sayiyi giriniz");
sayi2=giris.nextInt();
for(int i=sayi1;i<=sayi2;i++)
{  
if(sayi1%5==0)
{
    System.out.print(sayi1+" - ");
    
}
sayi1++;
}
    }
    
}
