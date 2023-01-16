package com.xworkz.springFramework.bean;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel{
	
	public Petrol() {
		System.out.println("Created petrol using no-arg constructor..");
	}

	@Override
	public void consume() {
		System.out.println("Running consume in petrol..");
	}

}
