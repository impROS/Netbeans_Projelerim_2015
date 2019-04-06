package dropbox_api;

import com.dropbox.core.*;
import java.io.*;
import java.util.Locale;

public class DropBox_Api {

    public static void main(String[] args) throws IOException, DbxException {
        // Get your app key and secret from the Dropbox developers website.
        
        String code = "u8dvZxKwMVAAAAAAAAAACDwzlnBejmYafOpoNxA7X_vQ-ZCOSkHUCXfg1pxtOK43";

        DbxRequestConfig config = new DbxRequestConfig("drpbx_Pro1", Locale.getDefault().toString());

        DbxClient client = new DbxClient(config, code);
        File dosya = new File("deneme_drb.txt");
        try (FileInputStream inputStream = new FileInputStream(dosya)) {
            client.uploadFile("/deneme.txt", DbxWriteMode.add(), dosya.length(), inputStream);
            System.out.println("basarili");
        }catch(Exception ex){
         System.out.println("Hata ||| "+ex.getMessage());
        }
       

    }
}
