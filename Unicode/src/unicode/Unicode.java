/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicode;

import java.util.Formatter;

/**
 *
 * @author x.impROS.x
 */
public class Unicode {


    public static void main(String[] args) {
        System.out.println(escapeUnicode("ı"));
        System.out.println("\\u0131".);
    }
    public static String escapeUnicode(String input) {
    StringBuilder strBuilder = new StringBuilder(input.length());
    Formatter formatter = new Formatter(strBuilder);
    for (char chr : input.toCharArray()) {
        if (chr < 128) {
            strBuilder.append(chr);
        } else {
            formatter.format("\\u%04x", (int) chr);
        }
    }
    return strBuilder.toString();
}
}
