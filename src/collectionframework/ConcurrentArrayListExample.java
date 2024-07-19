package collectionframework;

import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentArrayListExample {
    public static void main(String[] args) {


        CopyOnWriteArrayList<Integer> copyOnWriteArrayList=new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(10);
        copyOnWriteArrayList.add(10);
        copyOnWriteArrayList.add(30);
        copyOnWriteArrayList.add(40);
        copyOnWriteArrayList.add(90);
        copyOnWriteArrayList.add(-15);
        copyOnWriteArrayList.add(99);


        for(Integer res:copyOnWriteArrayList)
        {
            if(res==30)
            {
                copyOnWriteArrayList.add(1098);//while reading we are tryign to modify  Exception in thread "main" java.util.ConcurrentModificationException
            }
        }

        System.out.println(copyOnWriteArrayList);

    }
}
