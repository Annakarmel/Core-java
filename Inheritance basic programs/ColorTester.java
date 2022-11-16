package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.color.Red;

public class ColorTester {
public static void main(String args[]) {
		
		Red clr1 = new Red();
		clr1.toMakeColorfull("Teddy bears");
		System.out.println("Red color is used for" + clr1.colour);
	}
}
