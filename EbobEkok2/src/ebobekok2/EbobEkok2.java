
package ebobekok2;
import java.util.Scanner;

public class EbobEkok2 {

    public static void main(String[] args) {
   Scanner giris = new Scanner(System.in);
   int m=giris.nextInt();
  int n = giris.nextInt();
  System.out.println(m+" ve "+n+"Sayilarinin en büyük ortak boleni:");
  int p=m,q=n;
  while(p>0 && q>0){
  if(p<q) q-=p;
  else p-=q;
  System.out.println("p = "+p+" q "+q);
  }
  int ebob = (p>0 ? p:q);
  System.out.println(m+" ve "+n+" sayilari icin ebob = "+ebob);
    System.out.println(m/ebob+" * "+ebob+" = "+m);
      System.out.println(n/ebob+" * "+ebob+" = "+n);
  }
    }
    
