package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Temple {

	public Temple() {
		super();
		System.out.println("Created Temple by Spring..");
	}

	@Override
	public String toString() {
		return "Temple [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
