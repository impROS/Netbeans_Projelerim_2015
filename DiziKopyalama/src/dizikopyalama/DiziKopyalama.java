
package dizikopyalama;

import java.util.Arrays;

public class DiziKopyalama {
    public static void main(String[] args) {
    int[] dizi1={1,2,3,4};
    int[] dizi2=new int[dizi1.length];
    //System.arraycopy(kaynak,kaynakbaslamaindexi,hedef,hefefbaslamaindexi,kopyalamaAdimi);
    System.arraycopy(dizi1,0, dizi2,0,3);
    System.out.println(Arrays.toString(dizi2));
    }
    
}
