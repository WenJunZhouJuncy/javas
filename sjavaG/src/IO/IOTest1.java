package IO;

import java.io.*;

/*
    IO流分类
      1、按照流的方向进行分类(以内存参照)
        往内存中去，叫做输入Input
        从内存中出，叫做输出Output
      2、按照读取数据的方式进行分类
        按字节的方式读取数据，一次读取一个字节byte，可以读任何类型文件
        按字符的方式读取数据，一次读取一个字符，只能读取普通文本txt

      java IO流的四大家族（都是抽象类public abstract class）
        java.io.InputStream   字节输入流
        java.io.OutputStream  字节输出流

        java.io.Reader        字符输入流
        java.io.Writer        字符输出流

        注：以Stream结尾的类都是字节流  以Reader或Writer结尾的都是字符流

      所有的流（字符 字节）都实现了java.io.Closeable 接口  都是可关闭的  都有close()方法  使用完一定要关闭

      所有的输出流都实现了java.io.Flushable 接口  都是可刷新的  都有flush()方法  在最终输出之后一定要调用
      强行将管道中剩余数据输出完  刷新的作用就是刷新管道

      掌握16个流
        文件专属
            java.io.FileInputStream
            java.io.FileOutputStream
            java.io.FileReader
            java.io.FileWriter

        转换流（将 字节流 转换成 字符流）
            java.io.InputStreamReader
            java.io.OutputStreamWriter

        缓冲流专属
            java.io.BufferedInputStream
            java.io.BufferedOutputStream
            java.io.BufferedReader
            java.io.BufferedWriter

        数据流专属
            java.io.DataInputStream
            java.io.DataOutputStream

        标准输出流
            java.io.PrintStream
            java.io.PrintWriter

        对象专属流
            java.io.ObjectInputStream
            java.io.ObjectOutputStream
 */
public class IOTest1 {
    public static void main(String[] args) {

        FileInputStream fsl = null;
        String path = Thread.currentThread().getContextClassLoader().getResource("1IOFileTest/Test3").getPath();
        try {
            fsl = new FileInputStream(path);
            byte[] bytes = new byte[5];
            int i = 0;
            System.out.println(path);
            while ((i = fsl.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fsl != null) {
                try {
                    fsl.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
//        try {
//            byte[] bytes = new byte[5];
//            fsl = new FileInputStream("D:\\my\\sjavaG\\src\\1IOFileTest\\FileInputStream");
//
//            int i = 0;
//
//            while ((i = fsl.read(bytes)) != -1) {
//                System.out.print(new String(bytes, 0, i));
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fsl != null) {
//                try {
//                    fsl.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}
