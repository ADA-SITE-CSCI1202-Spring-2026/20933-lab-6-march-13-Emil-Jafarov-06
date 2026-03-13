package Exercise_5;

public class Account {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.setBalance(balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 0){
            throw new InvalidAmountException("Balance cannot be negative!");
        }
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount < 0){
            throw new InvalidAmountException("Amount cannot be negative!");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(amount < 0){
            throw new InvalidAmountException("Amount cannot be negative!");
        }
        if(amount > balance){
            throw new InvalidAmountException("Withdraw amount cannot be greater than balance!");
        }
        this.balance -= amount;
    }

}
