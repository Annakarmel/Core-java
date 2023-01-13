package com.xworkz.springReference.boot;

import org.springframework.stereotype.Component;

@Component
public class Colonel {

	public Colonel() {
		System.out.println("Created colonel by no-arg constructor..");
	}
	
	@Override
	public int hashCode() {
		return 40;
	}
}
