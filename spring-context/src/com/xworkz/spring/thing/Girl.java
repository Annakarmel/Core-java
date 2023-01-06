package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Girl {

	public Girl() {
		super();
		System.out.println("Created Girl by Spring..");
	}

	@Override
	public String toString() {
		return "Girl [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
