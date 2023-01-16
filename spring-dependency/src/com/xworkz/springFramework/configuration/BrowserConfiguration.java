package com.xworkz.springFramework.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.springFramework")
public class BrowserConfiguration {

	public BrowserConfiguration() {
		System.out.println("Created BrowserConfiguration using no-arg Constructor..");
	}
}
