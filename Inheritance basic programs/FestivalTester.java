package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.festival.Festival;

public class FestivalTester {
public static void main(String args[]) {
		
		Festival fstl = new Festival();
		fstl.toCelebrate(4000);
		System.out.println("Price of the Ganesha murti is " + fstl.priceOfCrackers);
	}
}
