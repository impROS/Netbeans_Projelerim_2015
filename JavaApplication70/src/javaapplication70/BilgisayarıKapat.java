/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication70;


import java.io.*;
public class BilgisayarıKapat {

    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("shutdown -a");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

        } catch (IOException e) {
        }
    }
}