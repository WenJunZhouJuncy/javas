package ObjectTest;
/*
    Object

    1、String toString()    重写toString()方法  print(对象)   会调用toString()方法
    2、boolean equals()      重写equals()方法    比较两个两个对象是否相等  不能使用 “==”
        注：String为引用类型  使用equals()判断
    3、finalize()    对象即将被释放时触发
    4、int hashCode()     获取对象哈希值
    5/protected Object clone()   克隆对象
 */


public class ObjectTest1 {
    public static void main(String[] args) {
        String testS = new String("张三");
        String testS1 = "张三";
        System.out.println(testS.equals(testS1));
        MyObject myobj1 = new MyObject();
//        String
        MyObject myobj2 = new MyObject("嘟嘟");
        System.out.println(myobj1);
        System.out.println(myobj1.getName());
        myobj1.setName("一个胖嘟嘟");
        System.out.println(myobj1);
        System.out.println(myobj1.getName());
        System.out.println(myobj2.getName());
        System.out.println(myobj2);

//        equals
        MyObject myobj3 = new MyObject("我的嘟嘟");
        MyObject myobj4 = new MyObject("我的嘟嘟");
        myobj3.myobj = new MyObject1("22");
        myobj4.myobj = new MyObject1("22");
        System.out.println(myobj3 == myobj4);

        System.out.println(myobj3.equals(myobj4));

//        MyObject a = (MyObject) myobj1.clone();


        int i = myobj1.hashCode();
        System.out.println(i);
    }
}

class MyObject{

    private String name;

    MyObject1 myobj;

    public MyObject() {
        this.name = "胖嘟嘟";
    }

    public MyObject(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj instanceof MyObject) {
            MyObject obj1 = (MyObject) obj;
            if (this.myobj == null && obj1.myobj == null) {
                return true;
            } else if (this.myobj != null && obj1.myobj != null){
                return this.name.equals(obj1.name) && this.myobj.equals(obj1.myobj);
            } else {
                return false;
            }
        }
        return false;
    }
}

class MyObject1{
    String name;

    public MyObject1() {
        this.name = "胖嘟嘟";
    }

    public MyObject1(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof MyObject1) {
            return this.name.equals(((MyObject1) obj).name);
        }
        return false;
    }
}

class MyObject2{
    protected void finalize() throws Throwable {

    }
}
