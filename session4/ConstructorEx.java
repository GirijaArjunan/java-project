package session4;

public class ConstructorEx {
	
	public ConstructorEx ( ) {
		System.out.println("Default constructor");
	}
	
	public ConstructorEx(String name, String age) {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Parameterized constructor");
	}
	
	public int sum(int a, int b) {
		int res = a + b;
		return res;
	}

	public static void main(String[] args) {

		ConstructorEx ce = new ConstructorEx();
		ConstructorEx ce1 = new ConstructorEx("Sherlin", "18");
		System.out.println(ce.sum(5, 10));
		
		
	
}
}
