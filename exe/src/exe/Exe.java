
package exe;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Exe {


    public static void main(String[] args) throws IOException {
	Scanner giris = new Scanner(System.in);
		Runtime runtime = Runtime.getRuntime();
		String[] cmd = new String[3];
		cmd[0] = "cmd.exe" ;
                cmd[1] = "/C";
                cmd[2] =  "dir D:\\Winrar\\";

		Process proc = runtime.exec(cmd);
		
		InputStream is = proc.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
                	String line;
		while ((line = br.readLine()) != null) {
			line+=line;
                      
		}
                
                
                int c=giris.nextInt();
                
           
		String[] cmd2 = new String[3];
		cmd2[0] = "cmd.exe" ;
                cmd2[1] = "/C";
                cmd2[2] =  "dir D:\\Winrar\\";
System.out.println("1");
	 proc = runtime.exec(cmd2);
		System.out.println("q");
		is = proc.getInputStream();
		isr = new InputStreamReader(is);
		 br = new BufferedReader(isr);
		
		String line2=null;
		while ((line2 = br.readLine()) != null) {
			line2+=line2;
                      
		}
                if(!line2.equals(line))System.out.println("Olumsuz");
                else {
                    System.out.println("Esit");
        }
	}
}
      

