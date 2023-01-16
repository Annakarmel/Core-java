package com.xworkz.springFramework.browserBean;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider {
	
	public Airtel() {
		System.out.println("Created Airtel using no-arg constructor..");
	}


	@Override
	public void connect() {
		System.out.println("Running Connect in Airtel..");

	}

}
