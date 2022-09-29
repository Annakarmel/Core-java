class Torch{
	
	static String brand ;
	static String color ;
	static double price ;
	static boolean isConnected ;
	
	public static boolean onOrOff(){
	System.out.println("\n Inside method");
	
	
	if(isConnected == false){
				isConnected = true ;
	System.out.println("Torch is turned ON..");
	}
	
	else if(isConnected == true){
	System.out.println("Torch is turned OFF..");
				isConnected = false ;
	}
	
	System.out.println("End of the method");
	return isConnected ;
	}
}