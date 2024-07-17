package exceptionhanding;

public class Main {

    public static void main(String[] args) {

        UserDefinedExceptionExample userDefinedExceptionExample = new UserDefinedExceptionExample();
        boolean b = false;
        try {
            b = userDefinedExceptionExample.eligbleForVote(17);
        } catch (AgeInvlidException ageInvlidException) {
            System.out.println("Not eligible for vote!!!");
        }

        System.out.println(b);

    }
}
