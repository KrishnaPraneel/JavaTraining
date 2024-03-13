package polymorphism;

public class CompileTimePolymorphism { // compile time polymorphism.
    public int myAddition(int a, int b){

        return a + b;
    }
    public int myAddition(int a, int b, int c) {

        return a + b + c;
    }
    public static void main(String[] args){
        CompileTimePolymorphism p1 = new CompileTimePolymorphism();
        System.out.println(p1.myAddition(2,3,4));
    }
}// Method Overloading.
