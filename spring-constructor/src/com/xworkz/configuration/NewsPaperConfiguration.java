package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class NewsPaperConfiguration {

	public NewsPaperConfiguration() {
		System.out.println("Created NewsPaperConfiguration");
	}

	@Bean
	public int newsPaperId() {
		System.out.println("Registering newsPaperId");
		return 123;
	}

	@Bean
	public String newsPaperName() {
		System.out.println("Registering newsPaperName");
		return "Vijayavaani";
	}

	@Bean
	public String newsPaperOwnerName() {
		System.out.println("Registering newsPaperOwnerName");
		return "Vijay sankeshwar";
	}

	@Bean
	public String newsPaperLanguage() {
		System.out.println("Registering newsPaperLanguage");
		return "Kannada";
	}

	@Bean
	public double newsPaperPrice() {
		System.out.println("Registering newsPaperPrice");
		return 4.50;
	}
}
