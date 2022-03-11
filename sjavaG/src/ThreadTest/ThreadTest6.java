package ThreadTest;

public class ThreadTest6 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        Thread t1 = new Thread(new DeadLock1(o1, o2));
        Thread t2 = new Thread(new DeadLock2(o1, o2));

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class DeadLock1 implements Runnable{
    Object o1;
    Object o2;

    public DeadLock1() {
    }

    public DeadLock1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public void run() {
        synchronized (o1) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2) {

            }
        }
    }
}

class DeadLock2 implements Runnable {
    Object o1;
    Object o2;
    public DeadLock2() {
    }

    public DeadLock2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public void run() {
        synchronized (o2) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1) {

            }
        }
    }
}
