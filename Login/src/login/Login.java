/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author x.impROS.x
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Label ve Fieldların oluşturulması 

JLabel userJLabel = new JLabel("Kullanıcı Adı");
panel.add(userJLabel);

final JTextField userField = new JTextField(13);
panel.add(userField);

JLabel passJLabel = new JLabel("Parola");
panel.add(passJLabel);

final JPasswordField passField = new JPasswordField();
panel.add(passField); 

 

// Giriş Butonu 

JButton giris = new JButton("Giriş");
giris.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent arg0) {

      // Giriş Butonuna tıklandığında kullanıcı adının ve parolanın alınması 

      String user = userField.getText();
      String pass = String.valueOf(passField.getPassword()); 

 

      // kullanıcı adı ve parola kontrol

      if (user.equalsIgnoreCase("Hakan") && pass.equalsIgnoreCase("KETEN")) {
         JOptionPane.showMessageDialog(null, "Giriş Başarılı");
      } else {
         JOptionPane.showMessageDialog(null, "Giriş Başarısız");
      }
   }
});
panel.add(giris);

JButton kapat = new JButton("Kapat");
kapat.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent arg0) {
      System.exit(0);
   }
});
panel.add(kapat);
    }
    
}
