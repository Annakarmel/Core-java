package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Mall {

	public Mall() {
		super();
		System.out.println("Created Mall by Spring..");
	}

	@Override
	public String toString() {
		return "Mall [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
