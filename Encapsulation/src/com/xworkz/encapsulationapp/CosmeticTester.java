package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.cosmetic.CosmeticDTO;

public class CosmeticTester {

public static void main(String args[]) {
		
		CosmeticDTO cos = new CosmeticDTO();
		cos.setId(34);
		cos.setName("Himalaya");
		cos.setContent("Alovera");
		cos.setPrice(89.5);
		
		System.out.println("Cosmetic id is " + cos.getId());
		System.out.println("Cosmetic name is " + cos.getName());
		System.out.println("Cosmetic content is " + cos.getContent());
		System.out.println("Cosmetic price is " + cos.getPrice());
	}

}
