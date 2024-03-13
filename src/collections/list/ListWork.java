package collections.list;

import java.util.*;

public class ListWork {
    public static void main(String[] args){
        int[] myList = {1,2,3,4,5,6,7,8,9};
        List<int[]> employerId = Arrays.asList(myList);
        List<String> employerNames = new ArrayList<>();
               /* = Arrays.asList("Krishna Praneel","Uma Mahesh", "Gaeya");*/
        employerNames.add("Krishna Praneel");
        employerNames.add("Uma Mahesh");
        employerNames.add("Gaeya");
        for (int i=0; i<employerId.size();i++){
            System.out.println(employerId.get(i));
        }
        for (int k=0;k<employerNames.size(); k++){
            System.out.println(employerNames.get(k));
        }
        List<String> e1 = employerNames;
        System.out.println(e1);
        List<String> e2 = new ArrayList<>();
        e2.add("Nagarjuna");
        e2.add("Chiranjeevi");
        e2.addAll(employerNames);
        e2.remove(0);
        e2.set(0,"Pawan Kalyan");
        System.out.println(e2.get(3));
        LinkedList<Integer> myList2 = new LinkedList<>();
        myList2.add(23);
        myList2.add(30);
        myList2.add(24);
        myList2.addFirst(8);
        myList2.addLast(35);
        System.out.println(myList2);
        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(45);
        q1.add(34);
        q1.add(33);
        q1.add(32);
        System.out.println(q1.poll());
        System.out.println(q1);
    }
}
