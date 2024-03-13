package collections.list;

import java.util.*;

public class SortedSetExample {
    public static void main(String[] args){
        Integer[] i1 = {23,30,24,35,32,8,33};
        Set<Integer> s1 = new HashSet<>(Arrays.asList(i1));
        TreeSet<Integer> t1 = new TreeSet<>(s1);
        System.out.println(t1);
        System.out.println(t1.first());
        System.out.println(t1.last());
    }
}
