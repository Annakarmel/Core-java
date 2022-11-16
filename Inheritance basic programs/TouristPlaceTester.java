package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.touristPlace.Badami;
import com.xworkz.inheritanceapp.touristPlace.TouristPlace;

public class TouristPlaceTester {

public static void main(String args[]) {
		
		TouristPlace plc = new TouristPlace();
		plc.toSeePlaces("Anjanadri bett");
		System.out.println("Tourist place is" + plc.famousPlace);
		
		Badami bdm = new Badami();
		bdm.toSeePlaces("Mainbasti");
		System.out.println("In Badami the famous place is" + bdm.famousPlace);
		
	}

}

