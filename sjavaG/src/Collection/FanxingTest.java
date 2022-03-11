package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FanxingTest {
    public static void main(String[] args) {
        List<Anima> l1 = new ArrayList<Anima>();

        l1.add(new Cat());
        l1.add(new Brid());

        Iterator<Anima> it1 = l1.iterator();

        while (it1.hasNext()) {
            Anima ani = it1.next();
            ani.move();
        }

        for (int i = 0; i < l1.size(); i++) {
            Anima ani = l1.get(i);
            ani.move();
        }


        List<String> l2 = new ArrayList<>();

        l2.add("haha");
        l2.add("xixi");
        l2.add("hehe");
        l2.add("hihi");
    }
}

class Anima{
    public void move() {
        System.out.println("anima move");
    }
}

class Cat extends Anima {

}

class Brid extends Anima {

}

/*
    自定义泛型
 */
class CustomFanXing<custom> {
//    定义参数类型
    public void doSome(custom a) {
        System.out.println(a);
    }
//    定义返回类型
    public custom customReturn(custom a) {
        return a;
    }
    public CustomFanXing() {

    }
    public CustomFanXing(custom a) {

    }
}

class CustomTest {
    public static void main(String[] args) {
        CustomFanXing<String> cs = new CustomFanXing<>();
//        cs.doSome(123);  // 自定义泛型 字符串  报错
        cs.doSome("SSS");
        String cst = cs.customReturn("sss");

        CustomFanXing<Integer> ci = new CustomFanXing<>();
        ci.doSome(123);
        Integer cit = ci.customReturn(123);
    }
}

