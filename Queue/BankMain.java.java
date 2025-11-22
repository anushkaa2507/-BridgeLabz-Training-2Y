package com.Queue;

import java.util.*;

class Transaction {
    private String accountId;
    private double amount;

    public Transaction(String accountId, double amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return "Transaction(Account: " + accountId + ", Amount: " + amount + ")";
    }
}

class Account {
    private String accountId;

    public Account(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    @Override
    public int hashCode() {
        return accountId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Account a = (Account) obj;
        return this.accountId.equals(a.accountId);
    }

    public String toString() {
        return accountId;
    }
}

class BankSystem {

    private List<Transaction> allTransactions = new ArrayList<>();
    private Queue<Transaction> pendingQueue = new LinkedList<>();
    private Set<Account> validAccounts = new HashSet<>();
    private Stack<Transaction> rollbackStack = new Stack<>();

    public void addAccount(Account a) {
        validAccounts.add(a);
    }

    public void addTransaction(Transaction t) {
        pendingQueue.add(t);
    }

    public void processTransactions() {
        System.out.println("\nProcessing Transactions:");
        while (!pendingQueue.isEmpty()) {
            Transaction t = pendingQueue.poll();

            if (isValidAccount(t.getAccountId())) {
                allTransactions.add(t);
                rollbackStack.push(t);
                System.out.println("Processed → " + t);
            } else {
                System.out.println("Invalid Account → " + t);
            }
        }
    }

    private boolean isValidAccount(String id) {
        return validAccounts.contains(new Account(id));
    }

    public void rollbackLast() {
        if (!rollbackStack.isEmpty()) {
            Transaction removed = rollbackStack.pop();
            allTransactions.remove(removed);
            System.out.println("Rolled Back → " + removed);
        } else {
            System.out.println("No transaction to rollback");
        }
    }

    public void showHistory() {
        System.out.println("\nAll Successful Transactions:");
        for (Transaction t : allTransactions) {
            System.out.println(t);
        }
    }
}

public class BankMain {
    public static void main(String[] args) {

        BankSystem bank = new BankSystem();

        bank.addAccount(new Account("A1"));
        bank.addAccount(new Account("A2"));

        bank.addTransaction(new Transaction("A1", 1000));
        bank.addTransaction(new Transaction("A3", 500));
        bank.addTransaction(new Transaction("A2", 2000));

        bank.processTransactions();
        bank.showHistory();

        bank.rollbackLast();
        bank.showHistory();
    }
}