package com.xworkz.springBean.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Puff {
	
	private String name;
	private double price;
	private String type;
	
	public Puff(@Value("Pannerpuf") String name, @Value("40") double price, @Value("Veg") String type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getType() {
		return type;
	}

}
