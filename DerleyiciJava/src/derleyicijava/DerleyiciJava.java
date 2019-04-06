import javax.swing.table.*;
import static java.lang.Math.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.Locale;
import java.text.*;
import java.util.*;
import javax.tools.*;
public class DerleyiciJava {
public static void compileandrun(String fileName)
{
try{
JavaCompiler javac = ToolProvider.getSystemJavaCompiler();
javac.run(null,null,null,fileName);}
catch(NullPointerException e1) {System.err.println("NULL POINTER");}
}
public static void main(String arg[])
{
    
//String fileName=JOptionPane.showInputDialog("Enter file name (a.txt): ");
compileandrun("HosgeldinizGZ.java");
HosgeldinizGZ x=new HosgeldinizGZ();
x.deneme();
}
}