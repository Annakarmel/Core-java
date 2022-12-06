package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitals extends Hospital{

	//one to many
	public Patient[] patients;// has a relationship
	int index;
	
	
	public ApolloHospitals(int size) {
		patients = new Patient[size]; // to avoid the runtime 
	}
	
	public boolean addPatient(Patient patient) {
		System.out.println("Inside addPatient method ");
		 boolean isPatientAdded = false;
		 if(patient != null) {
			 System.out.println("Patient's details are right.... go ahead");
			 patients[index++] = patient ;
			 	isPatientAdded = true;
			 //index++;
		 }
		 return isPatientAdded;
	}
	
	public void getAllPAtients() {
		System.out.println("Lists of patients are: ");
		for(int i = 0; i < patients.length; i++) {
			System.out.println(patients[i].getPatientName()+" "+ patients[i].getAddress()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
		}
		
	}
	public void getPatientByName(String patientName) {
		System.out.println("Inside getPatientByName");
		System.out.println("No of parameters : 1 : patientName(String)");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getPatientName().equals(patientName)) {
				System.out.println(patients[i].getPatientName()+" "+ patients[i].getAddress()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
			}else {
				System.out.println("No patient found in this lists");
			}
		}
	}
	
	public void getPatientByAge(int age) {
		System.out.println("Inside getPatientByAge");
		System.out.println("No of parameters : 1 : age(int)");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getAge().equals(age)) {
				System.out.println(patients[i].getPatientName()+" "+ patients[i].getAddress()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
			}else {
				System.out.println("No patient found in this lists");
			}
		}
	}
	
	public void getPatientByGender(Gender gender) {
		System.out.println("Inside getPatientByGender");
		System.out.println("No of parameters : 1 : gender(Gender)");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getGender().equals(gender)) {
				System.out.println(patients[i].getPatientName()+" "+ patients[i].getAddress()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
			}else {
				System.out.println("No patient found in this lists");
			}
		}
	}
	
	public void getPatientByAddress(String address) {
		System.out.println("Inside getPatientByAddress");
		System.out.println("No of parameters : 1 : address(String)");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getAddress().equals(address)) {
				System.out.println(patients[i].getPatientName()+" "+ patients[i].getAddress()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
			}else {
				System.out.println("No patient found in this lists");
			}
		}
	}
	
	public void getPatientNameByGender(Gender gender) {
		System.out.println("Inside getPatientNameByGender");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getGender().equals(gender)) {
				System.out.println(patients[i].getPatientName());
			}else {
				System.out.println("No patient found");
			}
		}
	}
	
	public void getGenderByPatientName(String patientName) {
		System.out.println("Inside getGenderByPatientName");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getPatientName().equals(patientName)) {
				System.out.println(patients[i].getGender());
			}else {
				System.out.println("No patient found");
			}
		}
	}

}
