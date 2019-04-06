package youtubedowload;

import com.github.axet.vget.VGet;
import java.io.File;
import java.net.URL;

public class YoutubeDowload {

    public static void main(String[] args) {
        try {
            // ex: http://www.youtube.com/watch?v=Nj6PFaDmp6c
            String url = "http://www.youtube.com/watch?v=Nj6PFaDmp6c";
            // ex: "/Users/axet/Downloads"
            String path = "/Users/axet/Downloads";

            VGet v = new VGet(new URL(url), new File(path));

            v.download();
        } catch (Exception e) {
            System.out.println("Hata || " + e.getMessage());
        }
    }

}
