
package randomsayi;
import java.util.Random; //tipki scanner sinifini dahil eder gibi randomu dahil ettik
public class RandomSayi {

    public static void main(String[] args) 
    {
Random rnd = new Random();//burda da scanneri tanimlar gibi randomu tanimladik
int Intsayi=rnd.nextInt();//burda randomu bir integer degerine
System.out.println("int değer :"+Intsayi);
boolean booleansayi = rnd.nextBoolean();
System.out.println("boolean  değer :"+booleansayi);
double doublesayi = rnd.nextDouble();
System.out.println("double değer :"+doublesayi);

System.out.println();
for(int i=1; i<10; i++){
int a=rnd.nextInt(10);
String yazi="-";
System.out.println("sayi"+i+yazi+a);
    }
    
}
}
