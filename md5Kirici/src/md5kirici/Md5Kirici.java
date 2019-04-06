package md5kirici;

import java.util.Arrays;
import java.util.Random;

public class Md5Kirici {
//"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789

    static String strAlfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    static String cozulenVeri = "";
    static String[] arrKelimeHavuzu = new String[strAlfabe.length()];
    static Random rastgele = new Random();

    public static void main(String[] args) {
//      wordlistGenerator worldListUret1 =new wordlistGenerator(strAlfabe, 4);
//      wordlistGenerator worldListUret2 =new wordlistGenerator(strAlfabe, 5);
//      wordlistGenerator worldListUret3 =new wordlistGenerator(strAlfabe, 6);
//      wordlistGenerator worldListUret4 =new wordlistGenerator(strAlfabe, 7);
   wordlistGenerator worldListUret5 =new wordlistGenerator(strAlfabe, 5);
   
//worldListUret1.start();
//worldListUret2.start();
//worldListUret3.start();
//worldListUret4.start();
worldListUret5.start();
    }
   

   
    public static String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }
}
