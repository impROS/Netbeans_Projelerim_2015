
package mainclass;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainClass extends JFrame {
  public static void main(String[] args) {
  //  new MainClass();
  }
  private JButton button1  = new JButton("Click Me!"), exitButton= new JButton("Exit");

//  public MainClass() {
//    this.setSize(275, 100);
//    this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//
//    ClickListener cl = new ClickListener();
//
//    JPanel panel1 = new JPanel();
//
//    addWindowListener(new WindowAdapter() {
//      public void windowClosing(WindowEvent e) {
//        exitButton.doClick();
//      }
//    });
//
//    button1.addActionListener(cl);
//    panel1.add(button1);
//
//    exitButton.addActionListener(cl);
//    panel1.add(exitButton);
//    this.add(panel1);
//
//    this.setVisible(true);
//  }
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
          JOptionPane.showMessageDialog(MainClass.this, "You must click at least once!",
              "Title", JOptionPane.ERROR_MESSAGE);
        }
      }
    }
  }
}