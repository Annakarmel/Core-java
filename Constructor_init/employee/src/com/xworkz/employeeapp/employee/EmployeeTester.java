package com.xworkz.employeeapp.employee;

public class EmployeeTester {
	public static void main(String a[]) {
		Employee.companyName = "Amazon";
		
		Employee emp = new Employee("AWS123", "Annakarmel" , "A+");
		System.out.println(Employee.companyName);
		System.out.println(emp.employeeId+" "+emp.employeeName+" "+emp.bloodGroup);
		
		Employee emp1 = new Employee("AWX526", "Muskan" , "AB+");
		System.out.println(Employee.companyName);
		System.out.println(emp1.employeeId+" "+emp1.employeeName+" "+emp1.bloodGroup);
		
		Employee emp2 = new Employee("ASW125", "Shreeni" , "A-");
		System.out.println(Employee.companyName);
		System.out.println(emp2.employeeId+" "+emp2.employeeName+" "+emp2.bloodGroup);
	}

}
