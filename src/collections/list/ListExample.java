package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args){
        List<String> list1 = new ArrayList<>();
        list1.add("Praneel");
        list1.add("krishna");
        list1.add("mahesh");
        List<Integer> list2 = new ArrayList<>();
        list2.add(27);
        list2.add(35);
        list2.add(33);
        for(String element: list1){
            System.out.println(element);
        }
        for(Integer element2: list2){
            System.out.println(element2);
        }
    }
}

