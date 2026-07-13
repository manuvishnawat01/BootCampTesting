package com.Interface;

interface FirstInterface {
	public void myMethod();
}

interface SecondInterface {
	public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface { 
	public void myMethod() {
		System.out.println("Enter Some text .. ");
	}
	public void myOtherMethod() {
		System.out.println("Enter Some other text .. ");
	}
}

public class main { 
	public static void main(String[] args) {
		DemoClass myobj = new DemoClass(); 
		myobj.myMethod();
		myobj.myOtherMethod();
	}
}