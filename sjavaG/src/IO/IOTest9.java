package IO;

import java.io.*;

public class IOTest9 {
    public static void main(String[] args) throws IOException {
//        1、
//        FileInputStream fis = new FileInputStream("src/1IOFileTest/Test1");
//        InputStreamReader isr = new InputStreamReader(fis);     // 转换流  将字节流转换成字符流
//        BufferedReader br = new BufferedReader(isr);    // 只能传入字符流  不能传入字节流

//        2、
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/1IOFileTest/Test2")));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();


//        BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/1IOFileTest/Test4", true)));

        bw.write("你好");
        bw.write("\n");
        bw.write("world");
        bw.write("\n");
        bw.write("BufferedWriter()");

        bw.flush();
        bw.close();

    }
}
