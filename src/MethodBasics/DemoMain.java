package MethodBasics;

public class DemoMain {
    public static void main(String[] args) {

        int a =10;
        int b=20;

        int add = Demo.add(a,b);
        System.out.println(add);


        Demo anyName=new Demo();
        int i = anyName.addNonStatic(a, b);
        System.out.println(i);

    }
}
