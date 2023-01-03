package com.xworkz.collection.collectionExamples.application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ApplicationTester {

	public static void main(String[] args) {
		
		Collection<ApplicationDTO> collection = new ArrayList<ApplicationDTO>();
		collection.add(new ApplicationDTO("Google Assistance", 68.0, "Google", 0, true));
		collection.add(new ApplicationDTO("Facebook", 7, "Meta", 250, true));
		collection.add(new ApplicationDTO("Google drive", 11, "Google", 650, true));
		collection.add(new ApplicationDTO("Instagram", 70, "Meta", 0, true));
		
		collection.stream().filter(ele-> ele.isFree()!= false || ele.getDevelopedBy()=="Google" || ele.getVersion()>5)
		.collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
		
		System.out.println(System.lineSeparator());
		System.out.println("-----------------------------------------------------");
		collection.stream().collect(Collectors.toSet()).forEach(dto->System.out.println(dto.getName()));

	}
}
