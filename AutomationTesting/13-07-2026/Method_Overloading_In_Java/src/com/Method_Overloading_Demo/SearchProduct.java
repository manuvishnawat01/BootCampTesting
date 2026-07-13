//Example to show that search a product E-commerce application.
package com.Method_Overloading_Demo;

public class SearchProduct {
    public void search(String ProductName) {
        System.out.println("Searching by Product name ");
    }

    // Fixed 'Void' to 'void'
    public void search(String productName, String brand) {
        System.out.println("Search by product and brand");
    }

    // Fixed 'Void' to 'void'
    public void search(String productName, String brand, int price) {
        System.out.println("Search by product ,brand ,price");
    }

    public static void main(String[] args) {
        // Fixed 'searchProduct' to 'SearchProduct'
        SearchProduct s = new SearchProduct();
        s.search("Laptop");
        s.search("Laptop", "Macbook");
        s.search("Laptop", "Lenovo", 50000);
    }
}