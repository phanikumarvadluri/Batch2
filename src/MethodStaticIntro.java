public class MethodStaticIntro {
    public static void main(String[] args) {
        System.out.println("THis is main");
        //calling static method
        MethodStaticIntro.m1();
        MethodStaticIntro.m2();// calling with class name, here calss name is MethodIntro
    }


    public static void m1() {
        System.out.println("This is m1");
    }

    public static void m2() {
        System.out.println("THis is m2");
    }
}
