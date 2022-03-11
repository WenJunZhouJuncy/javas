package Collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {

        HashMap m1 = new HashMap();
        m1.put(null, "key可以是null");

        Properties p1 = new Properties();   // key和value都只能是string类型

        p1.setProperty("string", "都是string");
        p1.setProperty("key是String", "value也是string");

        p1.getProperty("string");



        Properties p2 = new Properties();
        FileReader fr = null;
        try {
            fr = new FileReader("src/1IOFileTest/IOAndProperties");
            p2.load(fr);

            String username = p2.getProperty("username");
            String passwrod = p2.getProperty("passwrod");
            String vity = p2.getProperty("vity");
            System.out.println(username);
            System.out.println(passwrod);
            System.out.println(vity);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
