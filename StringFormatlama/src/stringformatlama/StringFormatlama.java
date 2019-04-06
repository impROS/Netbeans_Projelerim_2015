package stringformatlama;

public class StringFormatlama {

    public static void main(String[] args) {
        int i = 97;

        System.out.println(String.format("Hexadecimal : " + "%x", i));       // hexadecimal
        System.out.println(String.format("Decimal : " + "%d", i));      // decimal
        System.out.println(String.format("Karakter : " + "%c", i));      // karakter
        System.out.println(String.format("String : " + "%s", i));      // string
        System.out.println(String.format("Octal : " + "%o", i));     // octal
    }

}
