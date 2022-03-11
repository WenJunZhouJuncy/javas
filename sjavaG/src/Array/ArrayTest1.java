package Array;
/*
    Array
    语法：
        静态初始化
        int[] array1 = {1,2,3,4,5....};
        int[] a = {};
        Object array2 = {new Object(), new Object().....};
        动态初始化
        int[] array1 = new int[5];  初始化长度为5的数组存储int类型
        int[] a = new int[5];
        String array2 = new String[6]; 初始化长度为6的数组存储String类型

    1、数组是一种引用数据类型，数组对象存储在堆内存中; 父类是Object
    2、可以存储基本数据类型、也可以存储引用数据类型(内存地址)
    3、数组一旦创建，长度不可变
    4、数组存储数据的类型必须统一
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        System.out.println(array1[array1.length - 1]);
        System.out.println(array1[2]);
        array1[1] = 10;

        for (int i = 0; i < array1.length; i++) {
            int j = array1[i];
            System.out.println(j);
        }

//        增强for(foreach)  数组中存储的类型      每个元素     遍历的目标
//        for (数据类型 变量名 : 数组或集合){}
        for (int i : array1) {
            System.out.println(i);
        }
    }
}