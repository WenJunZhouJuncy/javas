package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest2 {
    public static void main(String[] args) {
//        FileInputStream fis = null;
//        byte[] bytes = new byte[5];
//        try {
//            fis = new FileInputStream("src/1IOFileTest/Test1");
//            int i = 0;
//            while (( i = fis.read(bytes)) != -1) {
//                System.out.print(new String(bytes, 0, i));
//            }
//
//            AvailableTest.availableTs();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/1IOFileTest/Test1");
            byte[] bytes = new byte[5];

            int count = 0;

            while ((count = fis.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, count));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
                e.getMessage();
            }
        }
    }
}
//available()  获取当前剩余字节数 不适合读取大数据量文件
//skip()  跳过当前几个字节
class AvailableTest {
    public static void availableTs() {
        FileInputStream fls = null;
        try {
            fls = new FileInputStream("src/1IOFileTest/Test1");
            int i = fls.available();
            byte[] bytes = new byte[i];
            fls.skip(1);
            fls.read(bytes);
//            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fls != null) {
                try {
                    fls.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
