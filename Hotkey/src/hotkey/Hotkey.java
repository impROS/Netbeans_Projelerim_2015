
package hotkey;
/*
 * http://j4guiang.blogspot.com/
 */
 import com.melloware.jintellitype.HotkeyListener;
 import com.melloware.jintellitype.JIntellitype;

 public class Hotkey implements HotkeyListener {
     static final int KEY_A = 65;
     static final int KEY_B = 66;
     static final int KEY_C = 67;
     static final int KEY_X = 90;

     @Override
     public void onHotKey(int key) {
         switch (key) {
             case KEY_A:
                 System.out.println("ctrl+alt+a");
                 break;
             case KEY_B:
                 System.out.println("ctrl+alt+b");
                 break;
             case KEY_C:
                  System.out.println("ctrl+alt+c");
                   break;
               case KEY_X:
                 System.out.println("ctrl+alt+X");
                 System.out.println("Bye");
         JIntellitype.getInstance().unregisterHotKey(KEY_A);
         JIntellitype.getInstance().unregisterHotKey(KEY_B);
         JIntellitype.getInstance().unregisterHotKey(KEY_C);
         JIntellitype.getInstance().unregisterHotKey(KEY_X);
        System.exit(0);
        }

     }

     void initHotkey() {
         JIntellitype.getInstance().registerHotKey(KEY_A, JIntellitype.MOD_CONTROL + JIntellitype.MOD_ALT,
                (int) 'A');  
         JIntellitype.getInstance().registerHotKey(KEY_B, JIntellitype.MOD_CONTROL + JIntellitype.MOD_ALT,
                (int) 'B');
         JIntellitype.getInstance().registerHotKey(KEY_C, JIntellitype.MOD_CONTROL + JIntellitype.MOD_ALT,
                (int) 'C');
         JIntellitype.getInstance().registerHotKey(KEY_X, JIntellitype.MOD_CONTROL + JIntellitype.MOD_ALT,
                (int) 'X');
         JIntellitype.getInstance().addHotKeyListener(this);
     }

     public static void main(String[] args) {
          new Hotkey().initHotkey();
         while (true) {
              try {
                Thread.sleep(10000);
              } catch (Exception ex) {
                 System.exit(0);
              }
         }
      }
 }