package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.phone.SmartPhoneDTO;

public class SmartPhoneTester {

public static void main(String args[]) {
		
		SmartPhoneDTO sm = new SmartPhoneDTO();
		sm.setId(456);
		sm.setBrand("Vivo");
		sm.setStorage("128 gb");
		sm.setPrice(21000);
		
		System.out.println("Smart phone id is " + sm.getId());
		System.out.println("Smart phone id is " + sm.getBrand());
		System.out.println("Smart phone id is " + sm.getStorage());
		System.out.println("Smart phone id is " + sm.getPrice());
		
				
	}
}
