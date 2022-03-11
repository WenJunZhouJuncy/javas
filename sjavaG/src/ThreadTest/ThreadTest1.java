package ThreadTest;

public class ThreadTest1 {
    public static void main(String[] args) {

//        第一种方式
//        MyThread1 myThread1 = new MyThread1();
//        myThread1.start();
//
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("主线程 ====>" + i);
//        }

//        第二种
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("分支线程 ====>" + i);
                }
            }
        });
        t1.start();
//        Thread t = new Thread(new MyThread2());
//        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程 ====>" + i);
        }
    }
}
//第一种
class MyThread1 extends Thread{
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程 ====>" + i);
        }
    }
}
//第二种
class MyThread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程 ====>" + i);
        }
    }
}