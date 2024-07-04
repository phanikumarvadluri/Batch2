package MethodBasics;

public class MethodParemeterPass {

    public static void main(String[] args) {

        System.out.println("main start!!");

        int a = 100;
        int b = 900;

        MethodParemeterPass methodParemeterPass = new MethodParemeterPass();
        int add = methodParemeterPass.add(a, b);
        System.out.println(add);


    }

    /*
    no change inmeho
     */
    public int add(int a, int b) {
        int res = a + b;
        return res;
    }
}
