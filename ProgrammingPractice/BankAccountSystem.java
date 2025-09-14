class BankAccount {

    static String bankName = "ABC Bank";

    static int totalAccounts = 0;

    final int accountNumber;

    String accountHolderName;

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++; 
    }

    public void displayDetails() {
        System.out.println("Bank Name         : " + bankName);
        System.out.println("Account Number    : " + accountNumber);
        System.out.println("Account Holder    : " + accountHolderName);
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(1001, "Alice");
        BankAccount acc2 = new BankAccount(1002, "Bob");

        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }

        System.out.println();

        if (acc2 instanceof BankAccount) {
            acc2.displayDetails();
        }

        System.out.println();

        BankAccount.getTotalAccounts();
    }
}