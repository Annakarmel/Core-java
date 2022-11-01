package com.xworkz.employeeapp.icecream;

public class Icecream {
	public Icecream() {
}
	public String icecreamId;
	public String icecreamName;
	static public String companyName;
	public int icecreamPrice;
	
	public Icecream(String iceId , String iceNm , int icePr) {
		System.out.println("Icrecream object is created");
	icecreamId = iceId;
	icecreamName = iceNm;
	icecreamPrice = icePr;
	}
	
	public void toEnjoyTheDay() {
		System.out.println("Yeah!.. ");
	}
}
