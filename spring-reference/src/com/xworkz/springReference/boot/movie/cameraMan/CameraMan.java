package com.xworkz.springReference.boot.movie.cameraMan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {

	@Autowired
	private Camera camera;

	public CameraMan() {
		System.out.println("Created cameraMan by no-arg constructor..");
	}
	
	public void checkCameraRef() {
		System.out.println(this.camera.hashCode() + " hashcode of Camera reference");
	}
	
	
}
