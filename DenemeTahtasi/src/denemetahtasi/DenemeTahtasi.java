
package denemetahtasi;

import java.awt.Robot;

/**
 *
 * @author x.impROS.x
 */
public class DenemeTahtasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
        Robot pressbot = new Robot();
  pressbot.keyPress(17);
    pressbot.keyPress(76); //  L ye bas.
   pressbot.keyRelease(17);
}
