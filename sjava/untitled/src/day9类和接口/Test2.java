//一个类可以实现多个接口
//实现的各个接口中的抽象方法都需要重写

//接口与接口之间不存在关系  也可以互相转换类型
//不存在关系可能会在运行阶段报错

public class Test2{
    public static void main(String[] args) {
//        可以使用多态语法
        A a = new C();
        a.doSomeA();
        //        使用接口B的方法需要转型
        ((C) a).doSomeB();
//        或直接转型成C
        C c1 = (C)a;



        K h = new H();
//        J j = (J)h;  // 这里 K 和 J 接口之间不存在关系  但是编译不报错  运行报错

        if (h instanceof J) {
            J j = (J)h;
        }
    }
}

interface A{
    void doSomeA();
}

interface B{
    void doSomeB();
}

class C implements A,B{
    @Override
    public void doSomeB() {

    }
    public void doSomeA() {

    }
}

interface K{

}
interface J{

}

class H implements K{

}