
package javaapplication127;
import java.io.*; 
import java.util.Scanner;
public class JavaApplication127 
{

    public static void main(String[] args) 
    {
try 
{ 
    Scanner giris = new Scanner(System.in);
FileOutputStream streamNesne = new FileOutputStream("tekstdosyasi.txt"); 
//FileOutputStream streamNesne = new FileOutputStream("k:\\tekstdosyasi.txt"); 

PrintWriter yazdirici = new PrintWriter(streamNesne); 

String satir=""; 
while(!satir.equals("dur"))
        {
//yazdirici.flush();
satir=giris.next();
yazdirici.println(satir); 
//yazdirici.close(); 
yazdirici.flush();  
        }
yazdirici.close();

//System.out.println("Dilemis oldugunuz \"" + satir + "\" satiri ilgili dosyaya yazdirildi. "); 
} 

catch (FileNotFoundException excep) 
{ 
System.out.println("Bu isimde bir dosya bulunamadi ..."); 
} 
catch (IOException excep) 
{ 
System.out.println("Bir \"exception\" olustu ..."); 
} 
}
}
