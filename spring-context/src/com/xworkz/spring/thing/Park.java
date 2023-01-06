package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Park {

	public Park() {
		super();
		System.out.println("Created Park by Spring..");
	}

	@Override
	public String toString() {
		return "Park [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
