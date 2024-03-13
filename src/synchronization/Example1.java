package synchronization;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        ThreadExample1 te1 = new ThreadExample1("This is synchronization");
        ThreadExample1 te2 = new ThreadExample1("This is for Thread2");
        ThreadExample1 te3 = new ThreadExample1("This is for thread 3");
        Thread t1 = new Thread(te1);
        t1.start();
        t1.sleep(1000);
        Thread t2 = new Thread(te2);
        t2.start();
        Thread t3 = new Thread(te3);
        t3.start();
    }
}
