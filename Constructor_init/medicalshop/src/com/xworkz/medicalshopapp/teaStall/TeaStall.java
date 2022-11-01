package com.xworkz.medicalshopapp.teaStall;

public class TeaStall {

	public String name;
	public int teaStallId;
	public String ownerName;
	public String id; 
	
	/*simple instance block in java 
	 {
	 	name = "Someone";
	 	System.out.println("Instance block");
	 	
	 	}*/

	public TeaStall() {
	   System.out.println("tea stall object is created..");
	   }
	//-> constructor to avoid 'this' keyword to conflict bet the parameter and instance variable.
	public TeaStall(int teaStallId, String name, String ownerName){
		//w.r.t id, using this is optional
		this.name = name;
		//w.r.t. name, ownerName, this keyword is to avoid naming conflict b/w the parameter and instance variables been used
		this.ownerName = ownerName;
		this.teaStallId = teaStallId;
		
		//invoking a displayInfo in a constructor using keyword
		this.displayInfo();//--> member can be variable
	    }
	
	public void displayInfo() { 
		//-->Member can be method
		//invoking variables of a current class using keyword
		System.out.println(this.name +" "+ this.ownerName +" "+ this.teaStallId);// to invoke the particular values 
	}
}
