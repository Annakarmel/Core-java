package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.powerStar.PowerStar;

public class PowerStarTester {
	
public static void main(String args[]) {
		
        PowerStar star = new PowerStar();
		star.toBePower("Puneeth Rajkumar");
		System.out.println(" Fans worship the power star "  + star.actorName);
	}
}
