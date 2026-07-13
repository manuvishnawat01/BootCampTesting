package Constructor;

public class C_01_Constructor {

	public C_01_Constructor() {
		System.out.println("This is the constructor block");
	}

	public void method() {
		System.out.println("This is the method block");
	}
	
	public static void main(String[] args) {
		C_01_Constructor obj = new C_01_Constructor();
		obj.method();
	}
}