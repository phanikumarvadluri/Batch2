package opps;

public class Redeem {
     private static int points;
     String program;
     long accountNumber;
     String division;


    Redeem()
    {

    }

    Redeem(int points,String program,long accountNumber,String division)
    {
        this.points=points;
        this.accountNumber=accountNumber;
        this.program=program;
        this.division=division;
    }



    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

}
