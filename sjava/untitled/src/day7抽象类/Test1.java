package day7抽象类;//package day7抽象类;


/*
    //abstract  抽象类
    [修饰符列表] abstract 类名{}  //语法
    抽象类无法实例化、所以只能被子类继承；因此abstract和final不能共存
    抽象类的子类类也可以是抽象类
    抽象类存在构造方法供子类使用

    抽象方法
    抽象类中的方法是抽象方法
    public abstract void doSome();  //语法
        特点: 1、没有方法体，以分号结尾   2、方法使用abstract修饰
    抽象类中不一定存在抽象方法、存在抽象方法的一定是抽象类
    如果非抽象类继承了抽象类，而抽象类中存在抽象方法，非抽象类需要实现(重写)抽象方法

*/


public class Test1{
    public static void main(String[] args) {

    }
}

abstract class A {
  public A(){}
  public A(String a){}

  public abstract void doSome();  //抽象方法

    public void doSome1(){   //抽象类中可以存在实例方法

    }
}
//继承抽象类的子类也可以是抽象类  构造方法默认第一行super()
abstract class B extends A {
    public B(){}
}

class C extends B{
    public C(){}

//    @java.lang.Override
    public void doSome() {

    }
}