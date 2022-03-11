public class OverLoad{
    public static void main(String[] a) {
        XiaoBrid x = new XiaoBrid();
        x.testOver();
    }
}

class Brid {
    public void testOver() {
        System.out.println("测试方法覆盖");
    }
}

class XiaoBrid extends Brid {
    public void testOver() {
        System.out.println("子类  测试方法覆盖");
    }
}

//重写的方法   访问权限不能更低  可以更高
//            抛出异常不能更多  可以更少
//
//构造方法、私有方法不能继承  因此不能覆盖    静态方法不存在覆盖
