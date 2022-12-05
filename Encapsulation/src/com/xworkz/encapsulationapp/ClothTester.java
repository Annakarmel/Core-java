package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.cloth.ClothDTO;

public class ClothTester {

public static void main(String args[]) {
		
		ClothDTO cl = new ClothDTO();
		cl.setId(765);
		cl.setColor("Red");
		cl.setPrice(599.99);
		
		System.out.println("Cloth id is" + cl.getId());
		System.out.println("Cloth color is" + cl.getColor());
		System.out.println("Cloth price is " + cl.getPrice());
		
		
	}

}
