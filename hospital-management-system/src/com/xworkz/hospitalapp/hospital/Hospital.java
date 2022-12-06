package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class Hospital {

	public Patient patient;
	public boolean isEmergency;
	public boolean isTreatmentRequired;
	
	public boolean admit(Patient patient) {
		boolean isAdmitted = false;
		
		if(isTreatmentRequired == true) {
		if(isEmergency == true) {
			this.patient= patient;
			this.patient.displayInfo();
			System.out.println("Patient can be allowed to ICU!!!!!!!");
		}
		else {
			System.out.println("Add the patient in general ward");
			}
		isAdmitted = true;
		}
		else {
			System.out.println("No traetment manig hogi aram irrii..");
		}
		return isAdmitted;
}
}
