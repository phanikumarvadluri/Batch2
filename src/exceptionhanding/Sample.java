package exceptionhanding;

public class Sample {

    public int divideOpetaion(int a, int b) {
        int i = 0;
        try {
            i = a / b;
        } catch (ArithmeticException exception) {
            System.out.println("Please enter valid number!!"+exception.getMessage());
        }

        System.out.println("End of method");
        System.out.println("End of method");
        System.out.println("End of method");
        System.out.println("End of method");
        System.out.println("End of method");

        return i;
    }

}
