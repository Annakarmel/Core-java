package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")

public class SnakeConfiguration {

	public SnakeConfiguration() {
		System.out.println("Created SnakeConfiguration");
	}

	@Bean
	public String snakeName() {
		System.out.println("Registering snakeName");
		return "Cobra";
	}

	@Bean
	public double snakeLength() {
		System.out.println("Registering snakeLength");
		return 10.50;
	}

	@Bean
	public String snakeColor() {
		System.out.println("Registering snakeColor");
		return "Green";
	}

	@Bean
	public String snakeType() {
		System.out.println("Registering snakeType");
		return "King Cobra";
	}

	@Bean
	public boolean snakeIsPoisonous() {
		System.out.println("Registering snakeIsPoisonous");
		return true;
	}
}
