package com.xworkz.medicalshopapp;

import com.xworkz.medicalshopapp.medical.MedicalShop;

public class MedicalShopTester {

	public static void main(String[] args) {
		/*String staffNames[] = new String [5];----> Parameterized constructor = initialize the values only once
		staffNames[0] = "Muskan";
		staffNames[1] = "Shreeni";
		staffNames[2] = "Poojii";
		staffNames[3] = "Ashii";
		staffNames[4] = "Saru";
	
	long staffContactNo[] = new long [5];
		staffContactNo[0] = 9658126841L;
		staffContactNo[1] = 8963257874L;
		staffContactNo[2] = 7452188841L;
		staffContactNo[3] = 9369521221L;
		staffContactNo[4] = 6325842551L;
		
	String medicineNames[] = new String [5];
		medicineNames[0] = "Paracetamol";
		medicineNames[1] = "Dolo-650";
		medicineNames[2] = "Cipla";
		medicineNames[3] = "Amox";
		medicineNames[4] = "Citrizen";
		
	String cosmetics[] = new String [3];
		cosmetics[0] = "Nivea";
		cosmetics[1] = "Vaseline";
		cosmetics[2] = "Dove";
		
	String billingMethod[] = new String [3];
		billingMethod[0] = "Credid card";
		billingMethod[1] = "Debit card";
		billingMethod[2] = "Cash";
	
		MedicalShop med = new MedicalShop("ASDSJ564641345454","Rajajinagar","Annakarmel medical",staffNames,staffContactNo,medicineNames,cosmetics,4,billingMethod);*/
		
		MedicalShop med = new MedicalShop();//--> default constructor = initialize the values more than once.
		
		med.gstNo = "ASDEF574823";
		med.address = "Rajajinagar";
		med.name = "Annakarmel Medical Shop";
		med.noOfSections = 3;
		
		med.staffNames = new String[5];
		med.staffNames[0] = "Muskan";
		med.staffNames[1] = "Shreeni";
		med.staffNames[2] = "Poojii";
		med.staffNames[3] = "Ashii";
		med.staffNames[4] = "Saru";
		
		med.staffContactNo = new long[5];		
		med.staffContactNo[0] = 963258741;
		med.staffContactNo[1] = 963963258;
		med.staffContactNo[2] = 852147963;
		med.staffContactNo[3] = 698521472;
		med.staffContactNo[4] = 741258963;
		
		med.medicineNames = new String[5];
		med.medicineNames[0] = "Paracetamol";
		med.medicineNames[1] = "Dolo-650";
		med.medicineNames[2] = "Cipla";
		med.medicineNames[3] = "Amox";
		med.medicineNames[4] = "Citrizen";
		
		med.cosmetics = new String [3];
		med.cosmetics[0] = "Nivea";
		med.cosmetics[1] = "Vaseline";
		med.cosmetics[2] = "Dove";
		
		med.billingMethod = new String [3];
		med.billingMethod[0] = "Credid card";
		med.billingMethod[1] = "Debit card";
		med.billingMethod[2] = "Cash";
		
	    med.displayInfo();
			
	}

}
