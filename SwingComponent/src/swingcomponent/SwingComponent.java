
package swingcomponent;

//import java.awt.FlowLayout;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

////import javax.swing.JButton;
////import javax.swing.JFrame;
//import javax.swing.*;


public class SwingComponent  extends JFrame {

  
    public static void main(String[] args) {
        
        Gorsel gorsel=new Gorsel();
        gorsel.setVisible(true);
        gorsel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gorsel.setSize(500,500);
//new SwingComponent();
    }

    public SwingComponent() {
        this.setSize(275, 100);
    this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    ClickListener cl = new ClickListener();

    JPanel panel1 = new JPanel();

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        exitButton.doClick();
      }
    });

    button1.addActionListener(cl);
    panel1.add(button1);

    exitButton.addActionListener(cl);
    panel1.add(exitButton);
    this.add(panel1);

    this.setVisible(true);
    }
    
    private JButton button1  = new JButton("Click Me!"), exitButton= new JButton("Exit");
    
      private class ClickListener implements ActionListener {
    private int clickCount = 0;

    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == button1) {
        clickCount++;
        if (clickCount == 1)
          button1.setText("clicked!");
        else
          button1.setText("clicked " + clickCount + " times!");
      } else if (e.getSource() == exitButton) {
        if (clickCount > 0)
          System.exit(0);
        else {
          JOptionPane.showMessageDialog(SwingComponent.this, "You must click at least once!",
              "Title", JOptionPane.ERROR_MESSAGE);
        }
      }
    }
  }
}
