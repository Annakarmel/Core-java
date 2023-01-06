package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Chocolate {

	public Chocolate() {
		super();
		System.out.println("Created Chocolate by Spring..");
	}

	@Override
	public String toString() {
		return "Chocolate [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
