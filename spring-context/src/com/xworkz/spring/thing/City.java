package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class City {

	public City() {
		super();
		System.out.println("Created City by Spring..");
	}

	@Override
	public String toString() {
		return "City [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
