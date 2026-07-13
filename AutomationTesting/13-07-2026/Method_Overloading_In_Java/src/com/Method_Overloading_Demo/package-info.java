package com.Method_Overloading_Demo;

public class MoneyTransfer {
	public void transfer(double amount) {
		System.out.println("Transfered Amount :"+ amount);
	}
	
	public void transfer(double amount, String accountNumber) {
		System.out.println("Transferred" + amount + "to Account : " + accountNumber);
	}
	
	public void transfer(double amount , String accountNumber, String remark) {
		System.out.println("Transferred" + amount);
		System.out.println("accountNumber" + accountNumber);
		System.out.println("Remarks: "+ remark);
	}
	
	public static void main(String[] args) {
		MoneyTransfer mt = new MoneyTransfer();
		mt.transfer(1000);
		mt.transfer(5000,"SBIN12345");
		mt.transfer(10000,"32721974","House Rent");
	}
}