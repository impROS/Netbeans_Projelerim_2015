/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;
import java.util.*;     
import javax.swing.JOptionPane;
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
          String KisiBilgisi[][][]=new String [3][2][4];

KisiBilgisi[0][0][0]=JOptionPane.showInputDialog(null,"1.Kişinin Adını Soyadını Giriniz"); KisiBilgisi[0][0][1]=JOptionPane.showInputDialog(null,KisiBilgisi[0][0][0]+" Hangi Şehirde Doğdu ?");
KisiBilgisi[0][0][2]=JOptionPane.showInputDialog(null, KisiBilgisi[0][0][0]+" Hangi Semtte Doğdu ?");
KisiBilgisi[0][0][3]=JOptionPane.showInputDialog(null,KisiBilgisi[0][0][0]+"Hangi Hastahanede Doğdu ?");
KisiBilgisi[0][1][0]=JOptionPane.showInputDialog(null, KisiBilgisi[0][0][0]+" Hangi Şehirde Yaşıyor ?");
KisiBilgisi[0][1][1]=JOptionPane.showInputDialog(null, KisiBilgisi[0][0][0]+" Hangi Semtte Yaşıyor ?");
KisiBilgisi[0][1][2]=JOptionPane.showInputDialog(null, KisiBilgisi[0][0][0]+" Hangi Mahallede Yaşıyor ?");



       

        JOptionPane.showMessageDialog(null, KisiBilgisi[0][0][0] + "n Doğduğu Yer : "
        + KisiBilgisi[0][0][1] + " / " + KisiBilgisi[0][0][2] + " / " + KisiBilgisi[0][0][3]
        + "n Yaşadığı Yer : " + KisiBilgisi[0][1][0] + " / " + KisiBilgisi[0][1][1] + " / "
        + KisiBilgisi[0][1][2] + "n");
    }
    
}
