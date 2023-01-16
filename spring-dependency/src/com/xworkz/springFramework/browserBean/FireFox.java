package com.xworkz.springFramework.browserBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireFox implements Browser {
	
	@Autowired
	@Qualifier("jio")
	private Provider provider;
	
	public FireFox() {
		System.out.println("Created FireFox using no-arg constructor..");
	}

	@Override
	public void browse() {
		System.out.println("Running browser in FireFox..");
		provider.connect();
	}

}
