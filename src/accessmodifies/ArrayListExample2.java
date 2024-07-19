package accessmodifies;

import java.util.ArrayList;

public class ArrayListExample2 {

    public static void main(String[] args) {


        ArrayList<Double> salaries=new ArrayList<>();

        salaries.add(1000.0);
        salaries.add(1000.0);
        salaries.add(2000.0);
        salaries.add(3000.0);
        salaries.add(4000.0);
        salaries.add(5000.0);



        salaries.add(2,1500.0);
        int size = salaries.size();
        System.out.println(size);
        boolean contains = salaries.contains(1000.0);
        System.out.println(contains);
        salaries.remove(2);


        System.out.println("salaries"+salaries);


    }
}
