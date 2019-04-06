
package ekransil;

import org.fusesource.jansi.AnsiConsole;

public class Ekransil {
  public static final String ANSI_CLS = "\u001b[2J";
  public static final String ANSI_HOME = "\u001b[H";
  public static final String ANSI_BOLD = "\u001b[1m";
  public static final String ANSI_AT55 = "\u001b[10;10H";
  public static final String ANSI_REVERSEON = "\u001b[7m";
  public static final String ANSI_NORMAL = "\u001b[0m";
  public static final String ANSI_WHITEONBLUE = "\u001b[37;44m";

  public static void main(String args[]){
    AnsiConsole.systemInstall();
    AnsiConsole.out.println(ANSI_CLS);
    AnsiConsole.out.println
       (ANSI_AT55 + ANSI_REVERSEON + "Hello world" + ANSI_NORMAL);
    AnsiConsole.out.println
       (ANSI_HOME + ANSI_WHITEONBLUE + "Hello world" + ANSI_NORMAL);
    AnsiConsole.out.print
       (ANSI_BOLD + "Press a key..." + ANSI_NORMAL);
    try {System.in.read();}catch(Exception e){}
    AnsiConsole.out.println(ANSI_CLS);
    AnsiConsole.systemInstall();
    }
  }