/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexcel;
import jp.ne.so_net.ga2.no_ji.jcom.excel8.*;
import jp.ne.so_net.ga2.no_ji.jcom.*;
import java.io.File;
import java.util.Date;

class TestExcel {
 public static void main(String[] args) throws Exception {
   ReleaseManager rm = new ReleaseManager();
   try {
    System.out.println("EXCEL startup...");
    // if already started, open new window
    ExcelApplication excel = new ExcelApplication(rm);
    excel.Visible(true);
    // display any information
    System.out.println("Version="+excel.Version());
    System.out.println("UserName="+excel.UserName());
    System.out.println("Caption="+excel.Caption());
    System.out.println("Value="+excel.Value());

    ExcelWorkbooks xlBooks = excel.Workbooks();
    ExcelWorkbook xlBook = xlBooks.Add();   // create new book

    // enumurate all files
    System.out.println
      ("set infomation of files in current directory to cell ...");
    ExcelWorksheets xlSheets = xlBook.Worksheets();
    ExcelWorksheet xlSheet = xlSheets.Item(1);
    ExcelRange xlRange = xlSheet.Cells();

    xlRange.Item(1,1).Value("filename" );
    xlRange.Item(2,1).Value("size" );
    xlRange.Item(3,1).Value("last modified time");
    xlRange.Item(4,1).Value("is directory");
    xlRange.Item(5,1).Value("is file");
    xlRange.Item(6,1).Value("can read");
    xlRange.Item(7,1).Value("can write");

    File path = new File("./");
    String[] filenames = path.list();
    for(int i=0; i<filenames.length; i++) {
        File file = new File(filenames[i]);
        System.out.println(file);
        xlRange.Item(1,i+2).Value( file.getName() );
        xlRange.Item(2,i+2).Value( (int)file.length() );
        xlRange.Item(3,i+2).Value( new Date(file.lastModified()) );
        xlRange.Item(4,i+2).Value( file.isDirectory()?"Yes":"No" );
        xlRange.Item(5,i+2).Value( file.isFile()?"Yes":"No" );
        xlRange.Item(6,i+2).Value( file.canRead()?"Yes":"No" );
        xlRange.Item(7,i+2).Value( file.canWrite()?"Yes":"No" );
    }
    String expression = "=Sum(B2:B"+(filenames.length+1)+")";
    System.out.println
       ("embed equation, calculate sum of filesize: "+expression);
    xlRange.Item(1,filenames.length+2).Value("sum");
    xlRange.Item(2,filenames.length+2).Formula(expression);
    xlRange.Columns().AutoFit();    // fit columns

    // comment out, if print out.
    // output default printer.
    //   System.out.println("print out...");
    //   xlSheet.PrintOut();

    // comment out, if book save to file.
    // if no path, save to(My Documents)
    // System.out.println
    //   ("save to file... (My Documents)\\testExcel.xls");
    // xlBook.SaveAs("testExcel.xls");

    xlBook.Close(false,null,false);
    excel.Quit();

    System.out.println("thank you .");
   }
   catch(Exception e) { e.printStackTrace(); }
   finally { rm.release(); }
  }
}