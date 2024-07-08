package Constructor;

public class AccountMain {

    public static void main(String[] args) {
        Account account=new Account();
        
        account.setAccountNumber(90909);
        int accountNumber = account.getAccountNumber();
        
        account.setBalance(9000);
        double balance = account.getBalance();


        account.setName("Revanth");
        String name = account.getName();

        System.out.println(accountNumber);
        System.out.println(balance);
        System.out.println(name);

    }
}
