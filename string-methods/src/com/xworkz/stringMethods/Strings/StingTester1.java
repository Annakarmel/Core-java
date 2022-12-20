package com.xworkz.stringMethods.Strings;

import com.xworkz.stringMethods.beach.Beach;

public class StingTester1 {

	public static void main(String[] args) {
		
		String str = "Raja nanna Raja";
		System.out.println(str.toString());
		
		Beach beach = new Beach();
		beach.setName("MalpE beach");
		beach.setId(1);
		
		Beach beach1 = new Beach();
		beach1.setName("Malpe beach");
		beach1.setId(2);
		
		System.out.println(beach.toString());
		
		System.out.println(beach == beach1);
		System.out.println(beach.equals(beach1));
		
		System.out.println(beach.hashCode());//hashCode: unique number that is given to each and every object or JVM.
		System.out.println(beach1.hashCode());

	}
}
