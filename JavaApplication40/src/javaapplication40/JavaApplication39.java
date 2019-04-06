//Ali Perisan
//Scanner ve if else ornegi
package javaapplication40;

import java.util.Scanner;

// impROS
public class JavaApplication39 {

    public static void main(String[] args) 
    {
     
        Scanner klavye=new Scanner(System.in);
         int vizenotu;
        vizenotu=klavye.nextInt();
        if (vizenotu>100)
            System.out.println("yuh");
        else if (vizenotu>=90 &&  vizenotu<=100)
            System.out.println("Ders Notunuzun Hafle Gösterimi="+"AA");
        else if (vizenotu>=80 &&  vizenotu<=90)
            System.out.println("Ders Notunuzun Hafle Gösterimi="+"BA");
        else if (vizenotu>=70 &&  vizenotu<=80)
            System.out.println("Ders Notunuzun Hafle Gösterimi="+"BB");
        else if (vizenotu>=60 &&  vizenotu<=70)
            System.out.println("Ders Notunuzun Hafle Gösterimi="+"CB");
         else if (vizenotu>=50 &&  vizenotu<=60)
            System.out.println("Ders Notunuzun Hafle Gösterimi="+"CC") ; 
         else if (vizenotu>=40 &&  vizenotu<=50)
            System.out.println("Ders Notunuzun Hafle Gösterimi="+"DC") ;
         else if (vizenotu>=30 &&  vizenotu<=40)
            System.out.println("Ders Notunuzun Hafle Gösterimi="+"DD") ;
         else if (vizenotu>=20 &&  vizenotu<=30)
            System.out.println("Ders Notunuzun Hafle Gösterimi="+"DF") ;
         else if (vizenotu>=15 &&  vizenotu<=20)
            System.out.println("Ders Notunuzun Hafle Gösterimi="+"FF") ;
   else
            
      System.out.println("CANA DAHİL DEGİLSİNİZ");
     } 
}

