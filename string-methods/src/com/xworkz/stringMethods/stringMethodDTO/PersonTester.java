package com.xworkz.stringMethods.stringMethodDTO;

public class PersonTester {

	public static void main(String args[]) {
		String str="Anu";
		System.out.println(str.toString());
		
		Person pr=new Person();
		pr.setId(1);
		pr.setName("Pooja");
		System.out.println(pr);
		
		Person pr1=new Person();
		pr1.setId(2);
		pr1.setName("Shrinidhi");
		System.out.println(pr1);
		
        System.out.println(pr==pr);
        System.out.println(pr==pr1);
        System.out.println(pr.equals(pr1));
        System.out.println(pr.hashCode());
        System.out.println(pr1.hashCode());
		
		
	}
}
