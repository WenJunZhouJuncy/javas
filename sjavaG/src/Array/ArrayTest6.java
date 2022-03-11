package Array;

public class ArrayTest6 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,65,8,43,5,87,46,264,865,643,475,839,10,54,753,471};
        MaoPao.doSome(arr);
        System.out.println();
        int[] arr1 = {1,2,4,65,8,43,5,87,46,264,865,643,475,839,10,54,753,471};
        XuanZhe.doSome(arr1);

        XuanZhe.doSome(new int[]{4,7546,5324,123,76,45,364,758,634,7634,267,684,332,67});
    }
}

class MaoPao{
    public static void doSome(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int k = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = k;
                    num++;
                }
            }
        }
        System.out.println("冒泡排序次数" + num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "、");
        }
    }
}

class XuanZhe{
    public static void doSome(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int k = arr[min];
                arr[min] = arr[i];
                arr[i] = k;
                num++;
            }
        }
        System.out.println("选择排序次数" + num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "、");
        }
    }
}
