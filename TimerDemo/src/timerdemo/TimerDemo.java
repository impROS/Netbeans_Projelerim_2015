
package timerdemo;

import java.util.*;

public class TimerDemo {
   public static void main(String[] args) {
   // creating timer task, timer
   TimerTask tasknew = new TimerTask() {

       @Override
       public void run() {
     System.out.println("timer working"); 
       }
   } ;
   Timer timer = new Timer();

   timer.schedule(tasknew,100, 1000);      
   }
 
}