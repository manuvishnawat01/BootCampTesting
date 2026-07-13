package com.AbstractionTestDemo;

abstract class Bank{
	public void deposit() {
		System.out.println("Money Deposite");
	}
	public void withdraw() {
		System.out.println("Money Withdrawn");
	}
	abstract void calculateInterest();
}

class SBI extends Bank{
	@Override
	void calculateInterest() {
		System.out.println("SBI Interesr = 6.5% ");
	}
}

class HDFC extends Bank{
	@Override 
	void calculateInterest() {
		System.out.println("HDFC Interesr = 7% ");
	}
}

public class BankTestDemo {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.deposit();
		sbi.withdraw();
		sbi.calculateInterest();
	}
}
