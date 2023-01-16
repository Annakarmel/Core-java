package com.xworkz.springFramework.browserBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser {
	
	@Autowired
	@Qualifier("airtel")
	private Provider provider;
	
	public Chrome() {
		System.out.println("Created Chrome using no-arg constructor..");
	}

	@Override
	public void browse() {
		System.out.println("Running browser in Chrome..");
		provider.connect();
	}

}
