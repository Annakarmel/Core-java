package com.xworkz.springReference.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PolyMath {

	@Autowired
	private Colonel colonel;
	
	public PolyMath() {
		System.out.println("Created Polymath by no-arg constructor..");
	}
	
	public void checkPropertyRef() {
		System.out.println(this.colonel.hashCode() + "hashcode of reference");
	}
	
}
