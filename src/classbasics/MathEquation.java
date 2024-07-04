package classbasics;

public class MathEquation {
    double leftValue;

    double rightValue;

    char opsCode;

    double res;


   public void execute() {

        if (opsCode == 'a') {
            res = leftValue + rightValue;
        } else if (opsCode == 'm') {
            res = leftValue * rightValue;
        }
    }


}
