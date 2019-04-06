
package pwdconsole;
import java.io.*;
import java.awt.*;

public class PwdConsole {
 public static void main(String[] args) throws Exception {
  ConsoleEraser consoleEraser = new ConsoleEraser();
  System.out.print("Password?  ");
  BufferedReader stdin = new BufferedReader(new
       InputStreamReader(System.in));
  consoleEraser.start();                       
  String pass = stdin.readLine();
  consoleEraser.halt();
  System.out.print("\b");
  System.out.println("Password: '" + pass + "'");
  }
 }

class ConsoleEraser extends Thread {
 private boolean running = true;
 public void run() {
  while (running) {
   System.out.print("\b ");
   }
 }

 public synchronized void halt() {
  running = false;
 }
}