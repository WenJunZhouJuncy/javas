package Collection;

import java.util.*;

public class ListTest1 {
    public static void main(String[] args) {
        List l1 = new ArrayList();

        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");                        // 末尾添加元素
        l1.add(1, "DU");   // 指定下标添加元素

        Iterator it1 = l1.iterator();
        while (it1.hasNext()){
            Object obj1 = it1.next();
            System.out.println(obj1);  //A DU B C D
        }

        Object objget = l1.get(1);   // DU  获取指定下标元素

        l1.set(3, "haha");   // 修改指定位置元素

        for (int i = 0; i < l1.size(); i++) {
            Object obj1 = l1.get(i);
            System.out.println(obj1);
        }

        int ido1 = l1.indexOf("haha");   // 下标
        int ido2 = l1.lastIndexOf("haha");   // 下标

        l1.remove(1);   // 删除指定位置元素
    }
}
