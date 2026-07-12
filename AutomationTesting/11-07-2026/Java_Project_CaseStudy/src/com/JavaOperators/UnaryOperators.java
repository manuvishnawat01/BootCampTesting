package com.JavaOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int number = 10;

        System.out.println("Positive (+): " + (+number));

        System.out.println("Negative (-): " + (-number));

        number++;
        System.out.println("Increment (++): " + number);

        number--;
        System.out.println("Decrement (--): " + number);

        boolean accountLocked = false;

        System.out.println("Account Locked: " + accountLocked);

        System.out.println("Account Accessible (!): " + (!accountLocked));
    }
}