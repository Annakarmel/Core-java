package com.xworkz.springFramework.bean;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel{
	
	public  Diesel() {
		System.out.println("Created diesel...");
	}

	@Override
	public void consume() {
		System.out.println("Running consume from diesel..");		
	}

}
