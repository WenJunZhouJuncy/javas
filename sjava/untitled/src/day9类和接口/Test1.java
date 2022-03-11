package day9类和接口;

//类和接口
//类与类之间 接口与接口之间 继承关系  extends
//类和接口之间  实现关系  implements
//类实现接口  需要重写接口中的所有方法  public
//注： 接口中的方法都是public abstract修饰  重写时需要加public
class aa {

}

class bb extends aa implements ee{

}

interface cc {

}

interface dd{


}

interface ee extends cc,dd{

}

public class Test1{
    public static void main(String[] args) {
        A a = new B();

        a.doSome1();
        a.doSome3(1);
//        ((B)a).doSome4();
//        a.doSome4();
        if (a instanceof B) {
            B b = (B)a;
            b.doSome4();
        }
    }
}

interface A {
//    public static final double PI = 3.14;
    double PI = 3.14;

    public abstract void doSome1();

    void doSome2();

    int doSome3(int i);
}

class B implements A {
    @java.lang.Override
    public void doSome2() {
        System.out.println("doSome2");
    }

    @java.lang.Override
    public void doSome1() {

    }

    public int doSome3(int i) {
        return i;
    }

    public void doSome4() {
        System.out.println("doSome4");
    }
}

