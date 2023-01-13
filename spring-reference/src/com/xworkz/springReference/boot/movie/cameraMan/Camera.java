package com.xworkz.springReference.boot.movie.cameraMan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {

	@Autowired
	private Lens lens;
	
	public Camera() {
		System.out.println("Created Camera by no-arg constructor..");
	}
	
	public void checkLensRef() {
		System.out.println(this.lens.hashCode() + " hashcode of Lens reference");
	}
	
	
	
}
