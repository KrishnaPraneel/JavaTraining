package basic;

public class Demo {
    int x ;
    public Demo(int x){
        this.x=x;

    }
    public static void main(String[] args) {
        Demo d = new Demo(2);
        System.out.println(d.x);
    }
}
