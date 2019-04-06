/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogramlama2;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Sunucu extends JFrame{
private JTextArea textArea=new JTextArea();
private int Port = 9090;
    public Sunucu() {
    setTitle("Sunucu");
    setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        setLayout(new BorderLayout());
       add(new JScrollPane(textArea));
       
       try{
       ServerSocket sunucuSoket =new ServerSocket(Port);
       textArea.append("Sunucu "+new Date()+"tarihinde basladi");
       
       Socket soket =sunucuSoket.accept();
           DataInputStream okuyucu =new DataInputStream(soket.getInputStream());
           DataOutputStream yazici =new DataOutputStream(soket.getOutputStream());
           
           while(true){
                 String sohbetI =okuyucu.readLine();
        yazici.writeChars(sohbetI);
       
        
       textArea.append("Istemci : "+sohbetI+"\n");
           Scanner giris =new Scanner(System.in);
           String sohbetS=giris.nextLine();
           yazici.writeBytes(sohbetS);
           
           textArea.append("sunucu :  ="+sohbetS+"\n");
          // textArea.append("istemciye gonderilen alan bilgisi"+alan+"\n");
           
           }
       }catch(IOException hata){
           System.err.println(hata);
       }
    }
 
}
