package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {


    public static void main(String[] args) {

//        Integer[] arr = new Integer[5];
//        arr[0] = 10;
//        arr[1] = 30;
//        arr[2] = 40;
//        arr[3] = 90;
//        arr[4] = -15;
//
//
//        int element = 99;
//
//        Integer[] newArray = new Integer[arr.length + 1];
//        for (int i = 0; i < arr.length; i++) {
//            newArray[i] = arr[i];
//        }
//
//        newArray[arr.length] = element;
//
//        System.out.println(newArray[5]);




        ArrayList<Integer> list=new ArrayList();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(90);
        list.add(-15);
        list.add(99);
        list.add(99);
        list.add(99);
        list.add(99);
        list.add(99);
        list.add(99);
        list.add(99);
        list.add(99);
        list.add(99);

        System.out.println(list);

//        for (int i=0;i<list.size();i++)
//        {
//            System.out.println(list.get(i));
//        }
//
        for(Integer element: list)
        {
            System.out.println(element);
        }

//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }

    }

}
