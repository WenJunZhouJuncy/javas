package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest7 {
    public static void main(String[] args) {
        FileReader fread = null;
        FileWriter fwriter = null;

        try {
            fread = new FileReader("src/1IOFileTest/Test1");
            fwriter = new FileWriter("src/1IOFileTest/Test3");

            char[] chars = new char[5];
            int count = 0;
            while ((count = fread.read(chars)) != -1) {
                fwriter.write(chars, 0, count);
                System.out.print("");
            }
            fwriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fwriter != null) {
                System.out.println("1");
                try {
                    fwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fread != null) {
                try {
                    fread.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
