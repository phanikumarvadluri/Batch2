package classbasics;

public class MathEquationWithArrays {

    public static void main(String[] args) {

        MathEquation[] mathEquation = new MathEquation[2];

        mathEquation[0]=new MathEquation();
        mathEquation[0].leftValue=30;
        mathEquation[0].rightValue=60;
        mathEquation[0].opsCode='a';

        mathEquation[1]=new MathEquation();
        mathEquation[1].leftValue=30;
        mathEquation[1].rightValue=60;
        mathEquation[1].opsCode='m';

        double[] res=new double[2];



        for (int i=0;i<mathEquation.length;i++)
        {
            mathEquation[i].execute();
            System.out.println(mathEquation[i].res);
        }


    }
}
