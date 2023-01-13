package com.xworkz.springBean.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bun {
	
	private String bakeryName;
	private double price;
	
	public Bun() {
		System.out.println("Created bun by spring...");
	}

	public String getBakeryName() {
		return bakeryName;
	}

	@Value("Preeti")
	public void setBakeryName(String bakeryName) {
		this.bakeryName = bakeryName;
	}

	public double getPrice() {
		return price;
	}

	@Value("50")
	public void setPrice(double price) {
		this.price = price;
	}
		

}

