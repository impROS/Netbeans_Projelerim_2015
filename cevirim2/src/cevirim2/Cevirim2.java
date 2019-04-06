package cevirim2;

import java.nio.charset.Charset;
import java.util.Arrays;

public class Cevirim2 {

    public static void main(String[] args) {
        byte[] bytDizi = {1, -1, 0, 22, -22};
        System.out.println("Byte Dizisi = " + Arrays.toString(bytDizi));

        String[] strDizi = new String[bytDizi.length];
        int index = 0;
        for (byte bytVeri : bytDizi) {
            strDizi[index] = bytVeri + "";
            index++;
        }
        
        System.out.println("String Dizisi = " + Arrays.toString(strDizi));
        
        index=0;
        
        for(String strVeri:strDizi){
        bytDizi[index] =(byte) Integer.parseInt(strVeri);
        index++;
        }
        System.out.println("Donusen Byte Dizisi"+Arrays.toString(bytDizi));

    }

}
