package com.xworkz.springReference.boot.movie.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {

	@Autowired
	private Area area;
	
	public Location() {
		System.out.println("Created Location by no-arg constructor..");
	}
	
	public void checkAreaRef() {
		System.out.println(this.area.hashCode() + "hashcode of area refernce");
	}
}
