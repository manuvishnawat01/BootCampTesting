package com.LoopStatement;

public class For_Each_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"java", "c", "c++","Python", "R"};
		
		System.out.println("Printing the content of array elements ")
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
