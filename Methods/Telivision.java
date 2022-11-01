class Telivision{

	static String brand ;
	static String color ;
	static double price ;
	static boolean isConnected ;
	
	public static boolean onOrOff(){
	System.out.println("\n inside on or off");
	
	
	if(isConnected == false){
				isConnected = true ;
	System.out.println("Telivision is turned ON..");
	}
	
	
	else if(isConnected == true){
				isConnected = false ;
	System.out.println("Telivision is turned OFF..");
	}
	
	System.out.println("End of on or off");
	return isConnected ;
	}
}