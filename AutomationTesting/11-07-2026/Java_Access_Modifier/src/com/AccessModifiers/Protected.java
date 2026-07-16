package com.AccessModifiers;

class ParentClass {
    protected int z() {
        return 10;
    }

    protected void protectedMethod() {
        System.out.println("Protected method executed successfully.");
    }
}

public class Protected extends ParentClass {
    
    public static void main(String[] args) {
        Protected obj = new Protected();
        
        int output = obj.z();
        System.out.println("value of z is : " + output);
        
        obj.protectedMethod();
    }
}
