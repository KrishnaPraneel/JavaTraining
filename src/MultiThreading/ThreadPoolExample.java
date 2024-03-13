package MultiThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExample {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) executorService;
        poolExecutor.submit(new TestThread());
        poolExecutor.submit(new TestThread());
        poolExecutor.submit(new TestThread());
        poolExecutor.submit(new TestThread());
        executorService.shutdown();
    }
    static class TestThread implements Runnable{

        @Override
        public void run() {
            System.out.println("Started Thread Name: "+ Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Completed Thread Name: "+ Thread.currentThread().getName());
        }
    }
}
