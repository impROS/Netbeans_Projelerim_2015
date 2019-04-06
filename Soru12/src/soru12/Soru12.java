/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru12;

/**
 *
 * @author x.impROS.x
 */
public class Soru12 {

    public static void main(String[] args) {
        int i = 0;
        i = i++ +
                test(i);
        System.out.println(i);
    }

    public static int test(int i) {
            System.out.println(i);
        return i++;

    }

}
