package com.xworkz.stringMethods.stringMethodDTO;

public class IceCreamTester {

	public static void main(String args[]) {
		String str="Anu";
		System.out.println(str.toString());
		
		IceCream ic=new IceCream();
		ic.setId(1);
		ic.setName("ChocoBar");
		System.out.println(ic);
		
		IceCream ic1=new IceCream();
		ic1.setId(2);
		ic1.setName("Cone");
		System.out.println(ic1);
		
        System.out.println(ic==ic1);
        System.out.println(ic==ic1);
        System.out.println(ic.equals(ic1));
        System.out.println(ic.hashCode());
        System.out.println(ic1.hashCode());
		
		
	}
}
