package com.BankingApplication;

import java.util.ArrayList;

public class BankApplication {

    public static void main(String[] args) {

        System.out.println("----- ARRAY OF ACCOUNTS -----");

        anArrayOfAccounts();

        System.out.println();

        System.out.println("----- LIST OF ACCOUNTS -----");

        listOfAccounts();

        System.out.println();

        Account checking = new Account(1000, 11111, AccountType.CHECKING);

        checking.deposit(500);

        checking.withdraw(1200);

        System.out.println(checking);

        System.out.println();

        Account savings = new Account(500, 22222, AccountType.SAVINGS);

        savings.deposit(300);

        System.out.println(savings);

        try {

            savings.withdraw(1000);

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }

        System.out.println(savings);
    }

    // Array Method

    public static void anArrayOfAccounts() {

        Account[] accounts = new Account[3];

        accounts[0] = new Account(1000, 101, AccountType.CHECKING);

        accounts[1] = new Account(5000, 102, AccountType.SAVINGS);

        accounts[2] = new Account(2500, 103, AccountType.CHECKING);

        for (Account account : accounts) {

            System.out.println(account);
        }
    }

    // List Method

    public static void listOfAccounts() {

        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account(7000, 201, AccountType.SAVINGS));

        accounts.add(new Account(9000, 202, AccountType.CHECKING));

        accounts.add(new Account(4500, 203, AccountType.SAVINGS));

        for (Account account : accounts) {

            System.out.println(account);
        }
    }
}