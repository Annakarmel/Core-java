package com.xworkz.springReference.boot.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springReference.boot.movie.director.Director;

@Component
public class Movie {

	@Autowired
	private Director experience;
	
	public Movie() {
		System.out.println("Created Movie by no-arg constructor..");
	}
	
	public void checkDirectorRef() {
		System.out.println(this.experience.hashCode() + " hashcode of Director reference");
	}
	
}
