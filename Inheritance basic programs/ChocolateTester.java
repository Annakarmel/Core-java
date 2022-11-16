package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.chocolate.Chocolate;
import com.xworkz.inheritanceapp.chocolate.MilkyBar;

public class ChocolateTester {

	public static void main(String args[]) {
		
		Chocolate choc = new Chocolate();
		choc.toGetEnjoy(" chocos flavour");
		System.out.println("Chocolate falvour is" + choc.flavour);
		
		MilkyBar choc1 = new MilkyBar();
		choc1.toGetEnjoy("Milk flavour");
		System.out.println("Milky bar flavour is " + choc1.flavour);
		
	   }
}
