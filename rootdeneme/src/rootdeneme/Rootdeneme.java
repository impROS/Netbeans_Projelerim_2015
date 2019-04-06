
package rootdeneme;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Rootdeneme {


    public static void main(String[] args) {
Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
for (Path name: dirs) {
    System.out.println(name.toFile());
}
    }
    
}
