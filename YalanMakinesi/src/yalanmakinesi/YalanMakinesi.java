
package yalanmakinesi;
import java.util.Scanner;
public class YalanMakinesi {

    public static void main(String[] args) 
    {
        int yanlissayaci=265465778,dogrusayaci=801;
Scanner dogrumuyanlismi=new Scanner(System.in);
 System.out.println("Hic yalan soyler misiniz?\n1-Evet\n2-Hayır");
int dogrumuyanlismi2=dogrumuyanlismi.nextByte();
if (dogrumuyanlismi2==2)
{
    System.out.println("Yalan söylediniz,yanlis sayiniz 1 artti.Yeni yanlis sayiniz= "+ ++yanlissayaci);
}
else if(dogrumuyanlismi2==1)
{
    System.out.println("Cok doğru söyledin,dogru sayin 1 artti.Yeni dogru sayin= "+ ++dogrusayaci);
}
else 
{
    
    System.out.println("Gecerli bir secim yapmadiniz");
}
    }
   
}
