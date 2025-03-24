package Session5;

public class WrapperClassEx {
	public static void main(String[] args) {
		
		//converting primitive to wrapper class
		int a = Integer.valueOf(50);
		Integer intobj = 50;//equivalent to integer.valueof(50);
		
		Character charobj = 'A';
		
		Double dobj = 25.35476;
		System.out.println(a);
		System.out.println(intobj);
		System.out.println(charobj);
		System.out.println(dobj);
		
		System.out.println("------------------------------------");
		
		//converting wrapper class to premitive
		int value1 = intobj;
		char value2 = charobj;
		double value3 = dobj;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		System.out.println("-------------------------------------");
		
		//using  utility method from wrapper class
		int parseInt = Integer.parseInt("123");
		double parseDouble = Double.parseDouble("25.35476");
		boolean parseboolean = Boolean.parseBoolean("true");
		
		System.out.println(parseInt);
		System.out.println(parseDouble);
		System.out.println(parseboolean);
		
		
	}

}
