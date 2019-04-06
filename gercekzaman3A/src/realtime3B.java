import java.awt.image.*;
import javax.swing.*;
import java.util.Locale;
import java.text.*;
import java.util.*;
import javax.swing.table.*;
import static java.lang.Math.*;
public class realtime3B
{
public realtime3B()
{
fa ff=new fa();
double x=Double.parseDouble(JOptionPane.showInputDialog("x = "));
System.out.println("x="+x+"y="+ff.func(x));
}
}