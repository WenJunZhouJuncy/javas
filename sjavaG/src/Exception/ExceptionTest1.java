package Exception;

//      e.getMessage() 获取异常简单信息
//      e.printStackTrace() 打印堆栈异常信息
public class ExceptionTest1 {
    public static void main(String[] args) {

        NullPointerException e = new NullPointerException("空指针异常");

        String em = e.getMessage();
        System.out.println(em);

        e.printStackTrace();
    }
}


