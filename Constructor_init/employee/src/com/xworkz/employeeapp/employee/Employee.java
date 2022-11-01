package com.xworkz.employeeapp.employee;

public class Employee {
	//default constructor
	public Employee() {		
	}
	//static public String companyName;
	public String employeeId;
	public String employeeName;
	static public String companyName;
	public String bloodGroup;
	
	public Employee(String empId , String empNm , String bGrp) {
		System.out.println("Employee object is created");
	employeeId = empId;
	employeeName = empNm;
	bloodGroup = bGrp;
	}
	
	public void toHelpOrganization() {
		System.out.println("Nanu Naane");
	}
	
}
