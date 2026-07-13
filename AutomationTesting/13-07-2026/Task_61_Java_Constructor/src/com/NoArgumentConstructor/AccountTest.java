package com.NoArgumentConstructor;

// Change the class name from AccountTest to Account
public class Account {
    private int balance;
    private int accountNumber;
    private AccountType accountType;

    // 1. No-argument constructor (Now matches the class name!)
    public Account() {
        this.balance = 0;
        this.accountNumber = 0;
        this.accountType = AccountType.CHECKING; 
    }

    // 2. Parameterized constructor (Now matches the class name!)
    public Account(int balance, int accountNumber, AccountType accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (this.accountType == AccountType.SAVINGS && (this.balance - amount) < 0) {
            throw new ArithmeticException("Savings accounts cannot have a negative balance");
        }
        this.balance -= amount;
    }

    public int getBalance() {
        return this.balance;
    }
}