package ReflectTest;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

/*
    java.lang.reflect.Field
 */
public class ReflectTest2 {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("ReflectTest.Sutends");
        String sn = c1.getName();
        String ssn = c1.getSimpleName();

        System.out.println(sn + "   " + ssn);

//        获取所有public修饰的属性  除此获取不到
        Field[] fields = c1.getFields();
        System.out.println(fields.length + "   " + fields[0].getName());

//        获取所有的属性
        Field[] fields2 = c1.getDeclaredFields();
        for (Field fd : fields2) {
            Class fdType = fd.getType();
            String s = "属性完整类型:" + fdType.getName() + "\n属性简述类型:" + fdType.getSimpleName() + "\n属性字段:"
                    + fd.getName() + "\n修饰符:" + Modifier.toString(fd.getModifiers());
            System.out.println(s);
        }

        System.out.println("==========");

        // 简单反编译
        Class nc = Class.forName("ReflectTest.Sutends");
        String cmfn = Modifier.toString(nc.getModifiers());
        System.out.println(nc.getModifiers());
        StringBuffer sb = new StringBuffer();
        sb.append(sb + "class " + nc.getSimpleName() + " {\n");
        Field[] fds = nc.getDeclaredFields();
        for(Field fd : fds) {
            Class ftype = fd.getType();
            String mdf = Modifier.toString(ftype.getModifiers());
            String ft = ftype.getSimpleName();
            String fn = fd.getName();
            sb.append("     " + mdf + " " + ft + " " + fn + ";\n");
        }
        System.out.println(sb + "}");

        System.out.println("==========");

        Class c3 = Class.forName("ReflectTest.Sutends");
        Object o3 = c3.newInstance();
        Field fon = c3.getDeclaredField("no");
//        fon.setAccessible(true);   可以访问和修改private属性
        fon.set(o3, 1234);
        System.out.println(fon.get(o3));

        ResourceBundle rb = ResourceBundle.getBundle("1IOFileTest/class");
        String className = rb.getString("className");
        String fieldName = rb.getString("fieldName");
        String value = rb.getString("value");
        Class c4 = Class.forName(className);
        Object o4 = c4.newInstance();
        Field fn4 = c4.getDeclaredField(fieldName);
        fn4.set(o4, value);
        System.out.println(fn4.get(o4));

    }

    /*
        可变长度参数
            1.可变长度参数要求的个数是 0-N个
            2.参数的位置必须放在最后一位，并且只能有一个可变长度参数
            3.可变长度参数可当做一个数组来看待

        int... args    int类型  可() (1) (1, 1, 1...)
        String... args   String类型  可()  ("123", "hhh", "boolean"...) (new String[]{"123", "hhh", "2345"})
     */

    public static void m(int... args) {
        for (int i : args) {

        }
    }
}

class Sutends {
    String name;
    protected boolean sex;
    int age;
    public int no;
    public static final double PI = 3.14;
}