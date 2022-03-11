package packClass;
/*
    八种包装类
    基本数据类型              包装类型
    ------------------------------------
    byte                    java.lang.Byte (extends Number extends Object)
    short                   java.lang.Short (extends Number extends Object)
    int                     java.lang.Integer (extends Number extends Object)
    long                    java.lang.Long (extends Number extends Object)
    float                   java.lang.Float (extends Number extends Object)
    double                  java.lang.Double (extends Number extends Object)
    boolean                 java.lang.Boolean (extends Object)
    char                    java.lang.Character (extends Object)
 */


public class PackClass {
    public static void main(String[] args) {
//        通过构造方法 基本数据类型 -> 引用数据类型
        Integer i = new Integer(123);
        Integer s = new Integer("123");

//        通过包装类中的对应方法  引用数据类型 -> 基本数据类型
        float f = i.floatValue();
        System.out.println(f);
        int si = i.intValue();
        System.out.println(si);

        System.out.println(Integer.MAX_VALUE);   //int 类型最大值
        System.out.println(Integer.MIN_VALUE);   //int 类型最小值

        String ss = Integer.toString(123);

        Integer zi = 127;
        Integer zx = 127;   //zi == zx  true

        Integer zy = 128;
        Integer zz = 128;   //zy == zz  false

//        int zyy = zi;
//        int zyyy = zi.intValue();

        System.out.println(zi == zx);
//        System.out.println(zi == zy);

        int ai = Integer.parseInt("123");
        double ad = Double.parseDouble("123.3");
        float af = Float.parseFloat("3.14");

    }
}
