class BankAccount {
    public String accountNumber;        
    protected String accountHolder;     
    private double balance;             

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : $" + balance);
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void showAccess() {
        System.out.println("Accessing Account Number (public) : " + accountNumber);
        System.out.println("Accessing Account Holder (protected): " + accountHolder);

    }
}

public class BankAccount {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("BA12345", "Alice", 1000.0);
        account.displayDetails();

        System.out.println();

        account.setBalance(1500.0);
        System.out.println("Updated Balance: $" + account.getBalance());

        System.out.println();

        SavingsAccount savings = new SavingsAccount("SA98765", "Bob", 5000.0);
        savings.showAccess();
    }
}
