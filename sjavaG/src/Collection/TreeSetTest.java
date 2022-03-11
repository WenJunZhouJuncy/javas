package Collection;

import java.util.Comparator;
import java.util.TreeSet;
/*
    TreeSet 无序不重复   但会自动排序
    (自动排序)  是因为要实现Comparable<E>  接口 的方法 compareTo

    compareTo中
    this > o  升序
    this < o  降序
    this == o  覆盖
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<TreeSetTest1> trs1 = new TreeSet<>();

        trs1.add(new TreeSetTest1(1));
        trs1.add(new TreeSetTest1(2));

        for (TreeSetTest1 s : trs1) {
            System.out.println(s);
        }

        TreeSet<Dudu> dudus = new TreeSet<>(new DuduComparator());

        TreeSet<Dudu> dudus1 = new TreeSet<>(new Comparator<Dudu>() {
            public int compare(Dudu o1, Dudu o2) {
                return o1.age - o2.age;
            }
        });

        dudus.add(new Dudu(10));
        dudus.add(new Dudu(20));
        dudus.add(new Dudu(30));
        for (Dudu d : dudus) {
            System.out.println(d);
        }
    }
}

//第一种方式  直接实现Comparable
class TreeSetTest1 implements Comparable<TreeSetTest1>{
    int age;
    public TreeSetTest1() {
    }
    public TreeSetTest1(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "TreeSetTest1{"+age+"}";
    }
    @Override
    public int compareTo(TreeSetTest1 o) {
        return o.age - this.age;
    }
}

//第二种方法   自定义比较器
class Dudu{
    int age;

    public Dudu() {
    }

    public Dudu(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dudu{" +
                "age=" + age +
                '}';
    }
}
//比较器
class DuduComparator implements Comparator<Dudu> {
    @Override
    public int compare(Dudu o1, Dudu o2) {
        return o1.age - o2.age;
    }
}
