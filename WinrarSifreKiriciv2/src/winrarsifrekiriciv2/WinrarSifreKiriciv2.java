
package winrarsifrekiriciv2;

import java.io.IOException;
import java.util.Map;

public class WinrarSifreKiriciv2 {

    public static void main(String[] args) {
 
Runtime r = Runtime.getRuntime();
Process p = null;
try
{
p = r.exec("cmd.exe /c D:\\Winrar\\Winrar.exe -IBCK x -p4 -c- D:\\Winrar\\cıktı.rar D:\\Winrar ");

System.out.print("çalıştı");
}
catch(Exception e)
{
System.out.print("çalışmadı");
}
}
    
}
