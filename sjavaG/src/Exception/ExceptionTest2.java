package Exception;

public class ExceptionTest2 {
    public static void main(String[] args) {
        MyException mye = new MyException("自定义异常类");

        mye.printStackTrace();

        String myemsg = mye.getMessage();
        System.out.println(myemsg);
//        System.out.println(mye);
    }
}

//自定义异常类
//1、继承Exception(编译时异常)、或RuntimeException(运行时异常)
//2、提供两个构造方法(无参、有参)
class MyException extends Exception{
    public MyException() {

    }

    public MyException(String message) {
        super(message);
    }
}

class MyExceptionRun extends RuntimeException{
    public MyExceptionRun() {
    }

    public MyExceptionRun(String message) {
        super(message);
    }
}
