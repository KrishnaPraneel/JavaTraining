package abstractClasses;

public abstract class AbstractExample {
    public abstract void myMethod();

    public void myMethod1(){
        System.out.println(7);
    }
}
class AbstractExample1 extends AbstractExample{
    public void myMethod(){
        System.out.println(13);
    }
    public static void main(String[] args) {
        AbstractExample a1 = new AbstractExample1();
        a1.myMethod();
        a1.myMethod1();
        AbstractExample1 a2 = new AbstractExample1();
        a2.myMethod();
        a2.myMethod1();
    }
}
