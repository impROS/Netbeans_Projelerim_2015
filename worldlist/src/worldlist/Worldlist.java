package worldlist;

public class Worldlist {

    public static void main(String[] args) {
        generate();
    }
    private static void generate() {
        int sayac=0;
        int wordlength = 4;
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        System.out.println(alphabet.length());
        final long MAX_WORDS = (long) Math.pow(alphabet.length(), wordlength);
        final int RADIX = alphabet.length();

        for (long i = 0; i < MAX_WORDS; i++) {
            int[] indices = convertToRadix(RADIX, i, wordlength);
            char[] word = new char[wordlength];
            for (int k = 0; k < wordlength; k++) {
                word[k] = alphabet.charAt(indices[k]);
            }
            String fullword = new String(word);
            sayac++;
            System.out.println((sayac)+" "+fullword);
            
        }

        System.out.println("completed!");
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
}

