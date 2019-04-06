package getproperty;

import javax.swing.JOptionPane;

public class GetProperty {

    public static void main(String[] args) {

        String strYol = System.getProperty("user.dir");
        JOptionPane.showMessageDialog(null, strYol);

        String s, s1;
        try {
            s = System.getProperty("os.name", "not specified");
            s1 = "isletim sistemi : " + s + "\n";
            s = System.getProperty("java.version", "not specified");
            s1 += " su anda çalisan java programi versiyonu : " + s + "\n";
            s = System.getProperty("user.home", "not specified");
            s1 += " (user.home) directory'si : " + s + "\n";
            s = System.getProperty("java.home", "not specified");
            s1 += "(java.home) directory'si: " + s + "\n";
        } catch (Exception e) {
            s1 = "Hata yakalandi " + e.toString();
        }
        JOptionPane.showMessageDialog(null, s1);

    }
}