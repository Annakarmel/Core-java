package com.xworkz.springFramework.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springFramework.bean.PetrolBunk;
import com.xworkz.springFramework.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext contains = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(contains.getBeanDefinitionNames()));
		
		PetrolBunk ref =contains.getBean(PetrolBunk.class);
		ref.purchase();
		
	}
}
