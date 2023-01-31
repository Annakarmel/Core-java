package com.xworkz.laser.component;

import org.springframework.stereotype.Component;

@Component
public class AirpodsComponent {

	public AirpodsComponent() {
		System.out.println("Created " +this.getClass().getSimpleName());
	}
}
