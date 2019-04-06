package stringtokenizertest;
import java.io.*;
import java.util.*;
public class StringTokenizerTest {

    public static void main(String[] args) {
String s = "                            Ali                        veli                                   49    elli                                        ";
        System.out.println("Cumle : "+s);
        StringTokenizer t = new StringTokenizer(s);
        System.out.println("Kelime Sayisi : "+t.countTokens());
        int i = 0;
        while(t.hasMoreElements()){
            System.out.println("Kelime Indexi : "+(i++)+ " kelime : "+ t.nextToken());
        }
    }

}
