
package javaapplication99;

public class JavaApplication99 {

    public static void main(String[] args) 
    {
      Timer timer = new Timer ();
    timer.schedule (new TimerTask(){
        @Override
        public void run() {}
    },1000);//every second
    }

}
