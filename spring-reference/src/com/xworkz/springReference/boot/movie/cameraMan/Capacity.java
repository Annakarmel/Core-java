package com.xworkz.springReference.boot.movie.cameraMan;

import org.springframework.stereotype.Component;

@Component
public class Capacity {

	public Capacity() {
		System.out.println("Created Capacity by non-arg constructor..");
	}
	
	@Override
	public int hashCode() {
		return 22;
	}
}
