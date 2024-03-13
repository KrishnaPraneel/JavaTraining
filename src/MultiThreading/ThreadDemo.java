package MultiThreading;

public class ThreadDemo extends Thread{
    @Override
    public void run(){
        System.out.println("thread is running");
    }
    public static void main(String[] args){
        ThreadDemo td1 = new ThreadDemo();
        Thread t1 = new Thread(td1);
        td1.start();
        Thread t2 = new Thread(td1);
        t2.start();
        Thread t3 = new Thread(td1);
        t3.start();
    }
}
