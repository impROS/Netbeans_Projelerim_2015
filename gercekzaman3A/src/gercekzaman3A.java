
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class gercekzaman3A {

    public static void compile(String name) {
        try {
            JavaCompiler javac = ToolProvider.getSystemJavaCompiler();
            int rc = javac.run(null, null, null, name);
        } catch (NullPointerException e1) {
            System.err.println("NULL POINTER");
        }
    }

    public static void createfunction(String name, String function) {
        String s = "";
        String name1 = name + ".java";
        try {
            PrintWriter ffout = new PrintWriter(new BufferedWriter(new FileWriter(name1)));
            s += "class " + name + " extends f_x\n";
            s += " {\n";
            s += " public double func (double x)\n";
            s += "{ double y=" + function + ";\n";
            s += " return y;\n";
            s += "}\n";
            s += "}\n";
            ffout.println(s);
//System.out.println(s);
            ffout.close();
        } catch (IOException e1) {
            System.err.println("girdi hatası.");
        } catch (NumberFormatException e2) {
        };
    }

    public gercekzaman3A() {
        String fileName = "f2D";
        String function = JOptionPane.showInputDialog("Enter function statement f(x) ");
        createfunction(fileName, function);
        compile(fileName + ".java");
    }
}
