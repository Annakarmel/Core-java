package com.xworkz.springFramework.browserBean;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {

	public Jio() {
		System.out.println("Created Jio using no-arg constructor..");
	}
	
	@Override
	public void connect() {
		System.out.println("Running Connect in Jio..");

	}

}
