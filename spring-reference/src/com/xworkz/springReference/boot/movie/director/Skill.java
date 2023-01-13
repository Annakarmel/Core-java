package com.xworkz.springReference.boot.movie.director;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Skill {
	
	public Skill() {
		System.out.println("Created Sikll by no-arg constructor..");
	}
	
	@Override
	public int hashCode() {
		return 5;
	}
	
}
