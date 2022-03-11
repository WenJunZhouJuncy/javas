package Collection;
/*
    jiava.uitl.Collection
    1.Collection中存储的什么元素？
      没有使用泛型时，存储Object所有子类型。使用泛型后只能存储某个类型
      集合存储的永远是数据的内存地址(引用类型，不管是基本(自动装箱)还是引用)
 */

import java.util.*;

public class CollectionTest1 {
    public static void main(String[] args) {
        Collection c = new HashSet();

//        add 添加元素
        c.add(100);  // 自动装箱 存储地址
        c.add(true);

        c.add(new Object());
        c.add(new Student());

        c.clear();   // 清空集合

        int i = c.size();  // 返回集合个数

        c.add(new String("集合"));

        c.add(10);
        c.add(1000);
        c.add("你好");
        c.add("你好");
        c.add("world");

//        contains  源码重写了equals方法  比较内容
        boolean b1 = c.contains("集合"); //是否包含某元素
        boolean b2 = c.contains("wo"); //是否包含某元素
        System.out.println(b1);
        System.out.println(b2);

        c.remove("你好");     //删除某个元素  (多个相同元素)只会删除第一个


        Iterator it1 = c.iterator();

        while (it1.hasNext()){
            Object obj1 = it1.next();
            System.out.println(obj1);
        }

        Student s1 = new Student("张三");
        Student s2 = new Student("张三");

        c.add(s1);
        boolean b3 = c.contains(s2);
        System.out.println(b3);   // Student重写equals后true 没重写false

        Iterator it3 = c.iterator();
        while (it3.hasNext()){
            Object obj5 = it3.next();
//            c.remove(obj5);   异常 不能使用集合进行删除
            it3.remove();  // 迭代器  删除当前指向的元素
        }
    }
}

class Student{
    String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
