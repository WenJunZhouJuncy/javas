package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    标准输出流
        PrintStream
        PrintWriter
 */

public class IOTest11 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps1 = System.out;
        ps1.println("111");
        ps1.println("333");
        ps1.println("222");
        ps1.println("444");

        PrintStream ps = new PrintStream(new FileOutputStream("src/1IOFileTest/log", true));
//        改变System.out.println输出位置src/1IOFileTest/log  (默认输出在控制台)
        System.setOut(ps);

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String dates = sdf.format(date);
        System.out.println(dates + " 登录操作");
        System.out.println(dates + " 登录成功");
        System.out.println(dates + " 首页");
        System.out.println(dates + " 设置");



        PrintStream ps2 = new PrintStream(new FileOutputStream("src/1IOFileTest/log1"));

        System.setOut(ps2);
    }
}
