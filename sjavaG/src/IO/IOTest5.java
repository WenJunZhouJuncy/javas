package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest5 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("src/1IOFileTest/Test1");

            char[] chars = new char[4];
            int count = 0;

            while ((count = reader.read(chars)) != -1) {
                System.out.print(new String(chars, 0, count));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

