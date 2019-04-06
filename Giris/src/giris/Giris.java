
package giris;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Giris {

	public static void main(String[] args) {
		JFrame f = new JFrame();

		JPanel panel = new JPanel(new GridLayout(3, 2));
		panel.setBorder(BorderFactory.createTitledBorder("Giris Bilgileri"));

		JLabel userJLabel = new JLabel("Kullanici Adi");
		panel.add(userJLabel);

		final JTextField userField = new JTextField(13);
		panel.add(userField);

		JLabel passJLabel = new JLabel("Parola");
		panel.add(passJLabel);

		final JPasswordField passField = new JPasswordField();
		panel.add(passField);

		JButton giris = new JButton("Giris");
		giris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user = userField.getText();
				String pass = String.valueOf(passField.getPassword());

				if (user.equalsIgnoreCase("Hakan") && pass.equalsIgnoreCase("KETEN")) {
					JOptionPane.showMessageDialog(null, "Giris Basarili");
                                        panel.hide();
                                        
				} else {
					JOptionPane.showMessageDialog(null, "Giris Basarisiz");
                                        userField.setText("");
                                        passField.setText("");
				}
			}
		});
		panel.add(giris);

		JButton kapat = new JButton("Kapat");
		kapat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		panel.add(kapat);

		f.add(panel);
		f.pack();
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
