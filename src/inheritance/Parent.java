package inheritance;

public class Parent {
    int j;
    int a;
    String b;
    public void myMethod(){
        System.out.println("This is a inheritance.Super Class");
        System.out.println("I will Create a Sub Class");
    }
    public Parent(int x, String y, int j){
         a = x;
         b = y;
         this.j = j;
    }
}

class Child extends Parent {
    int k;
    int p;
    static int t;
    public void myMethod1(){
        System.out.println("This is a Sub class");
        System.out.println("Created a Method in Sub class");
        System.out.println(super.j);
        super.myMethod();
    }
    public static void main(String[] args){
        int a = 23;
        Child s1 = new Child(a,"Krishna Praneel Peddibhotla",20, 30,25);
        System.out.println(s1.a);
        System.out.println(s1.b);
        s1.myMethod();
        s1.myMethod1();
        System.out.println(s1.k);
        System.out.println(s1.p);
        System.out.println(s1.t);
    }
    public Child(int age, String Name, int letters, int words, int keys) {
        super(age,Name,keys);
        k = letters;
        p = words;
    }

}
