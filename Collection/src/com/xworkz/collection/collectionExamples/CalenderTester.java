package com.xworkz.collection.collectionExamples;

import java.util.ArrayList;
import java.util.Collection;

public class CalenderTester {

public static void main(String[] args) {
		
		CalenderDTO dto1 = new CalenderDTO("Asali", "Kannad", 101);
		CalenderDTO dto2 = new CalenderDTO("TimesOfIndia", "English", 102);
		CalenderDTO dto3 = new CalenderDTO("Basaaweshwar", "Telagu", 103);
		CalenderDTO dto4 = new CalenderDTO("Mahananda", "Marathi", 104);
		CalenderDTO dto5 = new CalenderDTO("Vishala", "Kannad", 105);
		
		Collection<CalenderDTO> collection = new ArrayList<CalenderDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		boolean contain = collection.contains(dto4);
		System.out.println("contains or not : " + contain);
		
		boolean equal = dto1.equals(dto5);
		System.out.println("equal or not : " + equal);
		
		boolean equals = dto2.equals(dto4);
		System.out.println("equals or not : " + equals);
	}

}
