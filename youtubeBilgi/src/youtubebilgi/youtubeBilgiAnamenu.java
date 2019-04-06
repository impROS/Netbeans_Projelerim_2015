/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtubebilgi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author x.impROS.x
 */
public class youtubeBilgiAnamenu extends javax.swing.JFrame {

    /**
     * Creates new form youtubeBilgiAnamenu
     */
    public youtubeBilgiAnamenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtYoutubeLink = new javax.swing.JTextField();
        txtEmbedKod = new javax.swing.JTextField();
        txtVideoAdi = new javax.swing.JTextField();
        txtVideoSuresi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVeriCek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtYoutubeLink.setText("https://www.youtube.com/watch?v=SPYo4-mhLMs");

        jLabel1.setText("Youtube Linki :");

        jLabel2.setText("Embed Kod : ");

        jLabel3.setText("Video Adı :");

        jLabel4.setText("Video Süresi :");

        btnVeriCek.setText("Veri Çek");
        btnVeriCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeriCekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtYoutubeLink, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(txtEmbedKod)
                    .addComponent(txtVideoAdi)
                    .addComponent(txtVideoSuresi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVeriCek)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYoutubeLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnVeriCek))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmbedKod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVideoAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVideoSuresi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVeriCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeriCekActionPerformed
        try {
            String strYoutubeVeri = urlOku(txtYoutubeLink.getText());
            String strVideoAdi = videoAdiCek(strYoutubeVeri);
            //String strEmdedKod = embedKod(txtYoutubeLink.getText());
            String strEmdedKod = embedKod2(strYoutubeVeri);
            
            txtVideoAdi.setText(strVideoAdi);
            txtEmbedKod.setText(strEmdedKod);
            
        } catch (IOException ex) {
            System.out.println("Hata || " + ex.getMessage());
        }
    }//GEN-LAST:event_btnVeriCekActionPerformed
    private String embedKod(String strYoutubeLink) throws IOException {
        String strEmbedKod = strYoutubeLink.replace("https://www.youtube.com/watch?v=", "https://www.youtube.com/embed/");
        return strEmbedKod;
    }
      private String embedKod2(String strYoutubeLink) throws IOException {
    String strEmdbedKod = "";
        try {
            
            byte ptext[] = strYoutubeLink.getBytes();
            String value = new String(ptext, "UTF-8");
            
            String[] tds = StringUtils.substringsBetween(value, "<link itemprop=\"embedURL\" href=\"", "\">");
            for (String td : tds) {
                strEmdbedKod += td.trim();
            }
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Hata || " + ex.getMessage());
        }
        
        return strEmdbedKod;
    }
    private String videoAdiCek(String testHtml) throws IOException {
        String strVideoAd = "";
        try {
            
            byte ptext[] = testHtml.getBytes();
            String value = new String(ptext, "UTF-8");
            
            String[] tds = StringUtils.substringsBetween(value, "<meta property=\"og:title\" content=\"", "\">");
            for (String td : tds) {
                strVideoAd += td.trim();
            }
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Hata || " + ex.getMessage());
        }
        
        return strVideoAd;
    }
    
    private String urlOku(String url) throws MalformedURLException, IOException {
        String strVeri = "";
        URL okuyucu = new URL(url);//url olarak internetten rastgele bir txt dosyası verdim
        try (BufferedReader bf = new BufferedReader(//bf  adında karakter tabanlı  okuyucumuzu oluşturduk
                new InputStreamReader(okuyucu.openStream()))) {// input stream ile urlmizi okumaya calisiyoruz
            String veri;//her bir satıra veri diyoruz
            while ((veri = bf.readLine()) != null)//veri boş bir değere eşit olmadığı sürece
            {
                strVeri += veri;
                
            }
        }
        return strVeri;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(youtubeBilgiAnamenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(youtubeBilgiAnamenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(youtubeBilgiAnamenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(youtubeBilgiAnamenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new youtubeBilgiAnamenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVeriCek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtEmbedKod;
    private javax.swing.JTextField txtVideoAdi;
    private javax.swing.JTextField txtVideoSuresi;
    private javax.swing.JTextField txtYoutubeLink;
    // End of variables declaration//GEN-END:variables
}