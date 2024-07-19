package accessmodifies;

import java.util.ArrayList;
import java.util.List;

public class ArrayListString {
    public static void main(String[] args) {


        //List<String> list=new ArrayList<>();/**/
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");


        boolean apple = fruits.contains("apple");
        System.out.println(apple);

        System.out.println(fruits);
    }
}
