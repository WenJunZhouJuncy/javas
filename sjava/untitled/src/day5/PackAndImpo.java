import java.util.Scanner;
public class PackAndImpo {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
    }
}

/*      公司域名倒写 + 项目名 + 模块名 + 功能名
     package com.bjpowrnode.user.server
     1、编译**.java 生成 **.class
     2、编译后需要手动创建目录并将class文件放入 （com/bjpowrnode/user/server/**.class）
     3、运行时类名com.bjpowrnode.user.server.**

     编译 + 生成目录
     1、javac -d 编译后文件路径 源文件路径
     如 。。。。 C:\ D:\java\hello.java       javac -d . *.java 编译当前路径下所有java文件 生成到当前路径下

     ----------------
     完整类名 com.bjpowrnode.user.server.hello.class
     创建对象 com.bjpowrnode.user.server.hello hello = new com.bjpowrnode.user.server.hello()
     同一个包下可以省略 hello hello = new hello()
     不同包下需要完整类名，否则编译报错
     因此使用import 导入
     import com.bjpowrnode.user.server.hello
     import com.bjpowrnode.user.server.*

final   修饰的类无法继承
        修饰的方法无法覆盖
        修饰的变量只能赋值一次
        修饰的实例变量必须初始化，一般和static联合使用
        public static final double PI = 3.1415926;

访问控制权限修饰符
    public > protected > 默认 > pritave

            同类      同包      子类      所有
   -----------------------------------------------------
public      可以      可以      可以      可以
protected   可以      可以      可以      不能
默认        可以      可以      不能      不能
private     可以      不能      不能      不能

*/