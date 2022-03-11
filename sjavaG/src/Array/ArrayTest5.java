package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
    二维数组

    数组工具类 Arrays

    sort  排序
    binarySearch  二分法查找

 */
public class ArrayTest5 {
    public static void main(String[] args) {
        int[][] a = {{},{},{}};
        int[][][] a1 = {{{}},{{}},{{}}};

        int[] arr1 = {1,64,32,5,6,65,75,76,6,43,32,855,2,657};
        Arrays.sort(arr1);

        for (int i = 0; i<arr1.length; i++) {
            System.out.print(arr1[i] + "、");
        }
        System.out.println();
        int index = Arrays.binarySearch(arr1, 76);   // -1 不存在该值  存在返回下标
        System.out.println(index);
    }
}
