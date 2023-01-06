package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Mask {

	public Mask() {
		super();
		System.out.println("Created Mask by Spring..");
	}

	@Override
	public String toString() {
		return "Mask [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
