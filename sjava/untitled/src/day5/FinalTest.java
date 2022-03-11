//final关键字
//修饰的类不能被继承
//修饰的方法不能被覆盖
//修饰的变量不能修改
//修饰的实例变量必须（初始化）手动赋值
//修饰的引用 地址指向不能修改

public class FinalTest{
    public static void main(String[] args) {
//        修饰引用
        final FinalSL f1 = new FinalSL();

        final FinalSL f2;
        f2 = new FinalSL();

//        f1 = new FinalSL();  //final修饰 指向发生改变  编译报错
    }
}

class FinalSL{
    final int i = 10;  //必须初始化
    final String s;     //必须在构造方法中赋值
    boolean b;

    public FinalSL(String s){
        this.s = s;
    }
    public FinalSL() {
        this.s = "final morenzhi";
    }
}