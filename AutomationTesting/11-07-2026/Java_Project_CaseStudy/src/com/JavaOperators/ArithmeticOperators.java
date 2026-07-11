package com.JavaOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int laptopPrice = 50000;
        int quantity = 2;

        System.out.println("Addition (+): " + (laptopPrice + quantity));
        System.out.println("Subtraction (-): " + (laptopPrice - quantity));
        System.out.println("Multiplication (*): " + (laptopPrice * quantity));
        System.out.println("Division (/): " + (laptopPrice / quantity));
        System.out.println("Modulus (%): " + (laptopPrice % quantity));

        int totalPrice = laptopPrice * quantity;
        System.out.println("Total Price = ₹" + totalPrice);
    }
}