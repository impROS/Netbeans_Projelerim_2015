/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porttara;

import java.net.Socket;

public class portScan extends Thread {

    String host = "";
    Socket s;

    public portScan(String host) {
        this.host = host;
    }

    @Override
    public void run() {
        for (int i = 25; i < 10000; i++) {
            try {

                s = new Socket(host, i);
                System.out.println(host + " : Port " + i + " is open.");

                
            } catch (Exception ec) {
                //    System.err.println(ec);
            }
        }
    }

}
