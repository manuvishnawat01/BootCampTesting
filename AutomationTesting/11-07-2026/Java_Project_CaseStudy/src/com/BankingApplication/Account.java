package com.BankingApplication;

public class Account {

    private int balance;
    private int accountNumber;
    private AccountType accountType;

    // No-Argument Constructor
    public Account() {
        this.balance = 0;
        this.accountNumber = 12345;
        this.accountType = AccountType.CHECKING;
    }

    // Parameterized Constructor
    public Account(int balance, int accountNumber, AccountType accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    // Get Balance
    public int getBalance() {
        return balance;
    }

    // Deposit Method
    public void deposit(int amount) {

        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount should be greater than zero.");
        }
    }

    // Withdraw Method
    public void withdraw(int amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (accountType == AccountType.SAVINGS && amount > balance) {
            throw new ArithmeticException("Cannot overdraw from Savings Account.");
        }

        balance -= amount;
    }

    @Override
    public String toString() {

        return String.format(
                "The account with number %d is of type '%s' and has a balance of %d",
                accountNumber,
                accountType,
                balance);
    }
}
