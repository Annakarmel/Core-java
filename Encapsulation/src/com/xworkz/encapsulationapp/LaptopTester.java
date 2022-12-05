package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.laptop.LaptopDTO;

public class LaptopTester {

	public static void main(String[] args) {
	
		LaptopDTO laptop = new LaptopDTO();
		laptop.setId(123);
		laptop.setBrand("HP");
		laptop.setProcessor("i5");
		
		System.out.println("Laptop id is " + laptop.getId());
		System.out.println("Laptop brand is " + laptop.getBrand());
		System.out.println("Laptop processor type is " + laptop.getProcessor());
		
	}
}
	
