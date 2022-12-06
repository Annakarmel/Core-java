package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Gender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patient {
 
	private String patientName ;
	private String address ;
	private Gender gender ;
	private Integer age; //Wrapper class: Integer is a wrapper class.
	
	public Patient(String patientName,String address, Gender gender, Integer age) {
		//super();
		this.patientName = patientName;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}
	 public Patient() {
		// TODO Auto-generated constructor stub
	}
	public void displayInfo() {
		 System.out.println("Patient Name is: "+ this.patientName);
		 System.out.println("Patient Address is: "+ this.address);
		 System.out.println("Patient Gender is: "+ this.gender);
		 System.out.println("Patient age is: "+ this.age);

	 }
}
