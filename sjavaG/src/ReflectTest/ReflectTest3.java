package ReflectTest;

import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest3 {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("ReflectTest.MethodsTest");

        Method[] methods = c1.getDeclaredMethods();

        for(Method md : methods) {
            Class returnType = md.getReturnType();
            String typeSimpleName = returnType.getSimpleName();

            String modifier = Modifier.toString(md.getModifiers());
            String getname = md.getName();
            System.out.println(modifier + " " + typeSimpleName + " " + getname);

            Class[] parameterTypes = md.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }
        }

        System.out.println("================");
        Class c2 = Class.forName("ReflectTest.MethodsTest");
        StringBuffer sb = new StringBuffer();
//        sb.append(class MethodsTest {);
        sb.append(Modifier.toString(c2.getModifiers()) + " class " + c2.getSimpleName() + "{\n");
        Method[] methods2 = c2.getDeclaredMethods();
        for (Method method : methods2) {
//            public static void Methods2(String a, String b) {
//
//            }
            sb.append("\t");
            sb.append(Modifier.toString(method.getModifiers()));
            sb.append(" ");
            sb.append(method.getReturnType().getSimpleName());
            sb.append(" ");
            sb.append(method.getName());
            sb.append("(");
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes) {
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
        /*
            反射机制调用对象方法
                调用要素 1. 对象  2.方法名  3.实参列表  4.返回值
         */
        System.out.println("====================");
        Class c3 = Class.forName("ReflectTest.MethodsTest");
        Method method3 = c3.getDeclaredMethod("Methods3", int.class);
//        c3.newInstance();

        Constructor constructor3 = c3.getDeclaredConstructor();
        Object o3 = constructor3.newInstance();
        Object s3 = method3.invoke(o3, 3);
        System.out.println(s3);
    }
}

class MethodsTest {
    public void Methods1() {

    }
    public static void Methods2(String a, String b) {

    }
    public String Methods3(int a) {
        return "sdfsfsf";
    }
}
