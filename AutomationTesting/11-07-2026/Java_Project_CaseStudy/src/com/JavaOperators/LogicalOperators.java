package com.JavaOperators;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean username = true;
        boolean password = true;

        System.out.println("Login Successful (&&): " + (username && password));

        boolean otp = false;

        System.out.println("Login with OTP (||): " + (username || otp));

        System.out.println("NOT Password (!): " + (!password));
    }
}