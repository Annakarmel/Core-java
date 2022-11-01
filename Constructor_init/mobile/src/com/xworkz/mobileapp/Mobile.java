package com.xworkz.mobileapp;

public class Mobile {
	static String brand ;
	static String color ;
	static double price ;
	static boolean isConnected ;
	
	public static boolean onOrOff(){
	System.out.println("Inside method");
	
	
	if(isConnected == false){
				isConnected = true ;
	System.out.println("Mobile is turned ON..");
	}
	
	else if(isConnected == true){
				isConnected = false ;
	System.out.println("Mobile is turned OFF..");
	}
	
	System.out.println("End of the method");
	return isConnected ;
	}


}
