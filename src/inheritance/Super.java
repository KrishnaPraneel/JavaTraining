package inheritance;

public class Super {
    int x;
    int y;
    public void myMethod(){
        System.out.println("inheritance.Super Class controlStatements.Method");
    }
    public Super(int c, int d){
        x = c;
        y = d;
    }
}
class Sub extends Super {
    public static void main(String[] args){
        Sub v1 = new Sub(20,30);
        System.out.println(v1.x);
        System.out.println(v1.y);
        v1.myMethod();
    }
    public Sub(int a, int b){
        super(a,b);
    }
}
