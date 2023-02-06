package com.xworkz.annakarmel.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class FamilyDTO {

	public String homeName;
	public String fatherName;
	public String motherName;
	public String grandFather;
	public String grandMother;
	public String address;
	public String brotherName;
	public String sisterName;
	public int noOfsiblings;
	public String nativePlace;
	
	public FamilyDTO() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
}
