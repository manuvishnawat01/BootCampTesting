package com.ScannerDemo;

import java.util.Scanner;

public class next {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Text Entered : ");
		
		//read the entire word
		String value = input.next();
		System.out.println("Text Entered : " + value);
		
		input.close();
		
	}
}
