
package vizesoru;
import java.util.Scanner;
public class Vizesoru {
    public static void main(String[] args) {
Scanner giris = new Scanner(System.in);
System.out.println("Hacim icin Yaricap degerini giriniz");
double yaricap=giris.nextDouble();
while(yaricap<0){
System.out.println("Yaricap 0 dan kucuk olamaz.Tekrar giriniz");
yaricap=giris.nextDouble();
}
System.out.println("hacim = "+hacim(yaricap));

System.out.println("alan için omega degerini giriniz");
double omega=giris.nextDouble();
while(omega<0 || omega>12.56){
System.out.println("omega 0 dan kucuk  ve 12.56 dan buyuk olamaz.Tekrar giriniz");
omega=giris.nextDouble();
}
System.out.println("Alan = "+alan(omega,yaricap));
    }
    
    static double hacim(double r){
    return (\\\\\\\;
    }
        static double alan(double omega,double r){
    return omega*3.14*r*r;
    }
}
