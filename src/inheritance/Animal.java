package inheritance;

public class Animal {
    int w;
    int x;
    int y;
    int z;

    public Animal(int a, int b, String monday , String tuesday){
        x = a+b;
        y = a-b;
        z = a*b;
        w = a%b;
        s = monday;
        p = tuesday;
    }
    static String s;
    static String p;
}

class Tiger extends Animal {
    public static void main(String[] args){
        Tiger t1 = new Tiger(23,30,"inheritance", "Polymorphism");
        System.out.println(t1.x);
        System.out.println(t1.y);
        System.out.println(t1.z);
        System.out.println(t1.w);
        System.out.println(s);
        System.out.println(p);
        myStaticMethod();
        t1.myPublicMethod();
    }
    public Tiger(int S, int P, String monday, String tuesday){
        super(S,P,monday,tuesday);
    }
    static void myStaticMethod(){
        System.out.println("This is a inheritance.Tiger Class Static Method");
    }
    public void myPublicMethod(){
        System.out.println("This is a inheritance.Tiger Claas Public Method");
    }
}
