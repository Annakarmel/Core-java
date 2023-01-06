package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Road {

	public Road() {
		super();
		System.out.println("Created Road by Spring..");
	}

	@Override
	public String toString() {
		return "Road [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
