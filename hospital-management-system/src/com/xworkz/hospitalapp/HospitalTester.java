package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {

	public static void main(String args[]) {
		
		//file handling in java
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the patient name: ");
		String patientName = sc.next();		
		System.out.println("Enter patient address: ");
		String address = sc.next();			
		System.out.println("Patient age: ");
		int age = sc.nextInt();
		
		Patient patient = new Patient(patientName, address, Gender.Female, age);
		Hospital hospital = new Hospital();
		hospital.isTreatmentRequired = true;
		hospital.isEmergency = true;
		boolean isAdmitted = hospital.admit(patient);
		System.out.println("Patient allowed to admit " + isAdmitted);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Patient name: ");
		String patientName1 = sc1.next();
		System.out.println("Enter patient address: ");
		String address1 = sc1.next();
		System.out.println("Enter patient age: ");
		int age1 = sc1.nextInt();
		
		Patient patient1 = new Patient(patientName1, address1, Gender.Male , age1);		
		Hospital hospital1 = new Hospital();
		hospital1.isEmergency = false;
		hospital.isTreatmentRequired = true;
		boolean isAdmitted1 = hospital1.admit(patient1);
		System.out.println("Patient allowed to admit "+isAdmitted1);
		
		sc.close();
		sc1.close();
		
	}
}
