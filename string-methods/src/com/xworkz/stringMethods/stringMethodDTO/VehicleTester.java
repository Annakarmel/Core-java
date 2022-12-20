package com.xworkz.stringMethods.stringMethodDTO;

public class VehicleTester {

	public static void main(String args[]) {
		String str="Anu";
		System.out.println(str.toString());
		
		Vehicle vcl=new Vehicle();
		vcl.setId(1);
		vcl.setName("Metro");
		System.out.println(vcl);
		
		Vehicle vcl1=new Vehicle();
		vcl1.setId(2);
		vcl1.setName("Bus");
		System.out.println(vcl1);
		
        System.out.println(vcl==vcl1);
        System.out.println(vcl==vcl1);
        System.out.println(vcl.equals(vcl1));
        System.out.println(vcl.hashCode());
        System.out.println(vcl1.hashCode());
		
		
	}

}
