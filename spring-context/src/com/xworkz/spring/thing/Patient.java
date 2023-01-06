package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Patient {

	public Patient() {
		super();
		System.out.println("Created Patient by Spring..");
	}

	@Override
	public String toString() {
		return "Patient [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
