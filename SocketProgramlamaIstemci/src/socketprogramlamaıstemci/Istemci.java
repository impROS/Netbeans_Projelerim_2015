/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogramlamaıstemci;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static socketprogramlamaıstemci.Istemci.*;

/**
 *
 * @author x.impROS.x
 */
public class Istemci extends JFrame{
    public static JTextField metinAlani=new JTextField();
    public static  JTextArea textArea=new JTextArea();
    public static DataInputStream okuyucu;
    public static DataOutputStream yazici;

    public Istemci() {
        JPanel panel=new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("Karenim Kenar Uzunlugunu giriniz"+"\n"),BorderLayout.WEST);
        panel.add(metinAlani,BorderLayout.CENTER);
        metinAlani.setHorizontalAlignment(JTextField.RIGHT);
        setLayout(new BorderLayout());
        add(panel,BorderLayout.NORTH);
        add(new JScrollPane(textArea),BorderLayout.CENTER);
        metinAlani.addActionListener(new MetinAlaniDinleyici());
        try{
        Socket istemciSoketi= new Socket("192.168.1.100",9090);
        okuyucu= new DataInputStream(istemciSoketi.getInputStream());
        yazici=new DataOutputStream(istemciSoketi.getOutputStream());
        }catch(IOException hata2){
        textArea.append(hata2.getMessage()+"");
        
        }
    }
    
}
 class MetinAlaniDinleyici implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        String sohbet =metinAlani.getText()+"";
        yazici.writeChars(sohbet);
        double alan=okuyucu.readDouble();
        
       textArea.append("Istemci : "+sohbet+"\n");
           //textArea.append("sunucudan alınan alan"+alan+"\n");
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
 }
//int sayı1 sayı 2; if sonuç=(sayı1*sayı2 )
//        }doublewrite kenaruzunluğu try (sunucudan alınan kenaruzunluğu*kenaruzunluğu);
//sonuç=alan       USTA HACKER VE PREFÖSÖR DOKTOR  ÖZLEMMM AKARRRR
