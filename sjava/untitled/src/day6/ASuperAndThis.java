package day6;
//this 和 super都能出现在实例方法和构造方法中
//this 和 super 都不能出现在静态方法中

//this 和 super 的语法 "this. this()  super,  super()"
//this.可以省略  只有在区分局部变量时  不能省略
//super.可以省略  只有在区分父类和子类属性和方法时  不能省略

//this() 是调用本类中的构造方法  super() 是调用父类中的构造方法
//this() 和 super()  都只能出现在构造方法中的第一行 因此不能共存

//****  注  ****
//当类中不存在构造方法 默认存在无参构造方法
//当构造方法中不存在super和this  默认存在super()

public class ASuperAndThis{
    public static void main(String[] args) {
             new C(); //12654

        J j = new J();
        j.doSome();

    }
}

//super执行顺序例子
class A{
     public A (){
        System.out.println("A的无参构造方法1");  //1
     }
}

class B extends A{
    public B () {
        System.out.println("B的无参构造方法2"); //2
    }
    public B (String s){
        System.out.println("Bz中有参构造方法3"); //3
    }
}

class C extends B{
    public C(){
        this("super");
        System.out.println("C无参构造方法4"); //4
    }
    public C(String s) {
        this("this", "super");
        System.out.println("C中一个参数构造方法5"); //5
    }
    public C(String s, String ss) {
        System.out.println("C中两个参数构造方法6"); //6
    }
}

class K {
    String shuxing = "父类属性";
    public void fangFa() {
        System.out.println("父类方法");
    }
}

class J extends K{
    String shuxing = "子类属性";
    public void fangFa() {
        System.out.println("子类方法");
    }

    public void doSome() {
        System.out.println(this.shuxing);  //子类属性
        this.fangFa(); //子类方法
        System.out.println(shuxing);  //子类属性   默认this.
        fangFa(); //子类方法   默认this.
        System.out.println(super.shuxing);  //父类属性
        super.fangFa();  //父类属性
    }
}