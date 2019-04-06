package png3;

import java.io.IOException;
import javax.imageio.IIOException;
import com.idrsolutions.image.*;
import com.idrsolutions.image.png.PngCompressor;
import java.io.File;
public class Png3 {

    public static void main(String[] args) throws IIOException, IOException {
PngCompressor d = new PngCompressor();
PngCompressor.compress(new File("E:\\impROS Masaüstü Yönetim Sistemi\\Çalışma Odası\\png\\lena.png"),
        new File("E:\\impROS Masaüstü Yönetim Sistemi\\Çalışma Odası\\png\\lenacikti.png"));
}
}
