package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.god.God;

public class GodTester {
	
public static void main(String args[]) {
		
		God god = new God();
		god.toMakeMurti(40);
		System.out.println("Price of the Ganesha murti is " + god.price);
	}
}
