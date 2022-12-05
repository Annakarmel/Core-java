package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.beach.BeachesDTO;

public class BeachTester {

	public static void main(String[] args) {
		
		BeachesDTO bch = new BeachesDTO();
		bch.setId(852);
		bch.setName("Meera maar");
		
		System.out.println("Beach id is: " + bch.getId());
		System.out.println("Beach name is: " + bch.getName());
	}
}
