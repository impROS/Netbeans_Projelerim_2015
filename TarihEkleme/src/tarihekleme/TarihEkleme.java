package tarihekleme;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TarihEkleme {

    public static void main(String[] args) throws ParseException {
        String myTime = "01/02/2012";//yyyy/MM/dd
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println(df.format(df.parse(myTime)));

        Date d = df.parse(myTime);
        Date dateYeni = addDays(d, -5);

        System.out.println(df.format(dateYeni));

        
    }

    public static Date addDays(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        
        return cal.getTime();
    }

}
