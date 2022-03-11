package IO;

import java.io.FileWriter;
import java.io.IOException;

public class IOTest6 {
    public static void main(String[] args) {
        FileWriter fwriter = null;
        try {
            fwriter = new FileWriter("src/1IOFileTest/Test1", true);

//            char[] chars = {'中', '国', '人'};
//            fwriter.write(chars);
            String s = "\npublic class Test1 {\n" +
                    "    public static void mian(String[] args) {\n" +
                    "        System.out.println(\"FileInputStream\")\n" +
                    "    }\n" +
                    "}";

            fwriter.write(s);

            fwriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fwriter != null) {
                try {
                    fwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
