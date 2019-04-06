/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hizliprint2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author x.impROS.x
 */
public class HizliPrint2 {
public static void main(String...args) throws Exception {
     BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
         FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
     long start = System.currentTimeMillis();
     for (int i = 0; i < 100000; i++) {
       out.write("abcdefghijk ");
       out.write(String.valueOf(i));
       out.write('\n');
     }
     out.flush();
     System.out.println("Loop time: " +
       (System.currentTimeMillis() - start));
   }

}