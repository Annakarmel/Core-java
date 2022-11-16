package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.park.Park;
import com.xworkz.inheritanceapp.park.Wonderla;

public class ParkTester {
	
	public static void main(String args[]) {
		
		Park pr = new Park();
		pr.toEnjoy(1000);
		System.out.println("The entraince fee.."+pr.ticket);
		
		Wonderla pr1 = new Wonderla();
		pr1.toEnjoy(2000);
		System.out.println("2 members entraince fee.."+pr1.ticket);
	}
}
