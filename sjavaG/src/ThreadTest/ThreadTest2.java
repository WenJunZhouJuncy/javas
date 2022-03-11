package ThreadTest;

public class ThreadTest2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread3());
        Thread t2 = new Thread(new MyThread3());

        System.out.println(t1.getName());  // 获取线程名字 Thread-0(默认名称)
        System.out.println(t2.getName());  // Thread-1

        t1.setName("t1");
        System.out.println(t1.getName()); // t1
        System.out.println(t2.getName()); // Thread-1
    }
}

class MyThread3 implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();  // 返回当前线程的对象

        System.out.println(t.getName() + " ====> ");
    }
}
