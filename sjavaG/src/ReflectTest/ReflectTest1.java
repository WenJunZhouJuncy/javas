package ReflectTest;

import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.ResourceBundle;

/*
    反射机制

    反射机制相关的类
        java.lang.Class  代表整个字节码，一个类型
        java.lang.reflect.Method   代表字节码中的方法字节码
        java.lang.reflect.Constructor   代表字节码中构造方法字节码
        java.lang.reflect.Field     代表字节码中属性字节码

    获取Class是三种方式
    Class s = Class.forName("完整类名")
    Class s = new Object().getClass()
    Class s = 任何类型.class          任何类型都有class属性 int.class  String.class



 */
public class ReflectTest1 {
    public static void main(String[] args) throws Exception {
        Class c2 = null;
        Class c3 = null;
        try {
            Class c1 = Class.forName("ReflectTest.User");
            c2 = Class.forName("java.lang.Thread");
            c3 = Class.forName("java.lang.String");
            System.out.println(c2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        String s = new String("123");
        Class cs = s.getClass();
//        字节码文件(.class) 存储在方法区内存 仅有一份  cs和c3变量存储的地址一致
        System.out.println(cs == c3);    // true

        Class<User> us = null;
        Class us2 = null;
        try {
            us = (Class<User>) Class.forName("ReflectTest.User");
            User o = us.newInstance();    // 相当于执行User中的无参构造方法  创建User对象

            us2 = Class.forName("ReflectTest.User");
            Object o2 = us2.newInstance();
            if (o2 instanceof User) {

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        /*
            获取绝对路径的方式(统一 通用)
            注：必须在类路径下(src目录下)， IDEA以src下作为根路径

                Thread.currentThread()      当前线程对象
                getContextClassLoader()     获取线程对象的类加载器
                getResource("")             获取类加载器的资源(接收路径)
         */
        String path = Thread.currentThread().getContextClassLoader().getResource("1IOFileTest/class.properties").getPath();
        System.out.println(path);
        InputStream pp = Thread.currentThread().getContextClassLoader().getResourceAsStream("1IOFileTest/class.properties");
        FileReader fr = new FileReader(path);
        Properties p = new Properties();
        p.load(fr);

        fr.close();

        String className = p.getProperty("className");
        System.out.println(className);

        Class c4 = Class.forName(className);
        Object o4 = c4.newInstance();
        System.out.println(o4);

        Tabstract.doSome();

//        java.util.ResourceBundle   资源绑定器   可代替IO和Properties
//        类路径下    properties文件   路径不带后缀.properties
        ResourceBundle rb = ResourceBundle.getBundle("1IOFileTest/class");
        String srb = rb.getString("className");
        System.out.println(srb);

        /*
            类加载器： 负责加载类的命令/工具  ClassLoader

            JDK中自带3个类加载器
              启动类加载器
              扩展类加载器
              应用类加载器

            在代码执行之前，会将所需要的类全部加载到JVM中，类加载过程中如何加载？
              1、通过"启动类加载器"加载
                启动类加载器专门加载   ..../jre/lib/rt.jre 下的类库
                加载不到时 ↓
              2、通过"扩展类加载器"加载
                扩展类加载器专门加载   ..../jre/lib/ext/*.jre 下的类库
                加载不到时 ↓
              3、通过"应用类加载器"加载   环境变量中classpath配置的目录下 加载

         */
    }
}
// Class
class User {
    int i;   //Field
    String name;
    int no;

    public User() {  //Constructor
    }

    public int getI() {   //Method
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

abstract class Tabstract {
    public static void doSome() {
        System.out.println("doSome");
    }
}
