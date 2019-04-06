
package porttara;

import java.io.IOException;

public class Porttara {


    public static void main(String[] args) throws IOException {
        portScan tara1 = new portScan("192.168.1.101");
        portScan tara2 = new portScan("192.168.1.109");
        portScan tara3 = new portScan("192.168.1.110");

        tara1.start();
        tara2.start();
        tara3.start();

    }

}
