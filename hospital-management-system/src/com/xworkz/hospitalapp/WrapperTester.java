package com.xworkz.hospitalapp;

import java.util.Scanner;

public class WrapperTester {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		//Character age = scanner.next();--> this is not required
		int age = scanner.nextInt();
		Integer age1 = age;
		System.out.println(age);
		
		/*int age = 89;
		// Boxing : is to convert primitive to Wrapper class
		System.out.println(age);
		Integer age1 = age;
		//UnBoxing : is to convert Wrapper class to primitive.
		System.out.println(age1);//--> this is the Object value
		int age2 = age1;
		System.out.println(age2);
		
		long phoneNo = 9632587412L;		
		Long phoneNo1 = phoneNo;
		long phoneNo2 = phoneNo1;
		
		double price = 10.00;		
		Double price1 =  price; 
		double price2 = price1;
		
		short  id = 1;
		Short id1 = id;
		short id2 = id1;
		
		char ch = 'A';
		Character ch1 = ch;
		char ch2 = ch1;
		
		boolean a = false;
		Boolean a1 = a;
		boolean a2 = a1;
		
		byte b = 1;
		Byte b1 = b;
		byte b2 = b1;
		
		float c = 12.0F;
		Float c1 = c;
		float c2 = c1;*/
	}
}
