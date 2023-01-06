package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Bus {

	public Bus() {
		super();
		System.out.println("Created Bus by Spring..");
	}

	@Override
	public String toString() {
		return "Bus [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
