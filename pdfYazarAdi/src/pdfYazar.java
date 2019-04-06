
import static java.util.Arrays.*;
import static javax.print.DocFlavor.BYTE_ARRAY.PDF;
import javax.swing.text.Document;


public class pdfYazar {
public static void main(String[] args){
Document doc = PDF.open(pdfFilePath);
for (String key : doc.getAttributeKeys()) {
    System.out.printf("%s: %s", key, doc.getAttribute(key));
    System.out.println();
}
 
// print the value of the Author attribute to System.out
String authorName = (String)stream.getAttribute(Document.ATTR_AUTHOR);
System.out.println("Author: " + authorName);
 
doc.close();
}
}
