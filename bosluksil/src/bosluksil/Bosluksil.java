
package bosluksil;


public class Bosluksil {


    public static void main(String[] args) {
String text = readFileAsString("textfile.txt");
text = text.replace("\n", "").replace("\r", "");
    }
    
}
