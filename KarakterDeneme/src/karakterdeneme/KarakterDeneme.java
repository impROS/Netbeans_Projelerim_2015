
package karakterdeneme;


public class KarakterDeneme 
{

    public static void main(String[] args) 
    {
        char karakter='A';
        System.out.println(karakter);
        karakter='B';
        System.out.println(karakter);
        System.out.println("1.0f+9.9f"+1.0/9.9);
        int sayidegeri;
        sayidegeri=karakter;
        System.out.println("B nin degeri= "+sayidegeri);
        int sayac=2;
        sayac+=2;
                System.out.println("sayac oldu size="+sayac);
                            sayac+=sayac;
                System.out.println("sayac oldu size="+sayac);
               String birincistring="merhaba"+" "+"dunya"+"\\"+"\r"+"deneme";
               String ikincistring="merhaba"+" "+"dunya"+"\\"+"deneme";
               System.out.println(birincistring);
               System.out.println(ikincistring+"\r"+birincistring.length());
    }
    
}
