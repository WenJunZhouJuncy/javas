package ThreadTest;

import java.text.SimpleDateFormat;
import java.util.*;

/*
    定时器   java.util.Timer
 */
//public class ThreadTest8 {
//    public static void main(String[] args) {
//        Timer timer = new Timer();
//
//        long now = System.currentTimeMillis() + 5000;
//        Date time = new Date(now);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//
//        timer.schedule(new TimerTest1(), time, 5000);
//
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类");
//            }
//        }, time, 3000);
//    }
//}
//
//class TimerTest1 extends TimerTask {
//    public void run() {
//        System.out.println("Timer");
//    }
//}

public class ThreadTest8{
    public static void main(String[] args) {
        Timer t1 = new Timer();

        t1.schedule(new TimerTest1(), new Date(), 3000);
    }
}

class TimerTest1 extends TimerTask{
    public void run() {
        System.out.println("Timer");
    }
}
