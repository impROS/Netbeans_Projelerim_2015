
package grafikkitap;

import javax.swing.JFrame;

public class GrafikKitap {
    public static void main(String[] args) {
   KitapOrnek o1=new KitapOrnek();
   
   JFrame form1 = new JFrame("Kitap Ornek 1");
   form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   form1.setLocationRelativeTo(null);
  // form1.setLocation(null);
   form1.add(o1);
   form1.setSize(500,500);
   form1.setVisible(true);
   
       }
    }
    

