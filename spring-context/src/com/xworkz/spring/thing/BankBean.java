package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class BankBean {

	public void transaction() {
		System.out.println("Created Bank by spring..");
	}
}
