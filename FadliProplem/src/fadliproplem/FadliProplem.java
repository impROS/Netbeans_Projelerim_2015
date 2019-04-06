package fadliproplem;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class FadliProplem {
public static void main(String[] args) {

Scanner giris = new Scanner(System.in);
int sayi1=giris.nextInt();
List liste1 = bolenler(sayi1); 
System.out.println(liste1);
//System.out.println(liste);
    }

  public  static List bolenler(int x){
        List liste= new ArrayList();
        for(int i=2;i<x-1;i++){
        if(x%i==0){
        liste.add(i);
        }
        }
    return liste;
    }
}
