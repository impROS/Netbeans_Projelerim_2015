package md5kirici;

//abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789
import java.io.File;

public class wordlistGenerator extends Thread {

    static String alphabet;
    static int wordLength;
    static iniIslem veriTabani;

    public wordlistGenerator(String alfabe, int kelimeUzunlugu) {
        alphabet = alfabe;
        wordLength = kelimeUzunlugu;
        File dosya = new File(wordLength + "-List.txt");
        veriTabani = new iniIslem(dosya);
    }

    @Override
    public void run() {
        generate();
    }

    private static void generate() {
        int sayac = 0, toplam = 1;
        for (int i = 0; i < wordLength; i++) {
            toplam *= 62;
        }
        // System.out.println(alphabet.length());
        final long MAX_WORDS = (long) Math.pow(alphabet.length(), wordLength);
        final int RADIX = alphabet.length();

        for (long i = 0; i < MAX_WORDS; i++) {
            int[] indices = convertToRadix(RADIX, i, wordLength);
            char[] word = new char[wordLength];
            for (int k = 0; k < wordLength; k++) {
                word[k] = alphabet.charAt(indices[k]);
            }
            String fullword = MD5(new String(word));

           // veriTabani.yeniAnahtar(fullword, new String(word));
           sayac++;
            if(fullword.equals("c2b72c2925d5daac9bf5eb2f0c8cb9ea")){
                System.out.println(word);
                return;
            }
            if (sayac % 9000000 == 0) {
                System.out.println("%" + (sayac) / (toplam / 100));
                System.out.println(sayac + " || " + toplam);
            }

        }

        System.out.println("completed!");
        return;
    }

    private static int[] convertToRadix(int radix, long number, int wordlength) {
        int[] indices = new int[wordlength];
        for (int i = wordlength - 1; i >= 0; i--) {
            if (number > 0) {
                int rest = (int) (number % radix);
                number /= radix;
                indices[i] = rest;
            } else {
                indices[i] = 0;
            }

        }
        return indices;
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
