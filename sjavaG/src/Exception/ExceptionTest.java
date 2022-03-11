package Exception;

import java.io.FileInputStream;
import java.io.IOError;

/*
 Object下有Throwable
   Throwable(可抛出异常)下有 Error(不可处理 直接退出JVM) 和 Exception(可处理)
     Exception下有两个分支
        Exception 编译时异常 编译阶段需要处理才能编译通过
        RuntimeException 运行时异常

异常如果一直上抛不处理  最终抛给了main方法   main方法继续上抛给JVM  终止程序执行
 */
public class ExceptionTest {
    public static void main(String[] args) throws Exception {
        Exception e1 = new Exception();
        try {
            System.out.println(100 / 0);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("aaa");

//        1、处理异常 上抛
        doSome();

    }

    public static void doSome1(){
//        2、处理异常
        try {
            doSome();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected static void doSome() throws Exception {
        System.out.println();
    }
}