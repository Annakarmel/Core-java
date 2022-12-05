package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.forest.ForestDTO;

public class ForestTester {

public static void main(String args[]) {
		
		ForestDTO fr = new ForestDTO();
		fr.setId(789);
		fr.setName("Amazon forest");
		fr.setCity("Africa");
		
		System.out.println("Forest id is " + fr.getId());
		System.out.println("Forest name is " + fr.getName());
		System.out.println("Forest city is " + fr.getCity());
	}
}
