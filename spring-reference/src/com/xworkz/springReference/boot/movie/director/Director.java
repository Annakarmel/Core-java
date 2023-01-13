package com.xworkz.springReference.boot.movie.director;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {

	@Autowired
	private Experience experience;
	
	public Director() {
		System.out.println("Created Director by no-arg constructor..");
	}
	
	public void checkExperienceRef() {
		System.out.println(this.experience.hashCode() + " hashcode of Experience reference");
	}
	
}
