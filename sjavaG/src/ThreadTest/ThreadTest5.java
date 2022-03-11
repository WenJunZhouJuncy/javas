package ThreadTest;

public class ThreadTest5 {
    public static void main(String[] args) {
        Accteh act = new Accteh(10000.0);
        Thread t1 = new Thread(new ActThread(act));
        Thread t2 = new Thread(new ActThread(act));

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class Accteh {
    private double yue;

    public Accteh() {
    }

    public Accteh(double yue) {
        this.yue = yue;
    }

    public double getYue() {
        return yue;
    }

    public void setYue(double yue) {
        this.yue = yue;
    }

    public void writh(double money) {
        synchronized (this) {
            double befor = this.getYue();
            if (befor - money >= 0) {
                double after = befor - money;
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.setYue(after);
                System.out.println(Thread.currentThread().getName() + "剩余：" + this.getYue());
            } else {
                System.out.println("取：" + money + "    余额不足，剩余：" + this.getYue());
            }
        }
    }
}

class ActThread implements Runnable{
    Accteh act;

    public ActThread() {
    }

    public ActThread(Accteh act) {
        this.act = act;
    }

    public void run() {
        act.writh(6000);
    }
}
