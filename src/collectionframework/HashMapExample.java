package collectionframework;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

//<key,value>
        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"PHani");
        map.put(2,"Revanth");
        map.put(3,"sai");
        map.put(4,"manish");
        map.put(1,"phanikumar");

        System.out.println(map);
    }
}
