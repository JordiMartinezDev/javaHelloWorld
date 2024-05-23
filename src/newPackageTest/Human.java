package newPackageTest;


public class Human {

	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	// Constructor
	public Human(int age, int heightInInches, String name, String eyeColor) { 
		this.age = age;
		this.eyeColor = eyeColor;
		this.heightInInches = heightInInches;
		this.name = name;
	}
	public void speak() {
		System.out.println("Hello, my name is : "+ name);
		System.out.println("I am "+ age + " years old");
		System.out.println("I am "+ heightInInches +" inches tall");
		System.out.println("My eye color is "+ eyeColor);
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	public void walk() {
		System.out.println("walking...");
	}
	public void work() {
		System.out.println("working..");
	}
}
