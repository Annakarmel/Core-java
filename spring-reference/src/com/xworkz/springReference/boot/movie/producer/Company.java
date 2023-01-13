package com.xworkz.springReference.boot.movie.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Autowired
	private Location location;
	
	public Company() {
		System.out.println("Created Company by no-arg constructor..");
	}
	
	public void checkLocationRef() {
		System.out.println(this.location.hashCode() + " hashcode of Location reference");
	}

}
