package testscanner;

import java.util.Scanner;

class TestScanner {

    public static void main(String args[]) {
    // if input is
        //    10,12
        // then the output is
        // 10
        // 12
        //
        // we use a regex as delimiter to combine "," and
        // whitespace (in this case the ENTER key)
        Scanner sc = new Scanner(System.in).useDelimiter("[,\\s]");
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.println(i);
        }
        System.out.println("Done");
    }
}
