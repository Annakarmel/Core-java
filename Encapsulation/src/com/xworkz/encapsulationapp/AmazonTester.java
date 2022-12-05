package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.Amazon.AmazonDTO;

public class AmazonTester {

public static void main(String args[]) {
		
		AmazonDTO ec = new AmazonDTO();
		ec.setId(554);
		ec.setName("Jeans");
		ec.setPrice(699);
		
		System.out.println("Amazon id is " + ec.getId());
		System.out.println("Amazon Product name is " + ec.getName());
		System.out.println("Amazon Price is " + ec.getPrice());
	}
}
