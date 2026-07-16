package com.AccessModifiers;

class ParentClassB {
    public int x() {
        return 10;
    }

    public void b1() {
        System.out.println("Public b1 method executed successfully.");
    }
}

public class Public extends ParentClassB {
    
    public static void main(String[] args) {
        Public obj = new Public();
        
        int output = obj.x();
        System.out.println("value of x is : " + output);
        
        obj.b1();
    }
}
