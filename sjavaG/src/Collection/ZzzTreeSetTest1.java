package Collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ZzzTreeSetTest1 {
    public static void main(String[] args) {
        TreeSet<PaiXv> ts = new TreeSet<>();

        ts.add(new PaiXv(17));
        ts.add(new PaiXv(15));
        ts.add(new PaiXv(12));
        ts.add(new PaiXv(14));
        ts.add(new PaiXv(16));

        for (PaiXv p : ts) {
            System.out.println(p);
        }


        TreeMap<PaiXv, String> tm = new TreeMap<>();

        tm.put(new PaiXv(15), "heheh");
        tm.put(new PaiXv(13), "heheh");
        tm.put(new PaiXv(18), "heheh");
        tm.put(new PaiXv(11), "heheh");
        tm.put(new PaiXv(12), "heheh");

        Set<Map.Entry<PaiXv, String>> stms = tm.entrySet();

        for (Map.Entry<PaiXv, String> stm : stms) {
            System.out.print(stm.getKey() + " " + stm.getValue() + "\n");
        }
    }
}

class PaiXv implements Comparable<PaiXv> {
    int age;
    public PaiXv() {
    }

    public PaiXv(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PaiXv{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(PaiXv o) {
        return this.age - o.age;
    }
}