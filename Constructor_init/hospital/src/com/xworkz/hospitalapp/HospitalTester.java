package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalTester {
	
	public static void main(String a[]) {
		
		Hospital hospital = new Hospital();
		hospital.savePatientNames("Ganesh");
		hospital.savePatientNames("Huchmallya");
		hospital.savePatientNames("Dasappa");
		hospital.savePatientNames("Huchbasya");
		hospital.savePatientNames("Yellamma");
		hospital.savePatientNames("Durgavva");
		//hospital.savePatientNames("Dyamavva");
		
		hospital.getPatientNames();
		
		hospital.updatePatientNames("Dasappa", "Mallavva");
		hospital.getPatientNames();

	}

}
