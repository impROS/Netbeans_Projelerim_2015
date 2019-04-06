
package animasyoncanvas;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AnimasyonCanvas extends Canvas{
   
  private Vector images=new Vector();
  private int current=0;
  
  public AnimasyonCanvas(){
      java.util.Timer timer=new java.util.Timer();
          TimerTask task=new TimerTask(){
          public void run(){
              repaint();
          }
      };
      timer.schedule(task,0,500);
  }
  public void addImage(String filePath){
    Toolkit toolkit=Toolkit.getDefaultToolkit();
    Image image=toolkit.getImage(filePath);   
    images.add(image);
  }
  public void paint(Graphics g){
    current=current%images.size();
    Image image=(Image)images.get(current);
    g.drawImage(image,0,0,this);
    current++;      
  }

  public static void main(String[] args){
    Frame frame=new Frame();
    AnimasyonCanvas canvas=new AnimasyonCanvas();       
    String folder= "C:\\Users\\x.impROS.x\\Documents\\NetBeansProjects\\AnimasyonCanvas\\";
    canvas.addImage(folder+"frame_1.gif");
    canvas.addImage(folder+"frame_2.gif");
    canvas.addImage(folder+"frame_3.gif");
    canvas.addImage(folder+"frame_4.gif");
    canvas.addImage(folder+"frame_5.gif");
    frame.add(canvas);        
    frame.setBounds(0,0,100,130);
    frame.setVisible(true);
  }
    
}