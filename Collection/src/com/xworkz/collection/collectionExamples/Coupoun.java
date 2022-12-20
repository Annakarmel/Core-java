package com.xworkz.collection.collectionExamples;

import java.util.LinkedHashSet;

public class Coupoun {

	public static void main(String[] args) {
		
		String coupoun1 = "Percent-off coupons";
		String coupoun2 = "Free shipping coupons";
		String coupoun3 = "Free gift with purchase";
		String coupoun4 = "Promo codes based on loyalty status";
		String coupoun5 = "BOGO coupons";
		String coupoun6 = "Automatic coupons";
		String coupoun7 = "Gift card with purchase";
		String coupoun8 = "Friends and family discount codes";
		String coupoun9 = "Mystery deals";
		String coupoun10 = "Mobile coupons";
		String coupoun11 = "Fixed price coupons";
		String coupoun12 = "Advanced shipping coupons";
		
		LinkedHashSet<String> collections = new LinkedHashSet<String>();
		
		collections.add(coupoun1);
		collections.add(coupoun2);
		collections.add(coupoun3);
		collections.add(coupoun4);
		collections.add(coupoun5);
		collections.add(coupoun6);
		collections.add(coupoun7);
		collections.add(coupoun8);
		collections.add(coupoun9);
		collections.add(coupoun10);
		collections.add(coupoun11);
		collections.add(coupoun12);
		
		System.out.println("Before clear..."+collections.size());
		
		collections.clear();
		System.out.println("After clear.. "+collections.size());
	}
}
