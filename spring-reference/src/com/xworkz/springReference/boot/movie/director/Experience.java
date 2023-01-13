package com.xworkz.springReference.boot.movie.director;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {

	@Autowired
	private Skill skill;
	
	public Experience() {
		System.out.println("Created Experience by no-arg constructor..");
	}
	
	public void checkSkillRef() {
		System.out.println(this.skill.hashCode() + " hashcode of skill reference");
	}
	
	
}
