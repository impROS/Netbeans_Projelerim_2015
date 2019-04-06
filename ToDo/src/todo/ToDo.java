
package todo;
import java.util.Timer;
import java.util.TimerTask;

public class ToDo  {
  Timer timer;

  public ToDo ( int seconds )   {
    timer = new Timer (  ) ;
    timer.schedule(new ToDoTask () , seconds*1000 ) ;
      System.out.println("Deneme");
  }


  class ToDoTask extends TimerTask  {
    public void run (  )   {
      System.out.println ( "OK, It's time to do something!" ) ;
      //timer.cancel (  ) ; //Terminate the thread
    }
  }


  public static void main ( String args [  ]  )   {
    System.out.println ( "Schedule something to do in 5 seconds." ) ;
    new ToDo ( 5 ) ;
    System.out.println ( "Waiting." ) ;
  }
}