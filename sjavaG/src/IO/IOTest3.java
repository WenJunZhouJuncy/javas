package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest3 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        String path = Thread.currentThread().getContextClassLoader().getResource("1IOFileTest/Test3").getPath();
        try {
            System.out.println(path);
            fos = new FileOutputStream(path, true);

            byte[] a = {97,98,99};
            fos.write(a);
            fos.write(new byte[]{100, 101, 102});

            String s = "getBytes";
            byte[] b = s.getBytes();
            fos.write(b);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


//        FileOutputStream fos = null;
//        try {
//            // 路径不存在会新建文件再写入内容  存在会清空文件内容后再写入新的内容
////            fos = new FileOutputStream("D:\\my\\sjavaG\\src\\1IOFileTest\\FileOutputStream");  // 写入的路径
//
//            // 以追加的方式写入内容 不会清空原先文件内容
//            fos = new FileOutputStream("D:\\\\my\\\\sjavaG\\\\src\\\\1IOFileTest\\\\FileOutputStream", true);
//
//            fos.write(new byte[]{97, 98, 99, 100});
//            String s = "中国人";
////            将字符串转换成byte数组
//            byte[] bytes = s.getBytes();
//            fos.write(bytes);
//            fos.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fos != null) {
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}
