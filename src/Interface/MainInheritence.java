package Interface;

import java.util.Scanner;

public class MainInheritence {
    public static void main(String[] args) {

        MainInheritence.dynamicinteractivity();


    }

    private static void dynamicinteractivity() {
        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
               new Adder(), new Divide()
        });

        System.out.println("Enter an operation divide two numbers");
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        helper.procesing(userInput);
    }
}
