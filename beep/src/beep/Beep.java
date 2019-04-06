/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beep;

import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author x.impROS.x
 */
public class Beep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Toolkit.getDefaultToolkit().beep();
            Thread.sleep(100);
            Toolkit.getDefaultToolkit().beep();
            Thread.sleep(100);  
            Toolkit.getDefaultToolkit().beep();
        } catch (InterruptedException ex) {
            Logger.getLogger(Beep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
