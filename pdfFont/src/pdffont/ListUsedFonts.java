package pdffont;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeSet;

import pdffont.ListUsedFonts.*;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfDictionary;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfReader;

public class ListUsedFonts {

    /**
     * The resulting PDF file.
     */
    public static String RESULT
            = "results/part4/chapter16/fonts.txt";

    /**
     * Creates a Set containing information about the fonts in the src PDF file.
     *
     * @param src the path to a PDF file
     * @return
     * @throws IOException
     */
    public Set<String> listFonts(String src) throws IOException {
        Set<String> set = new TreeSet<>();
        PdfReader reader = new PdfReader(src);
        PdfDictionary resources;
        for (int k = 1; k <= reader.getNumberOfPages(); ++k) {
            resources = reader.getPageN(k).getAsDict(PdfName.RESOURCES);
            processResource(set, resources);
        }
        reader.close();
        return set;
    }

    /**
     * Extracts the font names from page or XObject resources.
     *
     * @param set the set with the font names
     * @param resource
     */
    public static void processResource(Set<String> set, PdfDictionary resource) {
        if (resource == null) {
            return;
        }
        PdfDictionary xobjects = resource.getAsDict(PdfName.XOBJECT);
        if (xobjects != null) {
            xobjects.getKeys().stream().forEach((key) -> {
                processResource(set, xobjects.getAsDict(key));
            });
        }
        PdfDictionary fonts = resource.getAsDict(PdfName.FONT);
        if (fonts == null) {
            return;
        }
        PdfDictionary font;
        for (PdfName key : fonts.getKeys()) {
            font = fonts.getAsDict(key);
            String name = font.getAsName(PdfName.BASEFONT).toString();
            String deneme = PdfName.AUTHOR.toString();
            System.out.println(deneme);
            if (name.length() > 8 && name.charAt(7) == '+') {
                name = String.format("%s subset (%s)", name.substring(8), name.substring(1, 7));
            } else {
                name = name.substring(1);
                PdfDictionary desc = font.getAsDict(PdfName.FONTDESCRIPTOR);
                if (desc == null) {
                    name += " nofontdescriptor";
                } else if (desc.get(PdfName.FONTFILE) != null) {
                    name += " (Type 1) embedded";
                } else if (desc.get(PdfName.FONTFILE2) != null) {
                    name += " (TrueType) embedded";
                } else if (desc.get(PdfName.FONTFILE3) != null) {
                    name += " (" + font.getAsName(PdfName.SUBTYPE).toString().substring(1) + ") embedded";
                }
            }
            set.add(name);
        }
    }

    /**
     * Main method.
     *
     * @param args no arguments needed
     * @throws DocumentException
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, DocumentException {
        new FontTypes().createPdf(FontTypes.RESULT);
        Set<String> set = new ListUsedFonts().listFonts(FontTypes.RESULT);
        try (PrintWriter out = new PrintWriter(new FileOutputStream(RESULT))) {
            for (String fontname : set) {
                out.println(fontname);
            }
            out.flush();
        }
    }
}
