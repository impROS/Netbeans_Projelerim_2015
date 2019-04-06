/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemetarih;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import static java.lang.Double.min;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author x.impROS.x
 */
public class DenemeTarih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d1 = new Date();
        String s1 = d1.getTime() + "";
//String s1 = d1.toString()+"";  Mon Sep 07 14:11:04 EEST 2015
        System.out.println(s1);
    }

}
