package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Fish {

	public Fish() {
		super();
		System.out.println("Created Fish by Spring..");
	}

	@Override
	public String toString() {
		return "Fish [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
