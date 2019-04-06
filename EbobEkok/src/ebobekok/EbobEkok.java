
package ebobekok;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
Scanner giris = new Scanner(System.in);
System.out.println("1.Sayiyi giriniz");
int m = giris.nextInt();
System.out.println("2.Sayiyi giriniz");
int n = giris.nextInt();
System.out.println("Sayilar "+n+" ve"+m);
System.out.println("İki sayinin kucuk olani "+kucukOlaniBul(n,m));
System.out.println("İki sayinin ebobu: "+ebobBul(n,m));
    }
    static int kucukOlaniBul(int x,int y){
    if(x<y) return x;
    else return y;
    }
    static int ebobBul(int n,int m){
    int p=m,q=n;
    while (p>0 && q>0){
    if(p>q) q-=p;
    else p-=q;
    }
    int ebob = (p>0 ? p:q);
    return ebob;
    }
}
