package MethodBasics;

public class MethodStaticIntro {
    public static void main(String[] args) {
        System.out.println("THis is main");
        //calling static method
        MethodStaticIntro.m1();
        MethodStaticIntro.m2();// calling with class name, here calss name is MethodIntro
        //calling non static
        MethodStaticIntro methodStaticIntro = new MethodStaticIntro();//creating object for the class
        methodStaticIntro.m3();

    }


    public static void m1() {
        System.out.println("This is m1 static");
    }

    public static void m2() {
        System.out.println("THis is m2-static");
    }

    public void m3() {
        System.out.println("THis is m3- non static");
    }
}
