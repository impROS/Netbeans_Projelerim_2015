package drivesexample;

import java.io.File;
import javax.swing.filechooser.FileSystemView;

public class DrivesExample {

    public static void main(String[] args) {
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();

        System.out.println("Home directory: " + fileSystemView.getHomeDirectory());

        File[] fileRoots = File.listRoots();
int i;
        for ( i = 0; i < fileRoots.length; i++) {

        
        {

            System.out.println();

            System.out.println("System Drive: " + fileRoots[i]);

            System.out.println("Drive Display name: " + fileSystemView.getSystemDisplayName(fileRoots[i]));

            System.out.println("Is drive: " + fileSystemView.isDrive(fileRoots[i]));

            System.out.println("Is floppy: " + fileSystemView.isFloppyDrive(fileRoots[i]));

            System.out.println("Readable: " + fileRoots[i].canRead());

            System.out.println("Writable: " + fileRoots[i].canWrite());

            System.out.println();

        }
    }
    }
}
