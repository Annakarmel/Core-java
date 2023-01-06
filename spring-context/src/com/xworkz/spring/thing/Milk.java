package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Milk {

	public Milk() {
		super();
		System.out.println("Created Milk by Spring..");
	}

	@Override
	public String toString() {
		return "Milk [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
