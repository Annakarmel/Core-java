package com.xworkz.stringMethods.beach.stack_example;

public class Tester1 {

	public static void main(String[] args) {
		System.out.println("Main method is started");
		
		//1. Creating string object using String literals
		String var = "Radhika"; // Wrapper class
		// Immutability nature of String 
		//var = "Dhanush"; // wrapper class
		
		String var2 = "Dhanush";
		String var1 = new String("Dhanush");
		
		var2 = var1;
		
		System.out.println(var == var2);//compares memory address
		System.out.println(var1.equals(var2));//Compares values of object
		
		//System.out.println(var);
		
		
		
		
		System.out.println("--------------------------------------------");
		String str = new String("null");
		//String str = "Baba";
		//String str1 = new String("Baba");
		String str1 = null;
		
		System.out.println(str1 == str);
		System.out.println(str.equals(str1));
		
		System.out.println("\nChecking.............");
		System.out.println(str.charAt(1));
		System.out.println(str.contains("ull"));
		System.out.println(str.isBlank());
		System.out.println(str.toCharArray());
		//System.out.println(str.join(str1, null));
		
		//char ch[] = {'B' , 'a' , 'b' , 'a'};-> long process
		//String st = new String("null");
		

	}
}
