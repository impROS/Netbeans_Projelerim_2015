
import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.DefaultCaret;
import static javax.swing.text.DefaultCaret.ALWAYS_UPDATE;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author x.impROS.x
 */
public class anaMenu extends javax.swing.JFrame {

    static DefaultListModel listMuzik = new DefaultListModel();
    ftpClass ftpIslemleri = new ftpClass("depolog.hol.es", "u162212072", "vizvizOsman");
    Timer timer;

    class timerMesajGuncelle extends TimerTask {

        @Override
        public synchronized void run() {
            try {
                System.out.println("Timer Calisiyor");
                txtKonusmalar.setText(urlOku("http://improsyazilim.com/Sohbet/muzikList.html"));
                DefaultCaret caret = (DefaultCaret) txtKonusmalar.getCaret();
                caret.setUpdatePolicy(ALWAYS_UPDATE);
                System.out.println("text Guncellendi metot");
            } catch (IOException ex) {
                System.out.println("Guncellenemedi " + ex.getMessage());
            }
        }
    }

    public anaMenu() {

        try {
            initComponents();

            timer = new Timer();
            timer.schedule(new timerMesajGuncelle(), 0,
                    1 * 1000);
            jList2.setModel(listMuzik);
            try {
            } catch (Exception ex) {
                lblDurum.setText("Hata || " + ex.getMessage());
            }
            mesajGuncelle();

        } catch (Exception ex) {
            lblDurum.setText("Hata || " + ex.getMessage());
        }

    }

    public void mesajGuncelle() {
        try {
            txtKonusmalar.setText(urlOku("http://improsyazilim.com/Sohbet/muzikList.html"));
            System.out.println("text Guncellendi metot");
        } catch (IOException ex) {
            System.out.println("Guncellenemedi " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuncelle = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        lblDurum = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKonusmalar = new javax.swing.JTextArea();
        txtYazi = new javax.swing.JTextField();
        btnEkle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setName("frmSohbet"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuncelle.setText("Güncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 80, -1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(252, 50, 0));
        jTextField1.setText("User");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 90, -1));

        lblDurum.setText("Hazır");
        getContentPane().add(lblDurum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jScrollPane2.setEnabled(false);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 0, 0));

        txtKonusmalar.setEditable(false);
        txtKonusmalar.setBackground(new java.awt.Color(0, 0, 0));
        txtKonusmalar.setColumns(20);
        txtKonusmalar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtKonusmalar.setForeground(new java.awt.Color(191, 255, 2));
        txtKonusmalar.setRows(5);
        txtKonusmalar.setText("sadasd");
        txtKonusmalar.setToolTipText("");
        txtKonusmalar.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtKonusmalar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 460, 370));

        txtYazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYaziActionPerformed(evt);
            }
        });
        txtYazi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtYaziKeyPressed(evt);
            }
        });
        getContentPane().add(txtYazi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 320, -1));

        btnEkle.setText("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });
        getContentPane().add(btnEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 484, 0, 10));

        getAccessibleContext().setAccessibleParent(btnEkle);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  public String urlOku(String url) throws MalformedURLException, IOException {
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
        strVeri = strVeri.replace("<br>", "\n");
        return strVeri;
    }

    public static void yaziPost(String yazi) {
        try {
            // open a connection to the site
            URL url = new URL("http://improsyazilim.com/Sohbet/sohbet.php");
            URLConnection con = url.openConnection();
            // activate the output
            con.setDoOutput(true);
            // send your parameters to your site
            try (PrintStream ps = new PrintStream(con.getOutputStream())) {
                // send your parameters to your site
                ps.print("deger=" + yazi);

                // we have to get the input stream in order to actually send the request
                con.getInputStream();

                // close the print stream
            }
        } catch (MalformedURLException e) {
            System.err.println("Hata " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Hata " + e.getMessage());

        }
    }
    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        mesajGuncelle();
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        try {

            exportList(listMuzik, new File("muzikList.txt"));
            //  ftpGuncelle();
            // jTextArea1.setText(jTextArea1.getText() + "\n" + jTextField2.getText());
            yaziPost(jTextField1.getText() + " : " + txtYazi.getText());
            txtYazi.setText("");
            txtKonusmalar.setText(urlOku("http://improsyazilim.com/Sohbet/muzikList.html"));
            //  ftpIslemleri.download("muzikList.txt", "muzikList.txt");

        } catch (IOException ex) {
            lblDurum.setText("Hata" + ex.getMessage());
        }
    }//GEN-LAST:event_btnEkleActionPerformed

    private void txtYaziKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYaziKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                // jTextArea1.setText(jTextArea1.getText() + "\n" + jTextField2.getText());

                yaziPost(jTextField1.getText() + " : " + txtYazi.getText());
                txtYazi.setText("");
                txtKonusmalar.setText(urlOku("http://improsyazilim.com/Sohbet/muzikList.html"));
            } catch (IOException ex) {
                lblDurum.setText("Hata || " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_txtYaziKeyPressed

    private void txtYaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYaziActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYaziActionPerformed

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
            java.util.logging.Logger.getLogger(anaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anaMenu().setVisible(true);
            }
        });

    }

    //<editor-fold defaultstate="collapsed" desc="URL İndirme">
    private void urlKaydet(final String dosyaAdi, final String urlLinki)
            throws MalformedURLException, IOException {
        BufferedInputStream giris = null;
        FileOutputStream dosyaYazici = null;
        try {
            giris = new BufferedInputStream(new URL(urlLinki).openStream());
            dosyaYazici = new FileOutputStream(dosyaAdi);
            final byte veriler[] = new byte[1024];
            int say;
            while ((say = giris.read(veriler, 0, 1024)) != -1) {
                dosyaYazici.write(veriler, 0, say);
            }
        } finally {
            if (giris != null) {
                giris.close();
            }
            if (dosyaYazici != null) {
                dosyaYazici.close();
            }
        }
    }
//</editor-fold>

    private void oku() {
        listMuzik.removeAllElements();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("muzikList.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                listMuzik.addElement(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void exportList(ListModel model, File f) throws IOException {
        try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(f), "UTF-8"))) {
            int len = model.getSize();
            for (int i = 0; i < len; i++) {
                pw.println(model.getElementAt(i).toString());
            }
        }
    }

    private void ftpGuncelle() {
        ftpClass ftp1 = new ftpClass("depolog.hol.es", "u162212072", "vizvizOsman");

        if (ftp1.Upload("muzikList.txt", "/../public_html/depo/muzik.txt")) {
            lblDurum.setText("Dosya Basariyla Guncellendi");
        } else {
            lblDurum.setText("Hata.Dosya Guncelenemedi");
        }
    }

    private static void createAndShowGUI() {
        //Check the SystemTray support
        if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            return;
        }
        final PopupMenu popup = new PopupMenu();
        final TrayIcon trayIcon
                = new TrayIcon(createImage("bulb.gif", "tray icon"));
        final SystemTray tray = SystemTray.getSystemTray();

        // Create a popup menu components
        MenuItem aboutItem = new MenuItem("About");
        CheckboxMenuItem cb1 = new CheckboxMenuItem("Set auto size");
        CheckboxMenuItem cb2 = new CheckboxMenuItem("Set tooltip");
        Menu displayMenu = new Menu("Display");
        MenuItem errorItem = new MenuItem("Error");
        MenuItem warningItem = new MenuItem("Warning");
        MenuItem infoItem = new MenuItem("Info");
        MenuItem noneItem = new MenuItem("None");
        MenuItem exitItem = new MenuItem("Exit");

        //Add components to popup menu
        popup.add(aboutItem);
        popup.addSeparator();
        popup.add(cb1);
        popup.add(cb2);
        popup.addSeparator();
        popup.add(displayMenu);
        displayMenu.add(errorItem);
        displayMenu.add(warningItem);
        displayMenu.add(infoItem);
        displayMenu.add(noneItem);
        popup.add(exitItem);

        trayIcon.setPopupMenu(popup);

        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
            return;
        }

        trayIcon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "This dialog box is run from System Tray");
            }
        });

        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "This dialog box is run from the About menu item");
            }
        });

        cb1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int cb1Id = e.getStateChange();
                if (cb1Id == ItemEvent.SELECTED) {
                    trayIcon.setImageAutoSize(true);
                } else {
                    trayIcon.setImageAutoSize(false);
                }
            }
        });

        cb2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int cb2Id = e.getStateChange();
                if (cb2Id == ItemEvent.SELECTED) {
                    trayIcon.setToolTip("Sun TrayIcon");
                } else {
                    trayIcon.setToolTip(null);
                }
            }
        });

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuItem item = (MenuItem) e.getSource();
                //TrayIcon.MessageType type = null;
                System.out.println(item.getLabel());
                if ("Error".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.ERROR;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is an error message", TrayIcon.MessageType.ERROR);

                } else if ("Warning".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.WARNING;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is a warning message", TrayIcon.MessageType.WARNING);

                } else if ("Info".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.INFO;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is an info message", TrayIcon.MessageType.INFO);

                } else if ("None".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.NONE;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is an ordinary message", TrayIcon.MessageType.NONE);
                }
            }
        };

        errorItem.addActionListener(listener);
        warningItem.addActionListener(listener);
        infoItem.addActionListener(listener);
        noneItem.addActionListener(listener);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tray.remove(trayIcon);
                System.exit(0);
            }
        });
    }

    //Obtain the image URL
    protected static Image createImage(String path, String description) {
        URL imageURL = anaMenu.class.getResource(path);

        if (imageURL == null) {
            System.err.println("Resource not found: " + path);
            return null;
        } else {
            return (new ImageIcon(imageURL, description)).getImage();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDurum;
    private javax.swing.JTextArea txtKonusmalar;
    private javax.swing.JTextField txtYazi;
    // End of variables declaration//GEN-END:variables
}
