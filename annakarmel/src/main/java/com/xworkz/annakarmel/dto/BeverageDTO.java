package com.xworkz.annakarmel.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class BeverageDTO {

	public String name;
	public String flavour;
	public String color;
	public boolean cold;
	public String buyer;
	public int price;
	public String madeBy;
	public boolean taste;
	
	public BeverageDTO() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
}
