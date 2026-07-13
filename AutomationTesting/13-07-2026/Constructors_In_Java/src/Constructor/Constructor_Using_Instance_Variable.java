package Constructor;

public class Constructor_Using_Instance_Variable {
		
	String webName; 
	int webAge;
	
	public Constructor_Using_Instance_Variable(String name, int age) {
		this.webName = name; 
		this.webAge = age;  
	}
	
	public static void main(String ag[]) {
		Constructor_Using_Instance_Variable obj1 = new Constructor_Using_Instance_Variable("manu", 21);
		Constructor_Using_Instance_Variable obj2 = new Constructor_Using_Instance_Variable("https://www.google.com/", 21);
	
		System.out.println(obj1.webName + " " + obj1.webAge);
		System.out.println(obj2.webName + " " + obj2.webAge);
	}
}