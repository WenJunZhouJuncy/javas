package Collection;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> ls1 = new ArrayList<>();
        ls1.add("aaa");
        ls1.add("ddd");
        ls1.add("bbb");
        ls1.add("ccc");
        ls1.add("eeee");

        Collections.sort(ls1);   //对集合List排序   排序前提需要实现Comparable接口 重写方法compareTo

        HashSet<WuGui2> hs1 = new HashSet<>();
        hs1.add(new WuGui2(3000));
        hs1.add(new WuGui2(4000));
        hs1.add(new WuGui2(2000));
        hs1.add(new WuGui2(1000));
        hs1.add(new WuGui2(9000));
        List<WuGui2> ls2 = new ArrayList<>(hs1);

        Collections.sort(ls1);  //对Set(HashSet)排序 需要转成List(sort只接收List类型)

//        Collections.sort(list集合, 比较器new Wugui2Com());
//        Collections.sort(List集合, new Comparator<WuGui2>() {
//
//            @Override
//            public int compare(WuGui2 o1, WuGui2 o2) {
//                return 0;
//            }
//        });
    }
}

class WuGui2 implements Comparable<WuGui2>{
    int age;
    public WuGui2() {

    }

    public WuGui2(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WuGui2 wuGui = (WuGui2) o;
        return age == wuGui.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public int compareTo(WuGui2 o) {
        return this.age - o.age;
    }
}

class Wugui2Com implements Comparator<WuGui2> {
    public int compare(WuGui2 o1, WuGui2 o2) {
        return  o1.age - o2.age;
    }
}
