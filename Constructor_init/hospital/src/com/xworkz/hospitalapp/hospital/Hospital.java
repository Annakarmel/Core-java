package com.xworkz.hospitalapp.hospital;

public class Hospital {
	// Datatype variableName[] = {value};--> old one
	//String patientNames[] = {null , null , null , null , null , null, null, null, null}
	
	//Datatype variableName[] = new Datatype[size];--> new one
	String patientNames[] = new String[6];
	int index ;
	
	public Hospital() {
		System.out.println("Hopital object is...");
	}
	public boolean savePatientNames(String patientName) {
		System.out.println("inside savePatientNames");
		if(patientName != null && patientNames.length > index) {
			// patientNames[0] = "";
			patientNames[index++]	= patientName ;
			return true;
		}
		else {
			System.out.println("Patientname is full.. Bed illa");
		}
		System.out.println("End savePatientNames");
		return false;
	}
	
	public void getPatientNames() {
		System.out.println("List of all the patientnmaes");
		for(int i = 0; i < patientNames.length; i++) {
			System.out.println(patientNames[i]+ " ");
		}
	}
	
	//oldPatientName = "Dasappa";
	//newPatientName = "Mallavva";
	public boolean updatePatientNames(String oldPatientName , String newPatientName) {
		System.out.println("Inside updatePatientNames");
		for (int i = 0; i < patientNames.length; i++) {
			if(patientNames[i] == oldPatientName) {
				patientNames[i] = newPatientName;
				return true ;
			}
			else {
				System.out.println("I can't update the names");
			}
		}
	return false ;
	}
}
