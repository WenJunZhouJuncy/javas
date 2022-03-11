package Array;
/*
    解释main方法中的args
 */
public class ArrayTest2 {
    public static void main(String[] args) {
//        java ArrayTest2.java
        System.out.println(args.length); //0
//        java ArrayTest2.java aa bb cc
        System.out.println(args.length); //3   args = {aa,bb,cc};
//        java ArrayTest2.java cc dd ee ff
        System.out.println(args.length); //4   args = {cc dd ee ff};
//        for(int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
    }
}
