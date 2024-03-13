package MultiThreading;

public class ThreadShutDownExample {
    public static void main(String[] args){
        try{
            Runtime.getRuntime().addShutdownHook(new TestShutDown());
        }catch(Exception e){

        }
    }
}

class TestShutDown extends Thread {
    public void run(){
        System.out.println("we are shutting down JVM");
    }
}