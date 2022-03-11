package ThreadTest;
/*
   java线程分为两大类:  守护线程(后台线程)  用户线程(Thread  主线程mian)

   注：守护线程一般是死循环 但用户线程结束后守护线程自动结束
 */
public class ThreadTest7 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DaemonTest1());
        t1.setDaemon(true);    // 设置线程为 守护线程
        t1.setName("t1");
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " ==> " + i);
            try {
                t1.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class DaemonTest1 implements Runnable {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName() + "守护线程 ===> " + i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
