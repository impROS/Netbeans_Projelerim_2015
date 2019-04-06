
package socketprogramlamaıstemci;

import javax.swing.JFrame;

public class SocketProgramlamaIstemci {


    public static void main(String[] args) {
     Istemci istemci =new Istemci();
     istemci.setTitle("İstemci");
     istemci.setSize(500,500);
     istemci.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     istemci.setVisible(true);
    }
    
}
