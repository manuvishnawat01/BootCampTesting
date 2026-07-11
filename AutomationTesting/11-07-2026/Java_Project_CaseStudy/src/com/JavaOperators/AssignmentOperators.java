package com.JavaOperators;

public class AssignmentOperators {

    public static void main(String[] args) {

        int accountBalance = 10000;

        System.out.println("Initial Balance = " + accountBalance);

        accountBalance += 500;
        System.out.println("After Deposit (+=): " + accountBalance);

        accountBalance -= 1000;
        System.out.println("After Withdrawal (-=): " + accountBalance);

        accountBalance *= 2;
        System.out.println("After Multiply (*=): " + accountBalance);

        accountBalance /= 3;
        System.out.println("After Division (/=): " + accountBalance);

        accountBalance %= 1000;
        System.out.println("After Modulus (%=): " + accountBalance);
    }
}