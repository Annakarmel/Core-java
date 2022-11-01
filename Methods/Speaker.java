class Speaker{

	static String brand ;
	static String color ;
	static double price ;
	static boolean isConnected ;
	static int minVolume ;
	static int maxVolume = 8 ;
	static int currentVolume ;
	
	// functionality
	public static boolean onOrOff(){
	System.out.println("inside onOrOff() ");
	
	// false == false
	if(isConnected == false){
				isConnected = true ;
	System.out.println("Speaker is turned ON..");
	}
	// true == true
	else if(isConnected == true){
				isConnected = false ;
	System.out.println("Speaker is turned OFF..");
	}
	
	System.out.println("end of onOrOff() ");
	return isConnected ;
	
	}
	
	//increasing the volume
	public static void increaseVolume(){
	System.out.println("inside increase volume()");
	
	if(isConnected == true){

	if(currentVolume < maxVolume){
		currentVolume = 	currentVolume + 1 ;
	System.out.println("The current volume is :" + currentVolume) ;
	}
	else{
		System.out.println("Maximum volume reached.........");
	}
	}
	else{
		System.out.println("Gube.. 1st Speaker ON madu...");
	}
	System.out.println("end of increase volume()");
	
	}
	
	//decreasing the volume
	public static void decreaseVolume(){
	System.out.println("inside decrease volume()");
	
	if(isConnected == true){
	
	if(currentVolume > minVolume){
		currentVolume = 	currentVolume - 1 ;
	System.out.println("The current volume is :" + currentVolume) ;
	}
	else{
		System.out.println("Minimum volume reached.........");
	}
	}
	else{
		System.out.println("Gube.. 1st Speaker ON madu...");
	}
	System.out.println("end of decrease volume()");
	
	}
	
}