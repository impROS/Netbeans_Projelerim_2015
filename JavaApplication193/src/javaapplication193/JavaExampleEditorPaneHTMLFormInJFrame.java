import java.awt.*;


import javax.swing.*;


import java.awt.event.*;


import java.io.IOException;


public class JavaExampleEditorPaneHTMLFormInJFrame extends JFrame


 {


       JEditorPane EdtrPn = new JEditorPane();


       public JavaExampleEditorPaneHTMLFormInJFrame()


       {


           super("Example Of Pane Editor HTML Form In Java Swing");


           Container Cntnr = getContentPane();


           EdtrPn.setEditable(false);


           String URL = "file:" + System.getProperty("user.dir") + System.getProperty("file.separator")+"page.html";


            try


               {


                  EdtrPn.setPage(URL);


               }


                 catch(IOException e) {}


                 Cntnr.add(EdtrPn);


        }


               public static void main(String as[])


               {


                   final JFrame frm = new JavaExampleEditorPaneHTMLFormInJFrame();


                   frm.setBounds(110, 110, 310, 310);


                   frm.setVisible(true);


                   frm.setBackground(Color.White);


                   frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);


                   frm.addWindowListener(new WindowAdapter()


                {


                       public void windowClosing(WindowEvent e1)


                     {


                             System.exit(0);


                         }


                    });


                }


  }
