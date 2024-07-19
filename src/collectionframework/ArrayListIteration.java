package collectionframework;

import java.util.ArrayList;

public class ArrayListIteration {

    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList();//ArrayList class is not thread safe.. it will not work correctly with multitheaded..
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(90);
        list.add(-15);
        list.add(99);

        // two thread---1 is reading with foreach=== 2=== trying to modify
        for(Integer res:list)
        {
            if(res==30)
            {
                list.add(1098);//while reading we are tryign to modify  Exception in thread "main" java.util.ConcurrentModificationException
            }
        }

        System.out.println(list);
    }
}
