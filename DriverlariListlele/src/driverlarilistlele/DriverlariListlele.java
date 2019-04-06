
package driverlarilistlele;
import java.io.File;
public class DriverlariListlele {

    public static void main(String[] args) {
   	File[] diskDrives = File.listRoots();
for (File file : diskDrives) {
System.out.println(file);
    }
    
}
}
