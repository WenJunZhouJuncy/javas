public class StaticTest{

    static int i = 10;
    int j;

//    实例代码块
    {
//        在对象创建的时候  前执行  每创建一次 执行一次
        System.out.println("实例代码块");
    }
    // 静态代码块
    static {
        StaticTest s = new StaticTest();
        System.out.println(s.j);
        System.out.println(i);
        System.out.println("static1");
    }

    static {
        System.out.println("static2");
    }

    public static void main(String[] args) {
        System.out.println("main begin");
    }
}

/*
 静态代码块
 类加载时执行、自上而下、只执行一次
 static1
 static2
 main begin

 */