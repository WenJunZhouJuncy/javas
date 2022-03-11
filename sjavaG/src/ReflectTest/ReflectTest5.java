package ReflectTest;

public class ReflectTest5 {
    public static void main(String[] args) throws Exception {
        Class string = Class.forName("java.lang.String");
        Class stringSuperClass = string.getSuperclass();    // 获取继承的父类  单继承
        System.out.println(stringSuperClass.getName());
        System.out.println(stringSuperClass.getSimpleName());

        Class[] interfaces = string.getInterfaces();     // 获取实现的接口  多实现
        for(Class in : interfaces) {
            System.out.println(in.getSimpleName());
            System.out.println(in.getName());
        }
    }
}
