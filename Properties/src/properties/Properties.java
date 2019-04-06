/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

/**
 *
 * @author x.impROS.x
 */
public class Properties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Properties prop = System.getProperties();
    System.out.println("Tum degerler");
    prop.list(System.out);
    }
    
}
/*
sun.cpu.isalist=amd64
user.language=tr
user.home=C:\Users\x.impROS.x
os.name=Windows 8.1
java.io.tmpdir=C:\Users\XIMPRO~1.X\AppData\Local\Temp\
os.arch=amd64
sun.desktop=windows
sun.cpu.isalist=amd64
*/
