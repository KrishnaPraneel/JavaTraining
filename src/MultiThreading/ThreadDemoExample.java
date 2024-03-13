package MultiThreading;

public class ThreadDemoExample {
    public static void main(String[] args){
        Runnable r1 = new ThreadExample1("Hello");
        Thread t1 = new Thread(r1);
        t1.setName("Thread 1");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        System.out.println("Starting thread 1 "+t1.getName());
        Runnable r2 = new ThreadExample1("World");
        Thread t2 = new Thread(r2);
        t2.setName("Thread 2");
        t2.setPriority(7);
        t2.start();
        System.out.println("Starting thread 2 "+t2.getName());
        Thread td1 = new ThreadExample2(3);
        Thread t3 = new Thread(td1);
        t3.setName("Thread 3");
        t3.setPriority(5);
        t3.start();
        System.out.println("Starting thread 3 "+t3.getName());
        Thread td2 = new ThreadExample2(6);
        Thread t4 = new Thread(td2);
        t4.setName("Thread 4");
        t4.setPriority(10);
        t4.start();
        System.out.println("Starting thread 4 "+t4.getName());
    }
}
