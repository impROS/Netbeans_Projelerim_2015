package copyfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFile {

    public static void main(String[] args) throws IOException {
        File kaynak = new File("E:\\dosya.txt");
        System.out.println("kaynak:" + kaynak.length());
        File hedef = new File("E:\\dosya32.txt");
        System.out.println("hedef:" + hedef.length());
        copyFile(kaynak, hedef);
    }

    public static void copyFile(File from, File to) throws IOException {

        if (to.exists() && to.length() == from.length()) {
            System.out.println("Dosya Zaten Var");
        } else {
            Files.copy(from.toPath(), to.toPath());
            System.out.println("basarili");
        }
    }
}
