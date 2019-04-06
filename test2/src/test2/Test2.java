
package test2;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test2 extends JFrame{
	private JLabel b1;
	private JButton bt1;
	
	
	private Test2(){
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		 
		Icon loading=new ImageIcon(getClass().getResource("001.gif"));
		b1=new JLabel("  loading ", loading, JLabel.CENTER);
		b1.setBounds(100 ,50, 100, 100);
		add(b1);
		 
				
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test2();
	}

}
