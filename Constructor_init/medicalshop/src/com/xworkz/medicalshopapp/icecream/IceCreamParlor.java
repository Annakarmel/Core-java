package com.xworkz.medicalshopapp.icecream;

public class IceCreamParlor {
	
	public String brand[];
	public String type[];
	public String flavor[];
	//public double price[];
	public String billingMethod[];
	
	/*public IceCreamParlor(String brand[], String type[], String flavor[], String billingMethod[]) {
		this.brand = brand;
		this.type = type;
		this.flavor = flavor;
		//this.price = price;
		this.billingMethod = billingMethod;
	}*/
	
	public void icecreamInfo() {
		System.out.println("Ice cream brand is..");
		for (int i = 0; i < brand.length; i++) {
			System.out.println(brand[i]);
		}
		System.out.println("--------------------");
		System.out.println("Ice cream type is..");
		for (int i = 0; i < type.length; i++) {
			System.out.println(type[i]);
		}
		System.out.println("--------------------");
		System.out.println("Ice cream flavor is..");
		for (int i = 0; i < flavor.length; i++) {
			System.out.println(flavor[i]);
		
		}
		/*System.out.println("--------------------");
		System.out.println("Ice cream price is..");
		for (int i = 0; i < price.length; i++) {
			System.out.println(price[i]);
		}*/
		System.out.println("--------------------");
		System.out.println("Ice cream billingMethod is..");
		for (int i = 0; i < billingMethod.length; i++) {
			System.out.println(billingMethod[i]);
		}
	}


}
