package collections.list;

import com.sun.xml.internal.fastinfoset.util.DuplicateAttributeVerifier;

import java.util.*;

public class ListEx {
    public static void main(String[] args){
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(1);
        l1.add(2);
        l1.add(2);
        System.out.println(l1);
        Iterator i1 = l1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
    }
}
