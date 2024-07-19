package collectionframework;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {


    public static void main(String[] args) {

        LinkedHashSet<Integer> hashSet=new LinkedHashSet<>();//it is following insertion order,dont allow duplicates
        hashSet.add(70);
        hashSet.add(20);
        hashSet.add(20);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(60);
        hashSet.add(10);
        hashSet.add(50);
        hashSet.add(null);

System.out.println(hashSet);

    }
}
