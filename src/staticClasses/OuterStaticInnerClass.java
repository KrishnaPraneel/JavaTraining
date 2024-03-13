package staticClasses;

public class OuterStaticInnerClass {
    int x;
    public void myMethod1(){
        System.out.println("this a non static method in outer class");
    }
    public static class InnerClass{
        public static void myMethod(){
            System.out.println("This is a static nested class");
        }
    }
}
class TestStaticInnerClass1 {
    public static void main(String[] args){
        OuterStaticInnerClass.InnerClass.myMethod();
    }
}
