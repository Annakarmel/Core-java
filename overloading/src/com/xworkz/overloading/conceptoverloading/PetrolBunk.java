package com.xworkz.overloading.conceptoverloading;

public class PetrolBunk {
	
	public int id;
	public String name;
	public String location;
	public String workersName[] = new String [7];
	
	public PetrolBunk() {
		System.out.println("Default constructor is called");
	}
	
	//Default constructor
	public PetrolBunk(String workersName[]) {
		this(123, "Balaji Petrol bunk", "Bagalkot", workersName);//-> it will be error if both are default value
		System.out.println("One parametrized constructor");
	}
	
	//Parameterized constructor
	public PetrolBunk(int id, String name, String location, String[] workersName) {
	this();//-->It is called as constructor chaining, calling default constructor, it should be there in a first statement only.
		System.out.println("Calling 4 parameterized constructior");
	this.id = id;
	this.name = name;
	this.location = location;
	this.workersName = workersName;
	}
	
	public void provideFuels() {
		
	}
	public void displayDetails() {
		System.out.println("displayDetails() is invoked");
		System.out.println(this.id+" "+ this.name+" "+ this.location);
		System.out.println("List of workers for "+ this.name);
		for(int i =0; i < workersName.length; i++) {
			System.out.println(workersName[i]);//--> Instance method overloading
		}
		
		/*public static void displayDetails(int j) {
			System.out.println("displayDetails() is invoked");
			System.out.println(this.id+" "+ this.name+" "+ this.location);
			System.out.println("List of workers for "+ this.name);
			for(int i =0; i < workersName.length; i++) {
				System.out.println(workersName[i]);
			}*///---> Static method  overloading
	}
	
}
