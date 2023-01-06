package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class God {

	public God() {
		super();
		System.out.println("Created God by Spring..");
	}

	@Override
	public String toString() {
		return "God [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
