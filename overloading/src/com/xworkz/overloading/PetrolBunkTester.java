package com.xworkz.overloading;

import com.xworkz.overloading.conceptoverloading.PetrolBunk;

public class PetrolBunkTester {

	public static void main(String[] args) {
		
		String workersName[] = {"Muskan","Sneha","Sahana","Mahananda","Pooja","Shrinidhi","Swati"};
		//PetrolBunk bunk = new PetrolBunk(123, "Balaji Petrol bunk", "Bagalkot", workersName);
		//System.out.println("Patrol bunk id: "+ bunk.id +" "+ bunk.name+" "+ bunk.location);
		
		PetrolBunk bunk2 = new PetrolBunk(workersName);
		System.out.println("Petrol bunk id: "+ bunk2.id +" "+ bunk2.name+" "+ bunk2.location);
		bunk2.displayDetails();
		
	}
}
