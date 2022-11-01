class AC{

	static String brand ;
	static String color ;
	static double price ;
	static boolean isConnected ;
	
	public static boolean onOrOff(){
	System.out.println("\n Inside method");
	
	
	if(isConnected == false){
				isConnected = true ;
	System.out.println("AC is turned ON..");
	}
	
	else if(isConnected == true){
				isConnected = false ;
	System.out.println("AC is turned OFF..");
	}
	
	System.out.println("End of the method");
	return isConnected ;
	}
}