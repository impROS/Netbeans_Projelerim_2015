
package registry1;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;


public class Registry1 {


    public static void main(final String[] args) throws BackingStoreException {
System.out.println("-------------------------------");
        Preferences systemRoot = Preferences.systemRoot();
        Preferences preferences = systemRoot.node("settings.ini");
System.out.println("-------------------------------");
        systemRoot.put("foo", "bar");
        systemRoot.put("baz", "lolz");
        System.out.println("-------------------------------");

        String[] keys = preferences.keys();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("-------------------------------");

        keys = systemRoot.keys();
        for (String key : keys) {
            System.out.println(key);
        }
    }

}
