package com.xworkz.collection.collectionExamples;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("R");
		list.add("J");
		list.add("D");
		list.add("N");
		
		list.add(2, "S");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("-------Remove-------");
		
		System.out.println("Element size before remove "+list.size());
		list.remove("R");
		System.out.println("Element size after remove "+list.size());
		
		list.set(2, "B");
		for (String string : list) {
			System.out.println(string);
		}
		list.add("D");
		
		System.out.println("After adding dublicate");
		for (String string : list) {
			System.out.println(string);
		}
		
		list.remove("J");
		
		list.set(3, "A");
		
		String ref = list.get(2);
		System.out.println(ref);
	}
}
