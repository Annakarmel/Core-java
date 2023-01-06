package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Area {

	public Area() {
		super();
		System.out.println("Created Aera by Spring..");
	}

	@Override
	public String toString() {
		return "Area [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
