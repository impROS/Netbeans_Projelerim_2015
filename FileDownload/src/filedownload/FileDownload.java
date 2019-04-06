package filedownload;


    import java.io.*;
    import java.net.*;
     
    public class FileDownload {
     public static void download(String address, String localFileName) {
      OutputStream out = null;
      URLConnection conn = null;
      InputStream  in = null;
      try {
       URL url = new URL(address);
       out = new BufferedOutputStream(
        new FileOutputStream(localFileName));
       conn = url.openConnection();
       in = conn.getInputStream();
       
       byte[] buffer = new byte[1024];
       int numRead;
       long numWritten = 0;
       
       ///
       int urlBoyut=getFileSize(url);
          System.out.println("Url Boyut"+urlBoyut);
       while ((numRead = in.read(buffer)) != -1) {
        out.write(buffer, 0, numRead);
        numWritten += numRead;
           System.out.println("%"+(numWritten/(urlBoyut/100))+"");
       }
       System.out.println(localFileName + "\t" + numWritten);
      } catch (Exception exception) {
       exception.printStackTrace();
      } finally {
       try {
        if (in != null) {
         in.close();
        }
        if (out != null) {
         out.close();
        }
       } catch (IOException ioe) {
       }
      }
     }
     
     public static void download(String address) {
      int lastIndex = address.lastIndexOf('/');
      if (lastIndex >= 0 &&
          lastIndex < address.length() - 1) {
       download(address, address.substring(lastIndex + 1));
      } else {
       System.err.println("adres = " + address);
      }
     }
     
     public static void main(String[] args) {
      download("http://www.melihsakarya.com/seminer/JBoss%20Seam.pdf","test.pdf");
     }
     
     private static int getFileSize(URL url) {
    HttpURLConnection conn = null;
    try {
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("HEAD");
        conn.getInputStream();
        return conn.getContentLength();
    } catch (IOException e) {
        return -1;
    } finally {
        conn.disconnect();
    }
}
    }


