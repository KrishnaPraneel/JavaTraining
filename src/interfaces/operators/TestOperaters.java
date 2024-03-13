package interfaces.operators;

import interfaces.Engine;
import interfaces.OperatersInter;

public class TestOperaters implements OperatersInter, Engine {

    @Override
    public int add(int x, int y) {
        return (x+y);
    }

    @Override
    public int sub(int x, int y) {
        return (x-y);
    }

    @Override
    public int mult(int x, int y) {
        return (x*y);
    }

    @Override
    public int div(int x, int y) {
        return (x%y);
    }
    public static void main(String[] args){
        TestOperaters t1 = new TestOperaters();
        System.out.println(t1.add(2,4));
        System.out.println(t1.sub(5,6));
        System.out.println(t1.mult(3,5));
        System.out.println(t1.div(3,6));
        System.out.println(t1.myMethod("I need petrol"));
    }

    @Override
    public String myMethod(String x) {
        return x;
    }

    @Override
    public String myMethod1(String y) {
        return y;
    }

    @Override
    public String myMethod2(String z) {
        return z;
    }
}
