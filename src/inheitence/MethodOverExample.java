package inheitence;

public class MethodOverExample {


    public static int add(int firstNumber, int lastNumber) {
        return firstNumber + lastNumber;
    }

    public static int add(int firstNumber, int lastNumber, int thirdNumber) {
        return firstNumber + lastNumber + thirdNumber;
    }

    public static int add(int num[]) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        return sum;
    }

    public static int add(int num) {

        return num;
    }

    // any number of methods with the same providing different number/type of arguments!!


}



