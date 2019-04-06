//tersten yıldız 
package tersyildiz;
public class TersYildiz {
 public static void main(String[] args) 
    {
    int i=1,j=1,sayi3=6,sayac1=1,sayac2=9;
    
for(int k=1;k<=sayi3;k++)
{

        for(i=2;i<=sayac1;i++)
        {
        System.out.print(" ");
        }
          for(j=sayac2;j>=1;j--)
        {
        System.out.print("*");
        }
       sayac1+=2;
       sayac2-=2;
System.out.println();
}
//System.out.println("               *");
    }

}
