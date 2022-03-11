package Array;

public class ArrayTest3 {
    public static void main(String[] args) {
        Animal[] an = {new Animal(), new Animal()};   //只能存储Animal类型
//        Animal[] anpo = {new Animal(), new Prson()};   //只能存储Animal类型  报错

        Animal[] an1 = {new Cat(), new Brid()};   //多态语法

        for (int i = 0; i < an1.length; i++){
            an1[i].move();   //父类有

            //子类特有  向下转型
            if (an1[i] instanceof Cat) {
                ((Cat)an1[i]).catMouse();
            } else if (an1[i] instanceof Brid) {
                ((Brid)an1[i]).sing();
            }
        }
    }
}

class Prson{

}
class Animal {
    public void move() {
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在走");
    }
    public void catMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Brid extends Animal{
    @Override
    public void move() {
        System.out.println("鸟在飞");
    }
    public void sing() {
        System.out.println("鸟在叫");
    }
}
