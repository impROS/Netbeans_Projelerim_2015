package stringbuilder;
public class StringBuilder {

    public static void main(String[] args) {
        /////////////
String yazi="java";//verimli degil concat,cunku ekleme yapiyor,yani fazladan bellek isgal ediyor
yazi=yazi.concat(" Guclu bir dil");
System.out.println(yazi);
//////////////////////////
StringBuffer sb = new StringBuffer();
sb.append("merhaba");
sb.append(" dunya");
System.out.println(sb.toString());
////////////////////////
String yazi2="Merhaba"+" "+"Dunya";//bu da string buffer la aynı isi 
System.out.println(yazi2);
////////////////
String x = "abc";
x.concat("def");//ekleme yapmaz cunku
System.out.println("x = " + x); // cikti x = abc olacaktir
////////////////////////
java.lang.StringBuilder str=new java.lang.StringBuilder(); //basina java.lang getirdigimde
str.append("Merhaba");
str.append(" Dunya2");
System.out.println(str.toString());
    }
    
}
