package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitals extends Hospital{

	//one to many
	public Patient[] patients;// has a relationship
	int index;
	
	public Patient[] newPatients;
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
	
	public boolean updatePatientAddressByName(String name , String newPatientAddress) {
		boolean isUpdated = false;
		System.out.println("Inside updatePatientAddressByName");
		System.out.println("No of parameters : 2 : 1) param patientName(String) 2) param address(String)");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getPatientName().equals(name)) {
				System.out.println("Patient name is matched... proceed with updating the address");
				patients[i].setAddress(newPatientAddress);
				isUpdated = true;
			}
		}
		return isUpdated;
	}
	
	public boolean updatePatientNameByAddress(String address, String newPatientName) {
		boolean isUpdated1 = false;
		System.out.println("Inside updatePatientNameByAddress");
		System.out.println("No of parameters : 2 : 1) param address(String) 2) param patientName(String)\"");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getAddress().equals(address)) {
				System.out.println("Patient address is matched.. proceed with updating the name");
				patients[i].setPatientName(newPatientName);
				isUpdated1 = true;
			}
		}
		
		return isUpdated1;
	}
	
	public boolean updatePatientAgeByName(String name, int newAge) {
		boolean isUpdated2 = false;
		System.out.println("Inside updatePatientAgeByName");
		System.out.println("No of parameters : 2 : 1) param patientName(String) 2) param age(int)\"");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getPatientName().equals(name)) {
				System.out.println("Patient name is matched.. proceed with updating the age");
				patients[i].setAge(newAge);
				isUpdated2 = true;
			}
		}
		return isUpdated2;	
	}
	
	public boolean deletePatientByName(String name) {
		boolean isDeleted = false;
		newPatients = new Patient[patients.length-1];
		for (int i = 0 , k = 0; i < patients.length; i++) {
			if(!patients[i].getPatientName().equals(name)) {
				newPatients[k++] = patients[i];
				isDeleted = true;
			}
		}
		return isDeleted;
	}
	
	public boolean deletePatientByAddress(String address) {
		boolean isDeleted = false;
		newPatients = new Patient[patients.length-1];
		for (int i = 0 , k = 0; i < patients.length; i++) {
			if(!patients[i].getAddress().equals(address)) {
				newPatients[k++] = patients[i];
				isDeleted = true;
			}
		}
		return isDeleted;	
	}
	
	public boolean deletePatientByAge(int age) {
		boolean isDeleted = false;
		newPatients = new Patient[patients.length-1];
		for (int i = 0 , k = 0; i < patients.length; i++) {
			if(!patients[i].getAge().equals(age)) {
				newPatients[k++] = patients[i];
				isDeleted = true;
			}
		}
		return isDeleted;	
	}
	
	public boolean deletePatientByGender(Gender gender) {
		boolean isDeleted = false;
		newPatients = new Patient[patients.length-1];
		for (int i = 0 , k = 0; i < patients.length; i++) {
			if(!patients[i].getGender().equals(gender)) {
				newPatients[k++] = patients[i];
				isDeleted = true;
			}
		}
		return isDeleted;	
	}
	
	public void getAllNewPatients() {
		System.out.println("Lists of patients are: ");
		for (int i = 0; i < newPatients.length; i++) {
			System.out.println(newPatients[i].getPatientName()+" "+ newPatients[i].getAddress()+" "+ newPatients[i].getAge()+" "+ newPatients[i].getGender());
		}
	}

}
