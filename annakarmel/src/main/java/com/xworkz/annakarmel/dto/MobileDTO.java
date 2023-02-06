package com.xworkz.annakarmel.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MobileDTO {

	public String mobileName;
	public String color;
	public String version;
	public int rom;
	public int ram;
	
	public MobileDTO() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
}
