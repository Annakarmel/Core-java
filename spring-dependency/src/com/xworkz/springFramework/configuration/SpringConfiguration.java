package com.xworkz.springFramework.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.springFramework")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Created SpringConfiguration using no-arg constructor..");
		
	}
}
