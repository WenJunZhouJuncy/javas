package day9类和接口;
/*
    接口和抽象类的区别

    抽象类是半抽象的；接口是完全抽象的

    抽象类中存在变量、常量、构造方法、实例方法、静态方法、抽象方法; 接口中只存在抽象方法和常量

    一个类只能继承(extedns)一个类；一个接口可以继承(extends)多个接口

    一个类可以可以实现(implements)多个接口

 */
import java.util.*;
public class Test {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        A b = new B();
        A c = new C();

//        b.doSome1();
//        b.doSome2();
//
//        c.doSome1();
//        c.doSome2();

        D d1 = new D();
        d1.setA(b);

        D d2 = new D(c);

        d1.zuoCai();

        d2.zuoCai();
    }
}

abstract class K{
    int i;
    static final int j = 10;
    public K() {

    }
    public void dos(){

    }
    public abstract void dsome();
}

interface A{
    void doSome1();
    void doSome2();
}

class B implements A{
    @Override
    public void doSome1() {
        System.out.println("b dosome1");
    }

    @Override
    public void doSome2() {
        System.out.println("b dosome2");
    }
}

class C implements A{
    @Override
    public void doSome2() {
        System.out.println("C dosome");
    }

    @Override
    public void doSome1() {
        System.out.println("C dosome");
    }
}

class D{
    private A a;

    public D() {
    }

    public D(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void zuoCai() {
        this.a.doSome2();
        this.a.doSome1();
    }
}