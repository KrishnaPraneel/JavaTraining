package MultiThreading;

public class ThreadExample2 extends Thread{
    int x;
    public void run(){
        System.out.println(x);
    }
    public ThreadExample2(int x){
        this.x = x;
    }
}
