package classbasics;

public class MathEquationBasicTes {

    public static void main(String[] args) {


        MathEquation mathEquation=new MathEquation();
        mathEquation.leftValue=30;
        mathEquation.rightValue=50;
        mathEquation.opsCode='a';
        mathEquation.execute();

        System.out.println(mathEquation.res);



    }
}
