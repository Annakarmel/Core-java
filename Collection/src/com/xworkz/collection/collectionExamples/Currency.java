package com.xworkz.collection.collectionExamples;

import java.util.TreeSet;

public class Currency {

public static void main(String args[]) {
		
		String cur1 = "Indian Rupee";
		String cur2 = "Us Dollar";
		String cur3 = "Australian Dollar";
		String cur4 = "Aruban Florin";
		String cur5 = "Brazillian Real";
		String cur6 = "Pound Sterling";
		String cur7 = "Pataca";
		String cur8 = "Colombian Peso";
		String cur9 = "Comoro Franc";
		String cur10 = "Danish Krone";
		String cur11 = "Iranian Rial";
		String cur12 = "Rupaih";
		String cur13 = "Iraqi Dinar";
		String cur14 = "Kenyan Shilling";
		String cur15 = "North Korean Won";
		String cur16 = "Kuwaiti Dinar";
		String cur17 = "Som";
		String cur18 = "Kip";
		String cur19 = "Loti";
		String cur20 = "Denar";
		String cur21 = "Malagasy Ariary";
		String cur22 = "Rufiyaa";
		String cur23 = "Tugrika";
		String cur24 = "Metical";
		String cur25 = "Kyat";
		String cur26 = "Naira";
		
		TreeSet<String> collections = new TreeSet<String>();
		
		collections.add(cur1);
		collections.add(cur2);
		collections.add(cur3);
		collections.add(cur4);
		collections.add(cur5);
		collections.add(cur6);
		collections.add(cur7);
		collections.add(cur8);
		collections.add(cur9);
		collections.add(cur10);
		collections.add(cur11);
		collections.add(cur12);
		collections.add(cur13);
		collections.add(cur14);
		collections.add(cur15);
		collections.add(cur16);
		collections.add(cur17);
		collections.add(cur18);
		collections.add(cur19);
		collections.add(cur20);
		collections.add(cur21);
		collections.add(cur22);
		collections.add(cur23);
		collections.add(cur24);
		collections.add(cur25);
		collections.add(cur26);
		
		System.out.println("Before clear.."+collections.size());
		collections.clear();
		System.out.println("After clear.."+collections.size());	
	}
}
