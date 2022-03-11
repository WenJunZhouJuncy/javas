package ObjectTest;
/*
    1、内部类：在类的内部又定义了一个新的类。称为内部类

    2、内部类的分类：
        静态内部类：类似于静态变量
        实例内部类：类似于实例变量
        局部内部类：类似于局部变量

    3、匿名内部类
 */
public class InnerClass {
    public static void main(String[] args) {
//        方法一  引出匿名内部类
        MyMath m = new MyMath();
        int i = m.doSome(new ComputeImp(), 10, 20);
        System.out.println(i);
//          方法二 匿名内部类
        int j = m.doSome(new Compute() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        },10, 20);
        System.out.println(j);
    }
}

class InnerClassTest1{
    static class ICT1{//    静态内部类
    }
    class ICT2{//    实例内部类
    }
    public void doSome() {
        class ICT3{//        局部内部类
        }
    }
}

//匿名内部类
interface Compute{
    int sum(int a, int b);
}

class ComputeImp implements Compute{
    public int sum(int a, int b) {
        return a + b;
    }
}

class MyMath{
    public int doSome(Compute c, int a, int b) {
        return c.sum(a, b);
    }
}


