// Interface: Loanable
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract class: BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation: getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Display details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber +
                           ", Holder: " + holderName +
                           ", Balance: " + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // yearly interest

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100; // simple annual interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account loan application for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000; // eligible if balance ≥ 5000
    }
}

// Subclass: CurrentAccount
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // Current accounts usually don’t earn interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account loan application for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return overdraftLimit >= 10000; // eligible if overdraft limit ≥ 10k
    }
}

// Main Class
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA123", "Alice", 10000, 5);
        BankAccount acc2 = new CurrentAccount("CA456", "Bob", 20000, 15000);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: " + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan(50000);
                System.out.println("Loan Eligibility: " + (loanAcc.calculateLoanEligibility() ? "Approved" : "Denied"));
            }

            System.out.println("---------------------------");
        }
    }
}
