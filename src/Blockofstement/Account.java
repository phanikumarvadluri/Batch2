package Blockofstement;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    Account() {
        System.out.println("default no parameter constuctor");
    }


    Account(int accountNumber, String accountHolderName, double balance) {
        System.out.println("All  parameter constuctor");
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void displayNonStatic() {
        System.out.println(accountHolderName);
    }

    public static String displayStatic() {
        Account account=new Account(9999,"Phani",9900.99);
        return account.accountHolderName;
    }
// static block- is going to call first..
    static{
        System.out.println("this is static block");
    }

    // non static block
    {
        System.out.println("this is non- static block");
    }


}
