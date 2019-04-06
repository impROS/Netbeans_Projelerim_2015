package sayimistringmi;

import java.math.BigInteger;
import java.util.StringTokenizer;

public class SayiMiStringMi {

    public static void main(String[] args) {
        String strCumle = "bir, 1, iki 2";
        StringTokenizer strToken = new StringTokenizer(strCumle);
        String strKelime;
        while (strToken.hasMoreElements()) {
            strKelime = strToken.nextToken();
            
            try {
                System.out.println("Sayi = " + Integer.parseInt(strKelime));
            } catch (NumberFormatException ex) {

                System.out.println("String= " + strKelime);
            }
            //BigInteger.probablePrime(1, null)
        }
    }

}
