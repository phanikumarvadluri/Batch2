package collectionframework;

import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetExamples {


    public static void main(String[] args) {


        HashSet<Integer> hashSet = new HashSet();// No guarantee, set doesn't allow duplicates...

        hashSet.add(20);
        hashSet.add(20);
        hashSet.add(20);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(60);
        hashSet.add(10);
        hashSet.add(50);


        for (Integer res : hashSet) {
            if (res == 20) {
                hashSet.add(1000);
            }

        }
        System.out.println(hashSet);
    }
}
