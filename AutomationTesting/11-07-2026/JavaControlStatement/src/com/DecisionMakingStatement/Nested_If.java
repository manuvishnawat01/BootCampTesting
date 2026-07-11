package com.DecisionMakingStatement;

public class Nested_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "Delhi, India";
		
		if(address.endsWith("India")) {
			if(address.contains("Meerut")) {
				System.out.println("your city is Meerut");
			}
			else if(address.contains("Noida")) {
				System.out.println("your city is Noida");
			}
			else {
				System.out.println(address.split(" , ")[1]);
			}
		}
		else {
			System.out.println("You are not living in india");
		}
	}
 
}
