
package javaapplication116;


public class JavaApplication116 {

    public static void main(String[] args) {
String strDizi[] ={"Ali", "Zekiye", "Cemil", "Kemal"};
String kelime = "Cemil";
if (ara(strDizi,kelime))
System.out.println(kelime+" Dizide Bulundu");
else
System.out.println(kelime+" Dizide Bulunamadı");
kelime = "Yılmaz";
if (ara(strDizi,kelime))
System.out.println(kelime+" Dizide Bulundu");
else
System.out.println(kelime+" Dizide Bulunamadı");
}
public static boolean ara(String dizi[], String aranan)
{
for(int i=0; i<dizi.length; ++i)
if (aranan.equals(dizi[i]))
        return true;
return false;
    }
    
}
