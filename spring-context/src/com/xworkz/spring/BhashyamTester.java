package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.BhashaymCircle;

public class BhashyamTester {

	public static void main(String[] args) {
		
		// Representations of Spring
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		BhashaymCircle ref = spring.getBean(BhashaymCircle.class);
		System.out.println(ref);
	}
}
