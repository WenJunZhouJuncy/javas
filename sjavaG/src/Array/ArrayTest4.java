package Array;
/*
    数组扩容 System.arraycopy(Object 源, int 源起始下标, Object 目标, int 目标起始下标, int 源拷贝长度)
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[10];

        System.arraycopy(a, 2, b, 3, 2);  //0003400...0  10位

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        String[] s1 = new String[10];
        String[] s2 = {"嘟","dudu","嘟嘟嘟"};
        System.arraycopy(s2, 0, s1, 0, s2.length); //"嘟","dudu","嘟嘟嘟" null...null  10位
    }
}
