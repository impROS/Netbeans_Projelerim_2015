
package stringdizi;

import java.util.Hashtable;
import java.util.Arrays;
public class StringDizi {

 
    public static void main(String[] args) {

//Hashtable doldururken
Hashtable<String,String[]> arrayMap = new Hashtable<>();
String dizi1[] = new String[5];
arrayMap.put("dizi1", dizi1);

//Alirken
String metodunIcindekidizi1[] = arrayMap.get("dizi1");
        System.out.println(Arrays.toString(metodunIcindekidizi1)+"");
        System.out.println(""+arrayMap.get("dizi1").toString(dizi1));
    }

   
    public String[] toString(String[] a) {
        return a;
    }
    
}
