
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("This is a Savings Account with interest rate: " + interestRate + "%");
    }
}


class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("This is a Checking Account with withdrawal limit: " + withdrawalLimit);
    }
}


class FixedDepositAccount extends BankAccount {
    int duration; 

    FixedDepositAccount(String accountNumber, double balance, int duration) {
        super(accountNumber, balance);
        this.duration = duration;
    }

    void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account with duration: " + duration + " months");
    }
}


public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 3000, 1000);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 10000, 12);

        sa.displayInfo();
        sa.displayAccountType();

        ca.displayInfo();
        ca.displayAccountType();

        fda.displayInfo();
        fda.displayAccountType();
    }
}
