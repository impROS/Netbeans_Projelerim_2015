package javaapplication185;

import java.nio.file.FileStore;
import java.nio.file.FileSystems;

public class JavaApplication185 {

    public static void main(String[] args) {
        for (FileStore store : FileSystems.getDefault().getFileStores()) {
            System.out.printf("%s: %s%n", store.name(), store.type());
        }
    }

}
