
package masaustuyol;

import java.io.File;

public class MasaustuYol {

 public static void main(String[] args) {    
        String desktopPath =System.getProperty("user.home") + "\\"+"Desktop";
        String s = "\"" + desktopPath.replace("\\","\\\\") + "\\\\" +"satis" + "\"";
        System.out.print(s);
        File f = new File(s);
        boolean mkdir = f.mkdir();
        System.out.println(mkdir);
    }
    
}
