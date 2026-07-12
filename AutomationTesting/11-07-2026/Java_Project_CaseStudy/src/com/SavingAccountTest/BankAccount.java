package com.SavingAccountTest;

public class BankAccount {

    private double balance;
    private AccountType accountType;

    // No-Argument Constructor
    public BankAccount() {
        balance = 0;
        accountType = AccountType.CHECKING;
    }

    // Parameterized Constructor
    public BankAccount(AccountType accountType) {
        this.balance = 0;
        this.accountType = accountType;
    }

    // Deposit Method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw Method
    public void withdraw(double amount) {

        if (accountType == AccountType.SAVINGS && amount > balance) {
            throw new IllegalArgumentException("Insufficient Balance");
        }

        balance -= amount;
    }

    // Get Balance
    public double getBalance() {
        return balance;
    }
}