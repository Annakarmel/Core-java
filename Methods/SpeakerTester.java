class SpeakerTester{

	public static void main(String anu[]){
	System.out.println("Main method is started...");
	
	/*Speaker.brand = "boAt";
	Speaker.color = "Black";
	Speaker.price = 2500.00;*/ // These methods are not used in class speaker so it is not printed
	
	//Invoking the onOrOff method
	Speaker.onOrOff();
	Speaker.increaseVolume();
	Speaker.increaseVolume();
	Speaker.decreaseVolume();
	Speaker.increaseVolume();
	Speaker.increaseVolume();	
	Speaker.decreaseVolume();	
	Speaker.onOrOff();
	Speaker.increaseVolume();	
	Speaker.decreaseVolume();	

	//Speaker.onOrOff();

	System.out.println("Main method is ended...");


	}

}