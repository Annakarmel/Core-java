package com.xworkz.stringMethods.stringMethodDTO;

public class ElectronicDevTester {

public static void main(String args[]) {
		
		ElectronicDev ed =new ElectronicDev();
		ed.setName("laptop");
		ed.setId(12);
		System.out.println(ed);
		
		ElectronicDev ed1 =new ElectronicDev();
		ed1.setName("watch");
		ed1.setId(20);
		System.out.println(ed1);
		
		System.out.println(ed==ed);
		System.out.println(ed==ed1);
		System.out.println(ed.equals(ed1));
		System.out.println(ed.hashCode());
		System.out.println(ed1.hashCode());		
	}

}
