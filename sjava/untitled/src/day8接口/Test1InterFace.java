package day8接口;
/*
    接口 （都属于抽象类）
    [修饰符] interface 接口名{}

    接口支持 一个接口继承多个接口
    接口中只包含两部分 1、常量 2、抽象方法
 */


public class Test1InterFace{
    public static void main(String[] args) {
        System.out.println(C.PI);
    }
}

interface A{
//    接口中的方法都是抽象方法   public abstract 修饰的
//    public abstract void doSome();
//    因此可以省略不写
    void doSome();

//    接口中的属性都是常量   public static final 修饰的
//    public static final double PI = 3.14159;
//    因此可以省略不写
    double PI = 3.14159;
}

interface B{

}

interface C extends A, B{

}