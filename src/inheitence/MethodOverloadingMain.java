package inheitence;

import static inheitence.MethodOverExample.add;

public class MethodOverloadingMain {

    public static void main(String[] args) {

        int input[]={1,2,3};
        int add = add(input);
        System.out.println(add);
        int add1 = add(7);
        System.out.println(add1);

    }
}
