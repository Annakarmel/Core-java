package com.xworkz.annakarmel.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EducationDTO {

	public String firstName;
	public String lastName;
	public int phNo;
	public String address;
	public String place;
	public String collegeName;
	public String stream;
	public String schoolName;
	public double cgpa;
	public int rank;
	
	private void EducationDTO() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
}
