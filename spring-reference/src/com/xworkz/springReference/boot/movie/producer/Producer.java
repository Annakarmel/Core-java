package com.xworkz.springReference.boot.movie.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	@Autowired
	private Assistant assistant;
	
	public Producer() {
		System.out.println("Created Producer by no-arg constructor..");
	}
	
	public void checkAssistantRef() {
		System.out.println(this.assistant.hashCode() + " hashcode of Assistant reference");
	}
	
}
