package Collection;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class ZzzTreeSetTest2 {
    public static void main(String[] args) {
//        TreeSet<PaiXv1> ts = new TreeSet<>(new Compar());

        TreeSet<PaiXv1> ts = new TreeSet<>(new Comparator<PaiXv1>() {
            @Override
            public int compare(PaiXv1 o1, PaiXv1 o2) {
                return 0;
            }
        });

        ts.add(new PaiXv1(32));
        ts.add(new PaiXv1(35));
        ts.add(new PaiXv1(234));
        ts.add(new PaiXv1(54));
        ts.add(new PaiXv1(12));

        for (PaiXv1 p : ts) {
            System.out.println(p);
        }
    }
}

class PaiXv1{
    int age;
    public PaiXv1() {
    }

    public PaiXv1(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PaiXv1{" +
                "age=" + age +
                '}';
    }
}

class Compar implements Comparator<PaiXv1> {
    @Override
    public int compare(PaiXv1 o1, PaiXv1 o2) {
        return o1.age - o2.age;
    }
}