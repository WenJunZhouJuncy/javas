package ThreadTest;
/*
    static void sleep(long s)  和Thread对象的调用无关  和当前运行的线程有关
            所处的位置在哪个线程中，就让哪个线程处于休眠状态(毫秒)
 */
public class ThreadTestS1 {
    public static void main(String[] args) {
        MyThreadTestS1 myThreadTestS1 = new MyThreadTestS1();
        myThreadTestS1.start();

        Thread t1 = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(t1.getName() + " ===> " + i);
        }

        Thread t2 = new Thread(new MyThreadTestS2());
        t2.start();

        try {
            t2.sleep(1000);   // 使mian线程休眠1000毫秒  与t2线程无关
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class MyThreadTestS1 extends Thread{
    public void run() {
        Thread t1 = Thread.currentThread();
        String name = t1.getName();
        for (int i = 0; i < 100; i++) {
            System.out.println(name + "===>" + i);
        }
    }
}

class MyThreadTestS2 implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "===>" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
