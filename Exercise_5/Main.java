package Exercise_5;


public class Main {

    public static void main(String[] args) {

        try{
            Account account = new Account(38, "Emil", 380.9);
            account.deposit(25);
            System.out.println("New account balance is " + account.getBalance());
            account.withdraw(300);
            System.out.println("New account balance is " + account.getBalance());
            account.withdraw(200);
            System.out.println("New account balance is " + account.getBalance());
        } catch(InvalidAmountException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

    }

}
