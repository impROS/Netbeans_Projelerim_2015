
package cube;
import java.awt.*; // Use graphics
import java.applet.*; // Use applets
import javax.swing.*; // Use swing stuff (GUI)
import java.util.*; // Use util
public class Cube extends JApplet
{
     public class CubePanel extends JPanel
     {
          private double x_verts[] = {-48,48,48,-48}; // Four vertices for a cube
          private double y_verts[] = {48,48,-48,-48};
          private double shape_save[] = {-48,48,48,-48,48,48,-48,-48}; // Original shape before transformation
          private double rotation_pos = 0; // Rotation position
          private double chroma_pos = 64; // Color animation position
          void CubePanel()
          {
               // Does nothing here
          }
          private void drawCube(Graphics page,int xpos,int ypos)
          {
               // Reset to original shape
               for(int index = 0;index < 4;index++)
                    x_verts[index] = shape_save[index]; // Copy X's
               for(int index = 4;index < 8;index++)
                    y_verts[index-4] = shape_save[index]; // Copy Y's
               // Rotate all the points like so...
               double temp_x,temp_y;
               for(int index = 0;index < 4;index++)
               {
                    // Rotate the square normally over the y axis in the xyz plane (I think)
                    temp_x = x_verts[index]*Math.cos(rotation_pos)-y_verts[index]*Math.sin(rotation_pos);
                    temp_y = x_verts[index]*Math.sin(rotation_pos)+y_verts[index]*Math.cos(rotation_pos);
                    x_verts[index] = temp_x;
                    y_verts[index] = temp_y;
                    // And the square rotates to look 3D 2x along the x axis in the xyz plane (I think)
                    y_verts[index] = y_verts[index]*Math.sin(rotation_pos/2);
               }
               // Add a degree of rotation
               rotation_pos += 0.001;
               chroma_pos++;
               if(chroma_pos > 255)
                    chroma_pos = 64; // Reset to flash color
               // Draws the cube in question
               // Selects the color
               Color tempcolor = new Color(0,0,(int)chroma_pos);
               page.setColor(tempcolor);
               for(int index = 0;index < 4;index++)
               {
                    if(index < 3)
                    {
                         page.drawLine((int)x_verts[index]+xpos,(int)y_verts[index]+ypos,(int)x_verts[index+1]+xpos,(int)y_verts[index+1]+ypos);
                    }
                    else
                    {
                         page.drawLine((int)x_verts[index]+xpos,(int)y_verts[index]+ypos,(int)x_verts[0]+xpos,(int)y_verts[0]+ypos);
                    }
               }
          }
          @Override
          public void paintComponent(Graphics page)
          {
               super.paintComponent(page);
               // Use a black background
               setBackground(Color.black);
               // Draw the cube
               drawCube(page,128,128);
               repaint();
          }
     }
     @Override
     public void init()
     {
          setSize(256,256);
          getContentPane().add(new CubePanel());
     }
}