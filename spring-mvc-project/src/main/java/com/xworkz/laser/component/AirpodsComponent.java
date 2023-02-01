package com.xworkz.laser.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/ghost")
public class AirpodsComponent {
	
	public AirpodsComponent() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String onTest() {
		System.out.println("running onTest....");
		return "index.jsp";
	}

}
