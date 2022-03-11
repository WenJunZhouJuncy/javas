package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest4 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/1IOFileTest/Test1");
            fos = new FileOutputStream("src/1IOFileTest/Test2");

//            int i = fis.available();
//            byte[] bytefis = new byte[i];
//            fis.read(bytefis);
//            fos.write(bytefis);

//            byte[] bytes = new byte[5];
//            int count = 0;
//            while ((count = fis.read(bytes)) != -1) {
//                fos.write(bytes, 0, count);
//            }
//
//            fos.flush();





            byte[] bytes = new byte[5];
            int count = 0;
            while ((count = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, count);
            }
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
