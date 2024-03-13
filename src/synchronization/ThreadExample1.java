package synchronization;

public class ThreadExample1 implements Runnable {
    String message;

    public ThreadExample1(String message) {

        this.message = message;
    }

    @Override
    public void run() {
       // synchronized (message){
            for(int i=0; i<=5; i++){
                System.out.println(message+" "+i);
            }
      //  }
    }
}

