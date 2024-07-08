package Blockofstement;

public class AccountMain {
    public static void main(String[] args) {

        Account account=new Account(9999,"Phani",9900.99);

        account.displayNonStatic();
       System.out.println("=================================================");
        String s = Account.displayStatic();
        System.out.println(s);
    }
}
