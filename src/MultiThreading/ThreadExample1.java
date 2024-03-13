package MultiThreading;

public class ThreadExample1 implements Runnable {
    String message;

    public ThreadExample1(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}

