package soru_cozum2;

import javax.swing.JOptionPane;

public class Soru_Cozum2 {

    public static void main(String[] args) {
//
//        String yazi = "aaaa";
//        String yukseklik = JOptionPane.showInputDialog("Lütfen yuksekligi giriniz");
//        String ziplamaSayisi = JOptionPane.showInputDialog("Lütfen zıplama sayisini giriniz");
        int i = 0;//=JOptionPane.YES_NO_CANCEL_OPTION;
//JOptionPane.showMessageDialog(null, "impROS", null, 0, null);
//JOptionPane.showMessageDialog(null, "impROS", null, 1, null);
//JOptionPane.showMessageDialog(null, "impROS", null, 2, null);
//JOptionPane.showMessageDialog(null, "impROS", null, 3, null);
i =JOptionPane.showConfirmDialog(null, "impROS", null, i);

        System.out.println(""+i);
    }

}
