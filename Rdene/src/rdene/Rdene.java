
package rdene;

public class Rdene {


    public static void main(String[] args) {
        String yazi="impROS";
        String yazi2=yazi.replace('i', 'B');
       System.out.println("replace"+yazi2);
       
       yazi="impROS";
       int sayi1,sayi;
        sayi1=yazi.length();
       System.out.println("length"+sayi1);
       
              sayi1=yazi.indexOf('R');
       System.out.println("indexof"+sayi1);
       yazi="impROS";
       String yazi1;
       char karakter ;
       char[] c = { yazi.charAt(0), yazi.charAt(1), yazi.charAt(2)};
              System.out.println(c);
              String s = String.valueOf("asd");
System.out.println(s);
//        int sayi2 = 12345;
//        String yazi4="123456";
//          int sayi4=Integer.parseInt(yazi4);
//       System.out.println("sayi4 "+sayi4);
//       
//              yazi2=yazi.replace('i', 'B');
//       System.out.print(yazi2);
//        System.out.println("Merhaba"+"Dunya");
//System.out.print("Merhaba"+  "\r"+"Dunya");
    }
    
}
