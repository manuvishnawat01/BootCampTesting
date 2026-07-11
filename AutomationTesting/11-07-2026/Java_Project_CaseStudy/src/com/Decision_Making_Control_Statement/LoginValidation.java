package com.Decision_Making_Control_Statement;

public class LoginValidation {

    public static void main(String[] args) {

        String username = "admin";
        String password = "Admin123";

        if (username.equals("admin") && password.equals("Admin123")) {
            System.out.println("Login Successful");
        }

        System.out.println("Login Process Finished.");
    }
}
