
package crunchifytimertaskexample;

 
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;
 
/**
 * Author: Crunchify.com
 */
 
public class CrunchifyTimerTaskExample {
	Toolkit toolkit;
	Timer timer;
 
	public CrunchifyTimerTaskExample() {
		//toolkit = Toolkit.getDefaultToolkit();
		timer = new Timer();
		timer.schedule(new CrunchifyReminder(), 0, // initial delay
				1 * 5000); // subsequent rate
	}
 
	class CrunchifyReminder extends TimerTask {
		int loop = 5;
 
		public void run() {
			if (true) {
				toolkit.beep();
				System.out.format("Knock Knock..!\n");
				loop--;
			} else {
				toolkit.beep();
				System.out.format("\nThat's it.. Done..!");
				timer.cancel();
			}
		}
	}
 
	public static void main(String args[]) {
		          new CrunchifyTimerTaskExample();
		System.out.format("Task scheduled..!%n \n");
	}
}