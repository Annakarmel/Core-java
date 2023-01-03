package com.xworkz.collection.collectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

public class SanitizerDTOTester {

	public static void main(String[] args) {

		SanitizerDTO dto1 = new SanitizerDTO(1, "Sterillium", 3D, "White");
		SanitizerDTO dto2 = new SanitizerDTO(2, "Savlon", 4D, "Brown");
		SanitizerDTO dto3 = new SanitizerDTO(3, "Dettol", 5D, "Yellow");
		SanitizerDTO dto4 = new SanitizerDTO(4, "Lifebuy", 80D, "Orange");
		SanitizerDTO dto5 = new SanitizerDTO(5, "Godrej", 90D, "Pink");
		SanitizerDTO dto6 = new SanitizerDTO(6, "Dabur", 95D, "Green");
		SanitizerDTO dto7 = new SanitizerDTO(7, "Multani", 100D, "Red");
		SanitizerDTO dto8 = new SanitizerDTO(8, "Corvil", 105D, "Black");
		SanitizerDTO dto9 = new SanitizerDTO(9, "Trust", 150D, "Blue");
		SanitizerDTO dto10 = new SanitizerDTO(10, "Shriram", 200D, "");
		
		Collection<SanitizerDTO> collection = new ArrayList<SanitizerDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);
		
		Iterator<SanitizerDTO> ref = collection.iterator();
		while(ref.hasNext()) {
			SanitizerDTO value = ref.next();
			
			if(value.getPrice() > 5) {
				System.out.println(value);
			}
			
			if("".equals(value.getColor())) {
				System.out.println("null value " + value);
			}
			
			if("Green".equals(value.getColor())){
				System.out.println("removed green color brand" + value);
				ref.remove();
			}
			
			if("Blue".equals(value.getColor())) {
				System.out.println("removed blue color brand " + value);
				ref.remove();
			}
			
			if("Red".equals(value.getColor())) {
				System.out.println("removed red color brand" + value);
				ref.remove();
			}
			
			
		}
		//Stream.of(45,109,45,67).max(null);
		
	}

}
