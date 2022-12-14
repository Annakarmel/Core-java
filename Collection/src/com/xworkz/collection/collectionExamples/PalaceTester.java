package com.xworkz.collection.collectionExamples.Palace;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class PalaceTester {

	public static void main(String[] args) {

	Collection<PalaceDTO> collection = new LinkedList<PalaceDTO>();	
		collection.add(new PalaceDTO("Mysore Palace","Mysore","Avinash",false,500));
		collection.add(new PalaceDTO("Buking ham Palace","Bagalkot","Avinash",true,200));
		collection.add(new PalaceDTO("Mysore Palace","Mysore","Avinash",true,500));
		collection.add(new PalaceDTO("Umaid Bhavan  Palace","Jodhpur","Avinash",false,2500));

		collection.stream().filter(ele->ele.isDestroyed()!=true).collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
				
	}
}
