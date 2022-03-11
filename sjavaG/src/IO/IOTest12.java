package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IOTest12 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Stu s = new Stu(123, "张三",12);
//        ObjectOutputStream 序列化 从内存中的java对象 保存到 硬盘中
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/1IOFileTest/Stu"));
//        oos.writeObject(s);
//        oos.flush();
//        oos.close();

//        ObjectInputStream 反序列化 从硬盘中读取文件 运行到 内存中成java对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/1IOFileTest/Stu"));
        Object objstu = ois.readObject();
        System.out.println(objstu);
        ois.close();

//        序列化集合(一次保存多个对象)
//        List<Stu> slist = new ArrayList<>();
//        slist.add(new Stu(1234, "张三", 13));
//        slist.add(new Stu(2345, "李四", 17));
//        slist.add(new Stu(3456, "王五", 16));
//        slist.add(new Stu(4567, "赵六", 18));
//        slist.add(new Stu(5678, "田七", 15));
//        slist.add(new Stu(6789, "万八", 16));

//        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("src/1IOFileTest/Stu1"));
//        oos1.writeObject(slist);
//        oos1.flush();
//        oos1.close();

//        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("src/1IOFileTest/Stu1"));
//
//        Object objlist = ois1.readObject();
//        if (objlist instanceof List) {
//            List<Stu> liststu = (List<Stu>) objlist;
//            for(Stu stu : liststu) {
//                System.out.println(stu);
//            }
//        }
//        ois1.close();

    }
}

//java源码中Serializable是个标志接口 (什么都没有) 序列化都需要实现该接口
//public interface Serializable { }

class Stu implements Serializable {
    private static final long serialVersionUID = -736084527808575004L;
//    序列号(用来区分类)  所有实现Serializable接口 都需要手动添加序列号
//    否则jvm虚拟机自动生成序列号  当源码(类) 一旦改动时  会重写生成序列号
//    导致jvm虚拟机认为前后不是同一个类  最终反序列化时会报错
//  |-------------- 固定不变 ----------------|   唯一值
//    private static final long serialVersionUID = 8683448747623929L;

    private int no;
    private transient String name;   // transient 关键字  表示序列化时该字段不参与序列化  反序列化时这个值是默认值null

    private transient int age;      // transient 关键字不参与序列化 反序列化时这个值是默认值0

    public Stu() {
    }

    public Stu(int no, String name) {
    }


    public Stu(int no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stu stu = (Stu) o;
        return no == stu.no &&
                Objects.equals(name, stu.name);
    }
}