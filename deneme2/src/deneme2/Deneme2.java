/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author x.impROS.x
 */
public class Deneme2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Public JPanel initPanel()
        {
            String[] tamamString = initString();
            ImageIcon hataIcon = new ImageIcon("images/hata2.png");
            JOptionPane.showMessageDialog(getParent(), tamamString, "Erişim Şifrenizi Hatalı Girdiniz !", getDefaultCloseOperation(), hataIcon);
        }   

    public String[] initString() {
        UIManager.put("OptionPane.okButtonText", "Tamam");
        String JOpHataMsj[] = {"Erişim Şifrenizi Hatalı Girdiniz !"};
        return JOpHataMsj;
    }
}

}
