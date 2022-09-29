class Speaker{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	static int minVolume = 0;
	static int maxVolume = 8;
	static int currentVolume;;
	//Functonality
	public static boolean onOrOff(){
		System.out.println("inside onOrOff()");
		if(isConnected == false){
			isConnected = true;
			System.out.println("Speaker is on..");
		}
		else if(isConnected == true){
			isConnected = false;
		System.out.println("inside onOrOff()");
		}
		System.out.println("end of onOrOff  ");
		return isConnected;
	}
	public static void increaseVolume(){
	System.out.println("inside increaseVolume()");
	if(isConnected == true){
		if(currentVolume < maxVolume){
			currentVolume = currentVolume +1;
		System.out.println("The current volume is" + currentVolume);
	}
	else {
		System.out.println("Maximum volume reached");
	}
	}
	else {
		System.out.println("Pagal speaker on madu...");
	}
	System.out.println("End of increaseVolume()");
	}
	
	
	
	
	
	
	
	
	public static void decreaseVolume(){
	System.out.println("inside decreaseVolume()");
	if(isConnected == true)
	{
		if(currentVolume > minVolume)
		{
			currentVolume = currentVolume -1;
		     System.out.println("The current volume is" + currentVolume);
		}
	    else{
			System.out.println("Minimum volume reached");
			}
	else  {
			System.out.println("Pagal speaker on madu...");
			}

		System.out.println("End of decreaseVolume()");
	
	}
