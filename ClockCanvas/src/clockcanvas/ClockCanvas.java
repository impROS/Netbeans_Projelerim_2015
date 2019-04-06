/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockcanvas;
import java.awt.*;
import java.util.*;

public class ClockCanvas extends Canvas{

  private final static int SLICE_DEGREE=6;
  private Point center=new Point(100,100);
  private int radius=80;

  public ClockCanvas(){
    Timer timer=new Timer();
    TimerTask task=new TimerTask(){
	public void run() {
	    repaint();
	}
    };
    timer.scheduleAtFixedRate(task,0,1000);
  }
  public void paint(Graphics g){
      Calendar now=Calendar.getInstance();
      drawDial(g);
      drawSecondHand(g,now);
      drawMinuteHand(g,now);
      drawHourHand(g,now);
  }
  private void drawDial(Graphics g) {
    g.drawOval(center.x-radius,center.y-radius,2*radius,2*radius);
    int numbersRadius=radius-8;
    for(int i=1;i<=12;i++){
	double hour=Math.PI/6;
	int x=(int)(center.x-5+(numbersRadius)*Math.sin(i*hour));
	int y=(int)(center.x+5-(numbersRadius)*Math.cos(i*hour));	         
	g.drawString(Integer.toString(i),x,y);
    }
  }

  private void drawSecondHand(Graphics g,Calendar now) {
    int second = now.get(Calendar.SECOND);	
    double radian=Math.toRadians(SLICE_DEGREE*second);
    int x=(int)(center.x+(radius-5)*Math.sin(radian));
    int y=(int)(center.y-(radius-5)*Math.cos(radian));
    g.drawLine(center.x,center.y,x,y);
  }

  private void drawMinuteHand(Graphics g,Calendar now) {
    int minute=now.get(Calendar.MINUTE);
    double radian=Math.toRadians(SLICE_DEGREE*minute);	
    int x=(int)(center.x+(radius-10)*Math.sin(radian));
    int y=(int)(center.y-(radius-10)*Math.cos(radian));	
    g.drawLine(center.x,center.y,x,y);
  }
  private void drawHourHand(Graphics g,Calendar now) {
    int hour = now.get(Calendar.HOUR);      
    int minute=now.get(Calendar.MINUTE);
    double radian=Math.toRadians(30*hour+minute/2);		
    int x=(int)(center.x+(radius-25)*Math.sin(radian));
    int y=(int)(center.y-(radius-25)*Math.cos(radian));
    g.drawLine(center.x,center.y,x,y);
  }

  public static void main(String[] args) {
    Frame frame=new Frame();
    frame.setTitle("Clock Canvas");    
    frame.setLayout(new BorderLayout());
    frame.add(BorderLayout.CENTER,new ClockCanvas());
    frame.setBounds(0,0,220,220);
    frame.setVisible(true);
  }
}