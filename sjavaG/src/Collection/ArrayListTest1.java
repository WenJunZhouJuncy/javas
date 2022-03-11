package Collection;

import java.util.*;
public class ArrayListTest1 {
    public static void main(String[] args) {
        List l1 = new ArrayList();   // 默认容量10
        List l2 = new ArrayList(20);  //指定集合容量20

        l2.add("A");
        l2.add("B");

        System.out.println(l2.size());   // 几个元素个数


        Set s1 = new HashSet();
        s1.add("A");
        s1.add("B");
        s1.add("C");

        List l3 = new ArrayList(s1);   // Set集合 转换成 List集合

        Collections.synchronizedList(l3);    // 转成 线程安全(同步)
        l3.add("D");
        l3.add("E");

    }
}