package ThreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
    线程的第三种实现方式
        public class FutureTask<V> implements RunnableFuture<V>
        public interface Callable<V>    { call 相当于 run   当线程start后执行}

    优点：有返回值
    缺点：造成当前线程阻塞(需要等待返回值 才能执行后续程序)
 */

public class ThreadTest9 {
    public static void main(String[] args) throws Exception {
//        FutureTask<String> ft = new FutureTask<>(new Callable() {
//            public String call() throws Exception {
//                return "daw";
//            }
//        });
//
//        Thread t1 = new Thread(ft);
//
//        t1.start();
//
//        try {
//            String s = ft.get();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

//        FutureTask ft = new FutureTask(new Callable() {
//            @Override
//            public Object call() throws Exception {
//                return null;
//            }
//        });
//
//        Thread t1 = new Thread(ft);
//        t1.start();
//        ft.get();

        FutureTask<Integer> f1 = new FutureTask<>(new Callable() {

            public Integer call() throws Exception {
                return 100 + 200;
            }
        });

        Thread t1 = new Thread(f1);

        t1.start();
        Integer i1 = f1.get();
        System.out.println(i1);
    }
}
