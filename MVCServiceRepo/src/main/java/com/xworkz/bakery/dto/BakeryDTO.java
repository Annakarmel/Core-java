package com.xworkz.bakery.dto;

import lombok.Data;

@Data

public class BakeryDTO {

	public BakeryDTO() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	private String name;
	private String ownerName;
	private String ownerWifeName;
	private boolean married;
	private String famousFor;
	private String since;
	
}
