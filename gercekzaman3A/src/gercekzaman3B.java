import static java.lang.Math.*;
import javax.swing.JOptionPane;
public class gercekzaman3B
{ public gercekzaman3B()
{
f2D ff=new f2D();
double x=Double.parseDouble(JOptionPane.showInputDialog("x = "));
System.out.println("x="+x+"y="+ff.func(x));
}
}