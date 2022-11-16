package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.laptop.Hp;
import com.xworkz.inheritanceapp.laptop.Laptop;

public class LaptopTester {
public static void main(String args[]) {
		
		Laptop lp = new Laptop();
		lp.toStoreData("core i3");
		System.out.println("Laptop processor type is" + lp.processorType);
		
		Hp lp1 = new Hp();
		lp1.gamingPurpose(30000);
		System.out.println("Lenovo price is" + lp1.price);
		
	}
}
