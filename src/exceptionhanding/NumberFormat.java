package exceptionhanding;

public class NumberFormat {

    public int getElement(String input) {
        int output=0;
        try {
            output = Integer.parseInt(input);
        }
        catch(NumberFormatException numberFormatException)
        {
            System.out.println("Please enter valid String to format!!");
        }
        return output;
    }
}
