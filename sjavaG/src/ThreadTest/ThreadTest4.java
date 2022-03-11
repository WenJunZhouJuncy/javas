package ThreadTest;
/*
    终止线程
 */
public class ThreadTest4 {
    public static void main(String[] args) {
        MyThreadTest4 mtt4 = new MyThreadTest4();
        Thread t1 = new Thread(mtt4);
        t1.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        第一种终止线程  已弃用
//        t1.stop();

//        第二种 通过标识改变状态
        mtt4.run = false;
    }
}

class MyThreadTest4 implements Runnable{
    boolean run = true;

    public void run() {
        Thread t1 = Thread.currentThread();  // 获取当前线程
        t1.setPriority(8);   // 设置当前线权
        t1.setName("t1");
        for (int i = 0; i < 10; i++) {
            if (this.run) {
                try {
                    System.out.println(t1.getName() + "===>" + i + "   最大线权" +t1.MAX_PRIORITY
                            + "   最小线权" + t1.MIN_PRIORITY + "  默认线权" + t1.NORM_PRIORITY +
                            "    当前线权" + t1.getPriority());
                    t1.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
        }
    }
}
