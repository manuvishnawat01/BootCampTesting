package com.NoArgumentConstructor;

public class AccountDemo {
    public static void main(String[] args) {

        Account helper = new Account();

        System.out.println("=== Array of accounts ===");
        helper.anArrayOfAccounts();

        System.out.println("\n=== List of accounts ===");
        helper.aListOfAccounts();

        System.out.println("\n=== No-argument constructor + deposit ===");
        Account account = new Account();
        account.deposit(10);
        System.out.println(account);          // balance should be 10

        System.out.println("\n=== Parameterized (CHECKING) constructor: deposit then overdraw ===");
        Account checking = new Account(0, 1001, AccountType.CHECKING);
        checking.deposit(10);
        checking.withdraw(20);
        System.out.println(checking);         // balance should be -10 (overdraft allowed)

        System.out.println("\n=== SAVINGS account: immediate withdraw throws exception ===");
        Account savings = new Account(0, 2001, AccountType.SAVINGS);
        try {
            savings.withdraw(10);
        } catch (ArithmeticException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}
