public class Digui{
  public static void main(String[] args){
    java.util.Scanner s = new java.util.Scanner(System.in);
    System.out.print("input number");
    int j = s.nextInt();
    int i = doSome(j);
    System.out.print(i);
}
  public static int doSome(int i){
    return i == 1 ? 1 : i + doSome(--i);
    /*if(i == 1){
      return 1;
    } else {
      return i+ doSome(--i);
    }*/
  }
}