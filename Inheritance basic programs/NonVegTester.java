package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.nonVeg.Chicken;
import com.xworkz.inheritanceapp.nonVeg.NonVeg;

public class NonVegTester {

public static void main(String args[]) {
		
		NonVeg veg = new NonVeg();
		veg.toGetProtien("Kabab");
		System.out.println("Most delicious food we made from non veg is " + veg.reciepe);
		
		Chicken veg1 = new Chicken();
		veg1.toGetProtien("Chicken 65");
		System.out.println("One of the chicken recipee is " + veg1.reciepe);
		
	}
}
