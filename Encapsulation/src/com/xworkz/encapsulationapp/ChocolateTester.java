package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.chocolate.ChocolateDTO;

public class ChocolateTester {

public static void main(String args[]) {
		
		ChocolateDTO ch = new ChocolateDTO();
		ch.setId(121);
		ch.setName("Milky Bar");
		ch.setPrice(50.00);
		
		System.out.println("Chocolate id is " + ch.getId());
		System.out.println("Chocolate name is " + ch.getName());
		System.out.println("Chocolate price is " + ch.getPrice());
	}

}
