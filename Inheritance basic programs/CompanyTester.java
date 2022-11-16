package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.company.Tcs;

public class CompanyTester {
	
public static void main(String args[]) {
		
		Tcs cmp1 = new Tcs();
		cmp1.toBuildSoftwares(" MNC company");
		System.out.println("Tcs is a" + cmp1.type);
	}
}
