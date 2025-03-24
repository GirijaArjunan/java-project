package Session5;

public class Person {

	private String name;
	private int age;
	
	
	//Regular Constructor
	public person(person other) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
	//Copy Constructor
public Person(Person other) {
		this.name = other.name;
		this.age = other.age;
		
	}
	
	
	
	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	//Method to display
	public void displayInfo() {
		System.out.println("Name:"+name+"Age: "+age);
	}
	
}
