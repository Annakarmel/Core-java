package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Cycle {

	public Cycle() {
		super();
		System.out.println("Created Cycle by Spring..");
	}

	@Override
	public String toString() {
		return "Cycle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
