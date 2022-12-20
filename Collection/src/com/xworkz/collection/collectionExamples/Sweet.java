package com.xworkz.collection.collectionExamples;

import java.util.HashSet;

public class Sweet {

	public static void main(String[] args) {
		
		String sweet1 = "Jamoon";
		String sweet2 = "Rasgulla";
		String sweet3 = "Rasmalai";
		String sweet4 = "Kaju Katri";
		String sweet5 = "Jalebi";
		String sweet6 = "Kunda";
		String sweet7 = "Karadantu";
		String sweet8 = "Peda";
		String sweet9 = "Champakali";
		String sweet10 = "Holagi";
		String sweet11 = "Jangeer";
		String sweet12 = "Kesari Bath";
		String sweet13 = "Barfi";
		
		HashSet<String> collections = new HashSet<String>();
		
		collections.add(sweet1);
		collections.add(sweet2);
		collections.add(sweet3);
		collections.add(sweet4);
		collections.add(sweet5);
		collections.add(sweet6);
		collections.add(sweet7);
		collections.add(sweet8);
		collections.add(sweet9);
		collections.add(sweet10);
		collections.add(sweet11);
		collections.add(sweet12);
		collections.add(sweet13);

		System.out.println("Before clea.."+collections.size());
		
		collections.clear();
		System.out.println("After clear...");
		System.out.println(collections.size());
	}
}
