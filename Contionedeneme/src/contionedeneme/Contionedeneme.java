
package contionedeneme;
public class Contionedeneme {
    public static void main(String[] args) {
pas:
//System.out.println("Deneme");
for ( int j = 0 ; j < 6 ; j ++ ) {
for ( int i = 0; i < 5; i++ ) {
if ( i ==3 ) { // for döngüsünü kırıyor
continue pas;
}
System.out.println("i =" +i);
}
System.out.println("Donguden cikti");
System.out.println("j =" +j);
}
    }
    
}
