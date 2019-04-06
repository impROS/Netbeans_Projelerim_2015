/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customapp;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;

/// creating the Button with custom look
class CButton extends JButton
{

    BasicStroke basicStroke = new BasicStroke(2.0f);
    public CButton(String txt) {
        super(txt);
        setForeground(Color.WHITE);
        setFont(getFont().deriveFont(Font.BOLD, 13));
        setContentAreaFilled(false);
        setBorder(null);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(new Color(0xFFAA00));

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(basicStroke);

        int archH =  (getHeight()-4)/2;
        g2d.drawRoundRect(3, 3, getWidth()-4, getHeight()-4, archH, archH);

        if(getModel().isRollover())
        {
            g2d.fillRoundRect(3, 3, getWidth()-4, getHeight()-4, archH, archH);
            setForeground(Color.black);

        }
        else 
        {
            setForeground(Color.white);
        }
        g2d.dispose();

        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.

    }



}

/** creating the MainContainer panel with custom look **/
// custom painting to with paintComponent(Graphics g) and paint(Graphics g)
class MainContainer extends JPanel
{

    public BufferedImage gradientImage = null;
    public static BufferedImage textureImg; // made it static just for easyness
    public static boolean loadingFinished = false;

    public MainContainer() {

        setBorder(new EmptyBorder(50, 50, 50, 50)); // setting the insets 
        // learn about GridBagLayout from the linked page about LayoutManager
        setLayout(new GridBagLayout()); 

        JLabel usrNameLabel = new JLabel("User Name");
        changeCompFont(usrNameLabel);

        JTextField usrNameFeild = new JTextField("user name");
        changeCompFont(usrNameFeild);

        // create compund border for text and password feild with left padding 5 px
        Border compundBorder = BorderFactory.createCompoundBorder(
                                            new LineBorder(Color.white, 2), 
                                            new EmptyBorder(2, 5, 2, 2));
        usrNameFeild.setBorder(compundBorder);


        usrNameFeild.setOpaque(false);
        usrNameLabel.setLabelFor(usrNameFeild);

        JLabel passwordLabel = new JLabel("Password");
        changeCompFont(passwordLabel);

        JPasswordField passFeild = new JPasswordField("Password");
        changeCompFont(passFeild);
        passFeild.setBorder(compundBorder);

        passFeild.setOpaque(false);
        passwordLabel.setLabelFor(passFeild);

        // working with GridBagConstraints, please check out the linked online tutorial 
        GridBagConstraints labCnst = new GridBagConstraints();
        GridBagConstraints txtCnst = new GridBagConstraints();

        labCnst.insets = new Insets(0, 0, 5, 10);
        txtCnst.insets =  new Insets(0, 0, 5, 10);

        labCnst.ipady = txtCnst.ipady = 10;
        txtCnst.fill = labCnst.fill = GridBagConstraints.HORIZONTAL;

        labCnst.gridx = 0;
        txtCnst.gridx = 1;

        labCnst.gridwidth = 1;
        txtCnst.gridwidth = 2;

        labCnst.weightx = 0.3;
        txtCnst.weightx = 0.7;

        txtCnst.gridy = labCnst.gridy = 0;
        add(usrNameLabel, labCnst);
        add(usrNameFeild, txtCnst);


        txtCnst.gridy = labCnst.gridy = 1;
        add(passwordLabel, labCnst);
        add(passFeild, txtCnst);

        labCnst.gridx = 2;
        labCnst.gridy = 2;
        labCnst.ipady = 13;
        labCnst.insets = new Insets(0, 0, 0, 150);
        JButton submitButt = new CButton("Log IN");
        add(submitButt, labCnst);

    }

    public void changeCompFont(JComponent comp)
    {
        comp.setForeground(Color.WHITE);
        comp.setFont(getFont().deriveFont(Font.BOLD, 13));
    }

    // To PAINT THE TEXTURE ABOVE THE COMPONENTS, 
    //DON'T DO IT UNTIL YOU UNDERSTAND PAINTING MECHANISM FULLY
    @Override
    public void paint(Graphics g) {
         super.paint(g); //To change body of generated methods, choose Tools | Templates.

        Graphics2D g2d = (Graphics2D)g.create(); // cloning to work, it is safer aproach
        Rectangle2D txRect = new Rectangle2D.Double(0, 0, textureImg.getWidth(), textureImg.getHeight());
        TexturePaint txPaint = new TexturePaint(textureImg, txRect);
        g2d.setPaint(txPaint);

        //make the texture transparent
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.dispose();// disposing the graphics object 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2d = (Graphics2D) g.create();

        if(gradientImage==null || gradientImage.getHeight() != getHeight())
        {
            gradientImage = createGradientImg();
        }

        g2d.drawImage(gradientImage, 0, 0, getWidth(), getHeight(), this);
        g2d.dispose();
    }

    public BufferedImage createGradientImg()
    {
       BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
       /// background gradient paint, linear gradient paint for the background
       /// Gradient paint rendering could be made more optimized
            LinearGradientPaint lgrPaint =  new LinearGradientPaint(0.0f, 0.0f, getWidth(), getHeight(),
                                                                new float[] { 0.0f, 0.5f, 0.6f, 1.0f },
                                                                new Color[] { new Color(0x002AFF),
                                                                new Color(0x0CAAF9),
                                                                new Color(0x0CAAF9),
                                                                new Color(0x002AFF) });


            Graphics2D g2d = (Graphics2D) image.getGraphics();
            g2d.setPaint(lgrPaint);
            //g2d.shear(0.2, 0);
            g2d.fillRect(0, 0, getWidth(), getHeight());

            g2d.dispose();
            //g2d.drawImage(textureImg, 0, 0, getWidth(), getHeight(), null);
            return image;
    }


}

public class CustomApp {

    public static void main(String[] args) throws IOException {

        // load the texture resource image
        System.out.println("Please wait, Loading Texture : http://www.brewsterwallcovering.com/data/default/images/catalog/original/289-5757.jpg");
        MainContainer.textureImg = ImageIO.read(new File("E:\\impROS Masaüstü Yönetim Sistemi\\C# Projeler\\MasaüstüArkaplanDeğiştir\\MasaüstüArkaplanDeğiştir\\Resources\\arkaplan.jpg"));
        System.out.println("Loading finished. Starting the Demo!");

        MainContainer.textureImg = MainContainer.textureImg.getSubimage(0, 0, 200, 200);

        // Starting the Swing GUI in the EDT, learn about it
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrame frame = new JFrame("Demo: LogIn Dialogue");

                // set frame size as Demo perposes, otherwise not recommended
                frame.setSize(new Dimension(500, 300)); 
                MainContainer container = new MainContainer();

                frame.add(new MainContainer());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });
    }
}