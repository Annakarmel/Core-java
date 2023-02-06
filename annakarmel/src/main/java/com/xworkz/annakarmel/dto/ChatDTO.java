package com.xworkz.annakarmel.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ChatDTO {

	public String name;
	public String type;
	public int price;
	public String quantity;
	public boolean tasty;
	public int ratings;
	public String centreName;
	public String owner;
	public int ownerPhoneNum;
	public int noOfChats;
	public String place;
	public int id;
	
	public ChatDTO() {
		System.out.println("Created "+this.getClass().getSimpleName());

	}
}
