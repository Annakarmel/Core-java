package com.xworkz.springReference.boot.movie.cameraMan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {

	@Autowired
	private Capacity capacity;

	
	public Battery() {
		System.out.println("Created Battery by no-arg constructor..");
	}
	
	public void checkCapRef() {
		System.out.println(this.capacity.hashCode() + " hashcode of Capacity reference");
	}
	
	
}
