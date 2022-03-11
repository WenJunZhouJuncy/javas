package ThreadTest;
/*
    interrupt()  使调用的Thread休眠状态解除  到运行状态
        使用的时异常机制结束休眠
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new InterruptTest());

        t1.start();
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + "===>" + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        t1.interrupt();
    }
}

class InterruptTest implements Runnable{
    public void run() {
        System.out.println("run begin");
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run end");
    }
}
