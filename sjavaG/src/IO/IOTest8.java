package IO;

import java.io.*;

/*
    缓冲流
    java.io.BufferedInputStream
    java.io.BufferedOutputStream
    java.io.BufferedReader
    java.io.BufferedWriter

    转换流（将 字节流 转换成 字符流）
    java.io.InputStreamReader
    java.io.OutputStreamWriter
 */
public class IOTest8 {
    public static void main(String[] args) throws IOException {
        FileReader freader = null;
        BufferedReader breader = null;
//        当一个流的构造方法需要传入一个流时
//        被传入的流称为节点流(FileReader)
//        这个流称为处理流或包装流(BufferedReader)
        freader = new FileReader("src/1IOFileTest/Test1");
        breader = new BufferedReader(freader);

//        readLine()方法读取当前一行;最后读完返回null
        String line = "";
        while ((line = breader.readLine()) != null) {
            System.out.println(line);
        }

//        只需要关闭包装流  节点流自动关闭  源码中close()方法也调用了节点流的closer()方法
        breader.close();


//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream());
    }
}
