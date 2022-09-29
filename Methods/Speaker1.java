class Speaker1{

	static String brand ;
	static String color ;
	static double price ;
	static boolean isConnected ;
	static int minVolume = 1;
	static int maxVolume  ;
	static int currentVolume ;
	
	// functionality
	public static boolean onOrOff(){
	System.out.println("\ninside onOrOff() ");
	
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
	
	public static void decreaseVolume(){
	System.out.println("inside decrease volume()");
	
	if(isConnected == true){

	if(currentVolume > minVolume){
		currentVolume = 	currentVolume - 5 ;
	System.out.println("The current volume is :" + currentVolume) ;
	}
	else{
		System.out.println("Miniimum volume reached.........");
	}
	}
	else{
		System.out.println("Gube.. 1st Speaker ON madu...");
	}

	System.out.println("end of decrease volume()");
	
	}
	
}