package Interface;

public class Divide extends CalculateBase implements MathProcessing {
    Divide() {

    }

    Divide(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftValue() / getRightValue();
        setResult(value);
    }

    @Override
    public String getKeyword() {
        return "divide";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftValue(leftVal);
        setRightValue(rightVal);
        calculate();
        return getResult();
    }
}
