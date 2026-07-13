package com.NoArgumentConstructor;

import java.util.ArrayList;
import java.util.List;

public class Account {

    /* 1. Properties */
    private int balance;              // balance in whole euros (no cents)
    private int accountNumber;        // account number
    private AccountType accountType;  // CHECKING or SAVINGS

    /* 2. Parameterized constructor - pass a value for each property */
    public Account(int balance, int accountNumber, AccountType accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    /* 2. No-argument constructor - default value for each property */
    public Account() {
        this.balance = 0;
        this.accountNumber = 12345; // fixed default account number
        this.accountType = AccountType.CHECKING;
    }

    /* 3. getBalance() - no parameters needed, returns the current balance */
    public int getBalance() {
        return balance;
    }

    /* 3. deposit() - takes the amount to deposit, returns nothing */
    public void deposit(int amount) {
        balance += amount;
    }

    /* 3 & 7 & 8. withdraw() - takes the amount to withdraw, returns nothing
       - CHECKING accounts are allowed to go negative (overdraft allowed)
       - SAVINGS accounts are NOT allowed to overdraw:
         instead of just printing a message (an earlier version of this method),
         it now throws an ArithmeticException, per the final requirement */
    public void withdraw(int amount) {
        if (accountType == AccountType.SAVINGS && amount > balance) {
            throw new ArithmeticException("Cannot overdraw a SAVINGS account.");
        }
        balance -= amount;
    }

    /* 3. toString() - no parameters, returns a String description */
    @Override
    public String toString() {
        return "The account with number " + accountNumber +
                " is of type '" + accountType + "' and has a balance of " + balance;
    }

    /* 4. Creates and fills an array of 3 accounts */
    public Account[] anArrayOfAccounts() {
        Account[] accounts = new Account[3];
        accounts[0] = new Account(100, 1001, AccountType.CHECKING);
        accounts[1] = new Account(500, 1002, AccountType.SAVINGS);
        accounts[2] = new Account(250, 1003, AccountType.CHECKING);

        /* 5. Enhanced loop - print toString() of each account */
        for (Account acc : accounts) {
            System.out.println(acc.toString());
        }
        return accounts;
    }

    /* 4. Creates and fills a list of 3 accounts */
    public List<Account> aListOfAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(300, 2001, AccountType.SAVINGS));
        accounts.add(new Account(750, 2002, AccountType.CHECKING));
        accounts.add(new Account(50, 2003, AccountType.SAVINGS));

        /* 5. Enhanced loop - print toString() of each account */
        for (Account acc : accounts) {
            System.out.println(acc.toString());
        }
        return accounts;
    }
}
