package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.comedian.Comedian;

public class ComedianTester {
public static void main(String args[]) {
		
        Comedian cmdy = new Comedian();
		cmdy.toLough("Jocker");
		System.out.println(" Comedian is also called "  + cmdy.anotherName);
	}
}
