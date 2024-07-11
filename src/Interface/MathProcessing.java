package Interface;

public interface MathProcessing {
    String SEPARATOR = " ";

    String getKeyword();

    double doCalculation(double leftVal, double rightVal);
}
