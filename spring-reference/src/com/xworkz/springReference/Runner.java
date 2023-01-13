package com.xworkz.springReference;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springReference.boot.PolyMath;
import com.xworkz.springReference.configuration.OptimisticConfiguration;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(OptimisticConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		PolyMath anu = container.getBean(PolyMath.class);
		anu.checkPropertyRef();
	}
}
