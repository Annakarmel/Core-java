package com.xworkz.medicalshopapp.medical;

public class MedicalShop {
	public String gstNo;
	public String address;
	public String name;
	public String staffNames[] ;
	public long staffContactNo[] ;
	public String medicineNames[] ;
	public String cosmetics[];
	public int noOfSections ;
	public String billingMethod[] ;
			
	/*public MedicalShop(String gstNo, String address, String name, String staffNames[], long staffContactNo[], String medicineNames[],String cosmetics[], int noOfSections, String billingMethod[]) {
		this.gstNo = gstNo;
		this.address = address;
		this.name = name;
		this.staffNames = staffNames;
		this.staffContactNo = staffContactNo;
		this.medicineNames = medicineNames;
		this.cosmetics = cosmetics;
		this.noOfSections =  noOfSections;
		this.billingMethod = billingMethod;
	}*/
	public MedicalShop() {
		System.out.println("Medical object is created...");
	}
	
	public void displayInfo() {
		System.out.println("Medical shop name is.. "+name);
		System.out.println("--------------------------------");
		System.out.println("Medical shop address is.. "+address);
		System.out.println("-------------------------------- ");
		System.out.println("Medical shop Gst No. is.. "+gstNo);
		System.out.println("--------------------------------");
		System.out.println("Medical Staff info.. ");
		for (int i = 0; i < staffNames.length; i++) {
				System.out.println(staffNames[i]);
			}
		System.out.println("--------------------------------");
		System.out.println("Medical Staff contact info.. ");
		for (int i = 0; i < staffContactNo.length; i++) {
			System.out.println(staffContactNo[i]);
			}
		System.out.println("--------------------------------");
		System.out.println("Medical medicineNames info.. ");
		for (int i = 0; i < medicineNames.length; i++) {
			System.out.println(medicineNames[i]);
			}
		System.out.println("--------------------------------");
		System.out.println("Medical cosmetics info.. ");
		for (int i = 0; i < cosmetics.length; i++) {
			System.out.println(cosmetics[i]);
		}
		System.out.println("--------------------------------");
		System.out.println("Medical No. of sections info.. "+noOfSections);
		
		System.out.println("--------------------------------");
		System.out.println("Medical billing Method info.. ");
		for (int i = 0; i < billingMethod.length; i++) {
			System.out.println(billingMethod[i]);
		}
		

	}

}
