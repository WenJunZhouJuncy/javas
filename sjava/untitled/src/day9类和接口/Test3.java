
//extends 和 implements  联合使用
//  需要先使用extends 后使用 implements
public class Test3{
    public static void main(String[] args) {
//        B d = new D();
//        d.doSome();
    }
}

class A {

}

interface B{
    void doSome();
}

interface C {

}

class D extends A implements B,C {
    public void doSome(){
        System.out.println("D dosome");
    }
}

abstract class E implements B{

}

abstract class F extends E {

}