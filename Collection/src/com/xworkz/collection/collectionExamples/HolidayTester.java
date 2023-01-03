package com.xworkz.collection.collectionExamples;

import java.util.ArrayList;
import java.util.Collection;

public class HolidayTester {

public static void main(String[] args) {
		
		HolidayDTO dto1 = new HolidayDTO("Summer", "Headmaster", 60);
		HolidayDTO dto2 = new HolidayDTO("Dusshera", "HR", 7);
		HolidayDTO dto3 = new HolidayDTO("NationalHoliday", "BankManager", 2);
		HolidayDTO dto4 = new HolidayDTO("Flood", "Minister", 15);
		HolidayDTO dto5 = new HolidayDTO("Summer", null, 1);
		
		Collection<HolidayDTO> collection = new ArrayList<HolidayDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		boolean contain = collection.contains(dto4);
		System.out.println("contains or not : " + contain);
		
		boolean equals = dto1.equals(dto5);
		System.out.println("equals or not : " + equals);
		
	}
}
