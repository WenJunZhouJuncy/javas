package ReflectTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectTest4 {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("ReflectTest.ConstructorTest");

        Constructor[] constructors = c1.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            String modifier = Modifier.toString(constructor.getModifiers());
            Class[] parameterTypes = constructor.getParameterTypes();
            System.out.println(modifier);
            System.out.println(c1.getSimpleName());
            for (Class parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }
        }
        System.out.println("================");

        Class c2 = new ConstructorTest().getClass();
        StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(c2.getModifiers()) + " class " + c2.getSimpleName() + " {\n");
        Constructor[] constructors2 = c2.getDeclaredConstructors();
        for (Constructor constructor : constructors2) {
            sb.append("\t");
            sb.append(Modifier.toString(constructor.getModifiers()) + " ");
            sb.append(c2.getSimpleName());
            sb.append("(");
            Class[] parameterTypes = constructor.getParameterTypes();
            for(Class parameterType : parameterTypes) {
                sb.append(parameterType.getSimpleName());
                sb.append(",");
            }
            if (parameterTypes.length > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append("){}\n");
        }
        sb.append("}");
        System.out.println(sb);

        System.out.println("================");
        // 反射机制调用构造方法
        Class c3 = Class.forName("ReflectTest.ConstructorTest");
        Constructor constructor3 = c3.getDeclaredConstructor(String.class, int.class, boolean.class);
        Object obj3 = constructor3.newInstance("ads", 123, false);
        System.out.println(obj3);
    }
}

class ConstructorTest {
    String name;
    int age;
    boolean sex;
    public ConstructorTest() {
    }
    public ConstructorTest(String name) {
    }
    public ConstructorTest(String name, int age) {
    }
    public ConstructorTest(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "ConstructorTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
