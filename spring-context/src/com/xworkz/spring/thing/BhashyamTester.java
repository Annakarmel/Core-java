package com.xworkz.spring.thing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.spring.configuration.SpringConfiguration;

public class BhashyamTester {

	public static void main(String[] args) {
		
		// Representations of Spring
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		BhashaymCircle ref = spring.getBean(BhashaymCircle.class);
		System.out.println(ref);
	}
}
