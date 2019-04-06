
package test;

import java.io.File;
import java.io.FilenameFilter;


public class Test {
public static void main(String[] args) {
String dir = "E:\\deneme";
String ext = ".rar";
findFiles(dir, ext);
}
private static void findFiles(String dir, String ext) {
File file = new File(dir);
if(!file.exists()) System.out.println(dir + " Directory doesn't exists");
File[] listFiles = file.listFiles(new MyFileNameFilter(ext));
if(listFiles.length ==0){
System.out.println(dir + "doesn't have any file with extension "+ext);
}else{
for(File f : listFiles)
System.out.println("File: "+dir+File.separator+f.getName());
}
}

//FileNameFilter implementation
public static class MyFileNameFilter implements FilenameFilter{

private final String ext;

public MyFileNameFilter(String ext){
this.ext = ext.toLowerCase();
}
@Override
public boolean accept(File dir, String name) {
return name.toLowerCase().endsWith(ext);
}

    
}
}