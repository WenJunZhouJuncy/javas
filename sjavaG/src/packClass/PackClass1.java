package packClass;

public class PackClass1 {
    public static void main(String[] args) {
//        String  int Integer

//        String  ->  int
        String a1 = "123";
        int a2 = Integer.parseInt(a1);

//        int -> String
        int b1 = 123;
        String b2 = b1 + "";
        String b3 = String.valueOf(b1);

//        String -> Integer
        String c1 = "123";
        Integer c2 = new Integer(c1);
        Integer c3 = Integer.valueOf(c1);

//        Integer -> String
        Integer d1 = new Integer(123);
        String d2 = String.valueOf(d1);

//        Integer -> int
        Integer e1 = 123;
        int e2 = e1;
        int e3 = e1.intValue();

//        int -> Integer
        int f1 = 123;
        Integer f2 = f1;
        Integer f3 = new Integer(f1);
        Integer f4 = Integer.valueOf(f1);
    }
}
