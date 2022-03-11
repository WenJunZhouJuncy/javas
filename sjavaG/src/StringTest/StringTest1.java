package StringTest;
/*
    字符串(双引号括起来)的值都存储在方法区的字符串常量池中 "abc"  "def"
 */
public class StringTest1 {
    public static void main(String[] args) {
//        char charAt(int index)   //返回下标对应值
        char charAt = "你好的".charAt(2);  // 的
        System.out.println(charAt);

//        返回该字符第一次出现的下标  不存在 -1
        int indexOf1 = "hello word dudu".indexOf("d"); // 9
        int indexOf2 = "hello word dudu".indexOf("s"); // -1
        System.out.println(indexOf1);
        System.out.println(indexOf2);

//        boolean contains(String str)    // 是否包含该字符串
        boolean iscontains = "https://www.juncy.com".contains("jun");
        System.out.println(iscontains);  //true


//        "".startsWith();  开头
//        是否以该字符串结尾
        boolean isendsWith1 = "https://www.juncy.com".endsWith(".com");
        boolean isendsWith2 = "https://www.juncy.com".endsWith(".org");

        System.out.println(isendsWith1);    // true
        System.out.println(isendsWith2);    // false

//        忽略大小写比较是否相等
        boolean isequalsIgnoreCase = "abc".equalsIgnoreCase("ABc");
        System.out.println(isequalsIgnoreCase);

//        判断字符串是否为空
        boolean isEmpty1 = "".isEmpty();
        boolean isEmpty2 = "dudu".isEmpty();
        boolean isEmpty3 = ("".length() == 0);
        boolean isEmpty4 = ("    ".length() == 0);
        boolean isEmpty5 = "    ".isEmpty();
        System.out.println(isEmpty1);   //true
        System.out.println(isEmpty2);   //false
        System.out.println(isEmpty3);   //true
        System.out.println(isEmpty4);   //false
        System.out.println(isEmpty5);   //false

//        String valueOf();  静态方法
//        将基本数据类型转成字符串  引用类型会调用toString()方法
        String valStr1 = String.valueOf(100);
        String valStr2 = String.valueOf(true);
        String valStr3 = String.valueOf('a');
        System.out.println(valStr1);
        System.out.println(valStr2);
        System.out.println(valStr3);

        String valStrA = String.valueOf(new A());
        System.out.println(valStrA);  //重写前 内存地址
        System.out.println(valStrA);  //重写后 重写toString方法

        StringBuffer stringbuffer = new StringBuffer(32);

        System.out.println(stringbuffer);
        stringbuffer.append(2);
        System.out.println(stringbuffer);
        stringbuffer.append("asd");
        System.out.println(stringbuffer);
    }
}

class A{
    @Override
    public String toString() {
        return "重写toString方法";
    }
}