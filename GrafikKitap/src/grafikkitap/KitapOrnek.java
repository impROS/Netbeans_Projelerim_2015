/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikkitap;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class KitapOrnek extends Applet{
   
       @Override
       public void paint(Graphics g){
           this.setBackground(Color.BLACK);
           g.setColor(Color.white);
       int x=-15,y;
       while(x<=15){
       y=(int)((10*Math.sin(5*x))+(5*Math.cos(3*x)));
       g.drawLine(10*x+200,10*y+200,10*x+200,10*y+200);
       x+=1;
       
       }
       }
}
