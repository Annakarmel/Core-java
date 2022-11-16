package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.coffeePowder.CoffeePowder;
//import com.xworkz.inheritanceapp.coffeePowder.Levista;

public class CoffeeePowderTester {

		public static void main(String args[]) {
				
		        CoffeePowder coffee = new CoffeePowder();
				coffee.toMakeCoffee("relaxing the mind");
				System.out.println("Coffe is good for " + coffee.name);
				
			}
}
