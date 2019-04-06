
package ısadmin;
import com.sun.jna.platform.win32.Advapi32;
import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinNT.PSIDByReference;
import com.sun.jna.platform.win32.WinNT.WELL_KNOWN_SID_TYPE;
import java.io.IOException;

// https://github.com/twall/jna#readme
//    you need 2 jars : jna-3.5.1.jar and platform-3.5.1.jar

public class IsAdmin {


    private IsAdmin() {  }

  public static boolean isAdmin() {
    String groups[] =
      (new com.sun.security.auth.module.NTSystem()).getGroupIDs();
    for (String group : groups) {
          if (group.equals("S-1-5-32-544"))
              return true;
    }
    return false;
  }

  public static void main(String[] args) throws IOException {
    System.out.println("Current user is admin ? " + IsAdmin.isAdmin());
  }
}