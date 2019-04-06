package timer;
import java.util.Timer;
import java.util.TimerTask;
public class Timer {

    public static void main(String[] args) {
   
 System.out.println(args[0].length());
//              System.out.println(args[0].substring(args[0].length()-2));
              
              
       

        }
       
                    public void run()
                        {
                            
                            int i = 0;
                                i++;
                                System.out.println(i + "-merhaba");
                                if (i == 5) { System.exit(0); }

                        }
}