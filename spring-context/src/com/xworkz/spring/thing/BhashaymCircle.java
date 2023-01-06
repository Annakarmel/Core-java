package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class BhashaymCircle extends Object {

	public BhashaymCircle() {
		super();
		System.out.println("Created Bhashaym circle by Spring..");
	}

	@Override
	public String toString() {
		return "BhashaymCircle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
