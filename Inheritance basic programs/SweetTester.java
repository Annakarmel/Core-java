package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.sweet.Jamoon;
import com.xworkz.inheritanceapp.sweet.Sweet;

public class SweetTester {

public static void main(String args[]) {
		
		Sweet sw = new Sweet();
		sw.toMakeSweets();
		
		Jamoon sw1 = new Jamoon();
		sw1.toMakeRecipe("Jamoon powder");
		System.out.println("Jamoon is made up of" +sw1.ingredient);
	}
}
