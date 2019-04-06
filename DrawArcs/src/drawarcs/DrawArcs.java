
package drawarcs;

  import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;

 public class DrawArcs extends JFrame
 {
 public DrawArcs()
 {
  super( "Drawing Arcs" );
  setSize( 300, 170 );
  show();
 }

 public void paint( Graphics g )
 {
  // start at 0 and sweep 360 degrees
  g.setColor( Color.yellow );
  g.drawRect( 15, 35, 80, 80 );
  g.setColor( Color.black );
  g.drawArc( 15, 35, 80, 80, 0, 360 );
  // start at 0 and sweep 110 degrees
  g.setColor( Color.yellow );
  g.drawRect( 100, 35, 80, 80 );
  g.setColor( Color.black );
  g.drawArc( 100, 35, 80, 80, 0, 110 );

  // start at 0 and sweep -270 degrees
  g.setColor( Color.yellow );
  g.drawRect( 185, 35, 80, 80 );
  g.setColor( Color.black );
  g.drawArc( 185, 35, 80, 80, 0, -270 );

  // start at 0 and sweep 360 degrees
  g.fillArc( 15, 120, 80, 40, 0, 360 );

  // start at 270 and sweep -90 degrees
  g.fillArc( 100, 120, 80, 40, 270, -90 );

  // start at 0 and sweep -270 degrees
  g.fillArc( 185, 120, 80, 40, 0, -270 );
 }

 public static void main( String args[] )
 {
  DrawArcs app = new DrawArcs();

  app.addWindowListener( new WindowAdapter()
  {
   public void windowClosing( WindowEvent e )
   {
    System.exit( 0 );
   }
  } );
 }
 }