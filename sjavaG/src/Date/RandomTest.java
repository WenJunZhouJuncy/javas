package Date;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r1 = new Random();
//        int 取值范围内的随机数
        int i1 = r1.nextInt();
//        System.out.println(i1);

//        [0, 101) 的随机数
        int i2 = r1.nextInt(10);
//        System.out.println(i2);
        int[] intArr = FirthNum.doSome();
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}

class FirthNum{
    public static int[] doSome() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        int count = 0;
        boolean isAdd = true;
        int iii = 0;
        while (count < 5) {
            iii++;
            Random r1 = new Random();
            int i1 = r1.nextInt(5);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == i1) {
                    isAdd = false;
                    break;
                } else {
                    isAdd = true;
                }
            }
//            System.out.println(i1);
            if (isAdd) {
                arr[count] = i1;
                count++;
            }
        }
        System.out.println(iii);
        return arr;
    }
}
