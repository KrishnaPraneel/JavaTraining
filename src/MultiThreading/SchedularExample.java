package MultiThreading;

import java.util.concurrent.*;

public class SchedularExample {
    public static void main(String[] args){
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
       // ScheduledFuture testRunner = executorService.schedule(new TestRun(), 10, TimeUnit.SECONDS);
        ScheduledFuture testRunner = executorService.scheduleAtFixedRate(new TestRun(),5,2,TimeUnit.SECONDS);
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                testRunner.cancel(true);
                executorService.shutdown();
            }
        }, 20, TimeUnit.SECONDS);
    }
    static class TestRun implements Runnable {

        @Override
        public void run() {
            System.out.println("running method");
        }
    }
}
