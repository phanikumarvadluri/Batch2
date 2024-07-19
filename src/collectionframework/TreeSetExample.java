package collectionframework;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {


        TreeSet<Integer> hashSet=new TreeSet<>();//it is following asc order,dont allow duplicates
        hashSet.add(70);
        hashSet.add(20);
        hashSet.add(20);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(60);
        hashSet.add(10);
        hashSet.add(50);


        System.out.println(hashSet);

    }
}
