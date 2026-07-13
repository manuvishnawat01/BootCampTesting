package Banking_Application;

class Bank {
	public void calculateInterest() {
		System.out.println("General interes Calculation");
	}
}

class SBI extends Bank{
	@Override
	public void calculateInterest() {
		System.out.println("SBI Interest = 6.5% ");
	}
}

class HDFC extends Bank{
	@Override
	public void calculateInterest() {
		System.out.println("SBI Interest = 7% ");
	}
}

class ICICI extends Bank{
	@Override
	public void calculateInterest() {
		System.out.println("SBI Interest = 7% ");
	}
}


public class BankTest {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.calculateInterest();
		HDFC hdfc = new HDFC();
		hdfc.calculateInterest();
		ICICI icici = new ICICI();
		icici.calculateInterest();
	}
} 
