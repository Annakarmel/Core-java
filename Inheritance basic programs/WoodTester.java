package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.wood.Table;
import com.xworkz.inheritanceapp.wood.Wood;

public class WoodTester {

public static void main(String args[]) {
		
		Wood wd = new Wood();
		wd.toBuild();
			
		Table wd1 = new Table();
		wd1.toMakeFurnitures("Shreegandha Wood");
		System.out.println("Table is made up of " + wd1.type);
				
		
	}
}
