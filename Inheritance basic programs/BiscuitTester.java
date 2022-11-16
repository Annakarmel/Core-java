package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.biscuit.Biscuit;
import com.xworkz.inheritanceapp.biscuit.Oreo;

public class BiscuitTester {
	
	public static void main(String args[]) {
		
		Biscuit bis = new Biscuit();
		bis.toEat(10);
		System.out.println("Biscuit price is.."+bis.price);
		
		Oreo or = new Oreo();
		or.toEat(25);
		System.out.println("Oreo biscuit price is.."+or.price);
	}
}
