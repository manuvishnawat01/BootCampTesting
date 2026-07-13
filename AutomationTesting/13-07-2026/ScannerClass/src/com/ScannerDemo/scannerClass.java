package com.ScannerDemo;

import java.util.Scanner;

public class scannerClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter your first name Initial: ");
        String firstInitial = keyboard.nextLine();
        
        System.out.print("Please enter your last name: ");
        String lastName = keyboard.nextLine();
        
        System.out.print("Please enter your house number: ");
        int houseNumber = keyboard.nextInt();
        
        // FIX: Consume the leftover newline character left by nextInt()
        keyboard.nextLine(); 
        
        System.out.print("Please enter your street name: ");
        String streetName = keyboard.nextLine();
        
        System.out.print("Please enter your street type: ");
        String streetType = keyboard.nextLine();
        
        System.out.print("Please enter your city: ");
        String city = keyboard.nextLine();
        
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}