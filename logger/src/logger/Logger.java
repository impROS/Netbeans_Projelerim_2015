
package logger;


 
import java.util.logging.*;
public class Logger {

  public static void main(String[] args) {
 
        // Logger nesnesi yaratalim
 
        Logger loggerDeneme = Logger.getLogger("logger");
 
        // konfigure edelim
 loggerDeneme.
        loggerDeneme.addHandler(new ConsoleHandler());
 
        loggerDeneme.setLevel(Level.FINE);
 
        // Farkli seviyelerde log mesajlari
 
        // loglama icin 7 tane farkli seviye var
 
        loggerDeneme.severe("Level:Severe ");
 loggerDeneme.
        logger.warning("Level:Warning");
 
        loggerDeneme.log(Level.WARNING, "Uyarı mesajı için farklı bir loglama örneği");
 
        loggerDeneme.info("Level:info");
 
        loggerDeneme.config("Level:configmessage");
 
        loggerDeneme.fine("Level:fine");
 
        loggerDeneme.log(Level.FINE, "FINE seviyesinde bir loglama örneği");
 
        loggerDeneme.finer("Level:finer");
 
        loggerDeneme.finest("Level:finest");
 
    }
 
}