package registry2;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Registry2 {
    
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        try {
            String value = WinRegistry.readString(
                    WinRegistry.HKEY_LOCAL_MACHINE, //HKEY
 "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion", //Key
  "ProductName");                              //ValueName
            
            System.out.println("Windows Distribution = " + value);
value = WinRegistry.readString( WinRegistry.HKEY_LOCAL_MACHINE,"SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion", "RegisteredOwner");
System.out.println("Windows Distribution = " + value);
            //WinRegistry.writeStringValue(hkey, value, value, value);
//String value = "\"javaw -jar " + System.getProperty("user.dir") + "\\myJar.jar\"";

String value2 = System.getProperty("user.dir")+"\\baslangicJar.jar";
WinRegistry.writeStringValue(WinRegistry.HKEY_CURRENT_USER, "Software\\Microsoft\\Windows\\CurrentVersion\\Run", "denemeBaslangic", value2);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(Registry2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
