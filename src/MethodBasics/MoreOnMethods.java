package MethodBasics;

public class MoreOnMethods {

    public static void main(String[] args) {
        System.out.println("Method started!!");


        MoreOnMethods.m1();
        String s = MoreOnMethods.m2();
        System.out.println(s);

        MoreOnMethods moreOnMethods = new MoreOnMethods();
        String s1 = moreOnMethods.m3();
        System.out.println(s1);
    }

    public static void m1() {
        System.out.println("m1");
    }

    public static String m2() {
        String res = "this is m2 method";
        return res;
    }


    public String m3() {
        String res = "this is m3 method";
        return res;
    }

}
