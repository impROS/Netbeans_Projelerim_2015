
package timepicker;

import java.util.*;


public class TimePicker {


    public static void main(String[] args) {
      TimePicker TimePicker = new TimePicker();


//Saatin Alınması ve Atanması

String nowTime = TimePicker.getTime();
TimePicker.setTime(new Date());


//İstersek timerStart ve timerStop metodları yardımıyla saati başlatıp durdurabiliriz.

TimePicker.timerStart();
TimePicker.timerStop();

    }
    
}
