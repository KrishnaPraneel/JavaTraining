package MultiThreading;

public class RunableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("RUNNABLE IS A INTERFACE");
    }
    public static void main(String[] args){
        RunableDemo rd1 = new RunableDemo();
        Thread t1 = new Thread(rd1);
        t1.start();
    }
}
