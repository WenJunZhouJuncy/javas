package Enum;

public class EnumTest {
    public static void main(String[] args) {
        Result e1 = EnumRes.doSome(10, 0);
        Result e2 = EnumRes.doSome(10, 2);
        Result e3 = EnumRes.doSome(10, 3);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}

class EnumRes{
    public static Result doSome(int i, int j) {
        if (j == 0) return Result.FILL;
        if (i % j == 0) return Result.SUCCESS;
        return Result.COMMON;
    }
}

enum Result {
    SUCCESS, FILL, COMMON
}