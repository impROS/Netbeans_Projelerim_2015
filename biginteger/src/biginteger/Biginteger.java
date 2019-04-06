package biginteger;

import java.math.BigInteger;

/**
 *
 * @author x.impROS.x
 */
public class Biginteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger reallyBig = new BigInteger("64");
        BigInteger notSoBig = new BigInteger("1234567892867018124");
        reallyBig = reallyBig.pow(8);
        
        System.out.println(reallyBig);
        
        for (int i = 0; i < 10; i++) {
            reallyBig.add(1);
        }
    }

}
