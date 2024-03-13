package interfaces.operators;

import interfaces.ExInterface;

public class TestInterface implements ExInterface {
    @Override
    public int myMethod() {
        return 0;
    }
  /*  @Override
    public String myMethod1() {
        return "This is implimentation";
    }

    @Override
    public void myMethod2() {
        System.out.println(5);
    }
*/
    public static void main(String[] args){
        TestInterface t1 = new TestInterface();
        System.out.println(t1.myMethod());
      /*  System.out.println(t1.myMethod1());
        t1.myMethod2();*/

    }
}
