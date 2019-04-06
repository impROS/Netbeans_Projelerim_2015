package tarihslemleri;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tarihslemleri {

    public static void main(String[] args) {
        Date simdikiZaman = new Date();
        System.out.println(simdikiZaman.toString());

        System.out.println("///////////////////////////////////");
        Date now = new Date();
        System.out.println(now.toString());
        System.out.println("Timestamp : " + now.getTime());

        System.out.println("///////////////////////////////////");
        Date simdikiZaman2 = new Date();
        System.out.println(simdikiZaman2.toString());
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd hh/mm/ss");
        System.out.println(df.format(simdikiZaman2));

        System.out.println("///////////////////////////////////");
        Date simdikiZaman3 = new Date();
        System.out.println(simdikiZaman3.toString());

        System.out.println("///////////////////////////////////");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
        Date tarih = null;
        try {
            tarih = df2.parse("1984/01/01");
        } catch (ParseException ex) {
            Logger.getLogger(Tarihslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(tarih);

        System.out.println("///////////////////////////////////");
        Calendar takvim = new GregorianCalendar(1984, 01, 01);
        Date tarih2 = takvim.getTime();
        System.out.println(tarih2.toString());
    }

}
