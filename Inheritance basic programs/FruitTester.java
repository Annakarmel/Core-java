package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.fruit.Fruit;
import com.xworkz.inheritanceapp.fruit.Mango;

public class FruitTester {
	
	public static void main(String args[]) {
	Fruit fr = new Fruit();
	fr.getProtine(35);
	System.out.println("Cost of the fruit is.."+fr.cost);
	
	Mango mg = new Mango();
	mg.getProtine(35);
	System.out.println("Price of Mango is.."+ mg.cost);
	}

}
