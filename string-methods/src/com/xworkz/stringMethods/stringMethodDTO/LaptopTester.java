package com.xworkz.stringMethods.stringMethodDTO;

public class LaptopTester {

public static void main(String args[]) {
		
		Laptop lp =new Laptop();
		lp.setName("HP");
		lp.setPrice(60000);
		System.out.println(lp);
		
		Laptop lp1 =new Laptop();
		lp1.setName("Lenova");
		lp1.setPrice(29000);
		System.out.println(lp1);
		
		System.out.println(lp==lp);
		System.out.println(lp==lp1);
		System.out.println(lp.equals(lp1));
		System.out.println(lp.hashCode());
		System.out.println(lp1.hashCode());		
	}
}
