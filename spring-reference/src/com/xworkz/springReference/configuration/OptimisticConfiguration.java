package com.xworkz.springReference.configuration;

import java.util.Collection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springReference.boot", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Collection.class)})
public class OptimisticConfiguration {

	public OptimisticConfiguration() {
		System.out.println("Created OptimisticConfiguration using no-arg constructor..");
	}
}
