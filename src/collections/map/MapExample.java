package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args){
        Map<String,String> m1 = new HashMap<>();
        m1.put("Name","Mahesh");
        m1.put("Address","New Jersey");
        m1.put("id","23");
        System.out.println(m1);
        for(Map.Entry<String,String> entry: m1.entrySet()){
            System.out.println("Key is "+entry.getKey()+" and value is "+entry.getValue());
        }
        System.out.println(m1.get("id"));
        for(String s: m1.keySet()){
            System.out.println(s);
        }
        for(String s: m1.values()){
            System.out.println(s);
        }
        Iterator<Map.Entry<String,String>> itr = m1.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String,String> entry = itr.next();
            System.out.println("Key is "+entry.getKey()+" and value is "+entry.getValue());
        }
        m1.forEach((k,v)->System.out.println(k+":"+m1.get(k)));
    }
}
