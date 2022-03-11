package ThreadTest;

import java.util.ArrayList;
import java.util.List;

/*
    关于Object类中的wait()和notify()方法（生产者和消费者）
        不是特定通过线程调用  而是每个对象对象都可以调用

    wait()的作用
      Object o = new Object()
      o.wait()
        使正在o对象上所有活动的线程进入等待状态，直到被唤醒

    notify()的作用
      o.notify()唤醒o对象上等待的所有线程


    wait()和notify()方法建立在synchronize线程同步之上

    o.wait()会让正在o对象上活动的线程进入等待状态并释放之前占有的o对象的锁

    o.notify()只会通知，不会释放之前占有的o对象上的锁
 */
public class ThreadTest10 {
    static int i = 0;
    public static void main(String[] args) {
        List list = new ArrayList();
        Thread t1 = new Thread(new Scz(list));
        Thread t2 = new Thread(new Xfz(list));
        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();
    }
}

class Scz implements Runnable{

    List list;
    public Scz() {

    }
    public Scz(List list) {
        this.list = list;
    }
    public void run() {
        synchronized (list) {
            while (true) {
                if (list.size() > 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o = new Object();
                list.add(o);
//                System.out.println(Thread.currentThread().getName() + "===>" + o);
                System.out.println(Thread.currentThread().getName() + "===>" + ThreadTest10.i++);
                list.notify();
            }
        }
    }
}

class Xfz implements Runnable{
    List list;
    public Xfz() {
    }
    public Xfz(List list) {
        this.list = list;
    }
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() == 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o = list.remove(0);
//                System.out.println(Thread.currentThread().getName() + "===>" + o);
                System.out.println(Thread.currentThread().getName() + "===>" + ThreadTest10.i++);
                list.notify();
            }
        }
    }
}