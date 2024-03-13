package lambda;

import interfaces.OperatersInter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
interface OperatersInter1{
    int operation(int a, int b);
}
private int operate(int a, int b, OperatersInter1 z){
    return z.operation(a,b);
}
    public static void main(String[] args){
        ArrayList<Integer> i1 = new ArrayList<>();
        i1.add(2);
        i1.add(5);
        i1.add(7);
        i1.forEach((x)->{
            if(x%2==0){
                System.out.println(x+" is even");
            } else {
                System.out.println(x+" is odd");
            }
        });
        OperatersInter1 add = (int a, int b)-> a+b;
        OperatersInter1 multiply = (int a, int b)-> a*b;
        LambdaExample l1 = new LambdaExample();
        System.out.println(l1.operate(2, 3, add));
        System.out.println(l1.operate(3, 7, multiply));
        List i2 = i1.stream().map(x->x*2).collect(Collectors.toList());
        int y = i1.stream().reduce(0,(x,i)->x+i);
        System.out.println(y);
        System.out.println(i2);
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Gaeya");
        s1.add("Mahesh");
        s1.add("Praneel");
        s1.add("Parrot");
        List i3 = s1.stream().filter(x->x.startsWith("P")).collect(Collectors.toList());
        List i4 = s1.stream().sorted().collect(Collectors.toList());
        System.out.println(i4);
        System.out.println(i3);
    }
}
