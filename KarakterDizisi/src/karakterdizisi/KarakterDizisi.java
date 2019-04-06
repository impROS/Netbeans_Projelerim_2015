
package karakterdizisi;

public class KarakterDizisi {

  
    public static void main(String[] args) {
       char charArray[] = { 'M','e','r','h','a','b','a' };
String s = new String("Merhaba");
String s1,s2;
s1 = new String(s);
s2 = new String(s);
System.out.println("s1="+s1+" "+"s2="+s2+"\n");
if(s1.equals(s2))
System.out.println("Her iki string esit");
System.out.println("Uzunluklar :");
System.out.println("Karakter dizisi" + charArray.length + "karakter");
System.out.println("s1 "+s1.length()+" karakter");
System.out.println("s2 "+s2.length()+" karakter");
    }
}
