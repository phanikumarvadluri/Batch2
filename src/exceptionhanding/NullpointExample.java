package exceptionhanding;

public class NullpointExample {

    public int getLength(String input) {
        int length = 0;
        try {
            length = input.length();
        } catch (NullPointerException nullPointerException) {
            System.out.println("Please enter valid string or enter string");
        }
        return length;
    }
}
