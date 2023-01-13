package com.xworkz.springReference.boot.movie.cameraMan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lens {

	@Autowired
	private Battery battery;
	
	public Lens() {
		System.out.println("Created Lens by no-arg constructor..");
	}
	
	public void checkBatteryRef() {
		System.out.println(this.battery.hashCode() + " hashcode of Battery refernce");
	}
	
	
}
