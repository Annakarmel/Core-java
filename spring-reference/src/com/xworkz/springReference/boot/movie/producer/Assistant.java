package com.xworkz.springReference.boot.movie.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Assistant {

	@Autowired
	private Company comapny;
	
	public Assistant() {
		System.out.println("Created Assistant by no-arg constructor..");
	}
	
	public void checkCompanyRef() {
		System.out.println(this.comapny.hashCode() + " hashcode of Company reference");
	}

}
