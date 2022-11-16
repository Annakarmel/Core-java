package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.ECommerce.ECommerce;
import com.xworkz.inheritanceapp.ECommerce.Flipcart;

public class ECommerceTester {
	
public static void main(String args[]) {
		
		ECommerce com = new ECommerce();
		com.toBuyProducts("Mesho");
		System.out.println("One of the famous ecommece website is" + com.product);
		
		Flipcart com1 = new Flipcart();
		com1.toBuyProducts("Dress");
		System.out.println("Famous product in flipcart is"  + com1.product);
		
		
	}
}
