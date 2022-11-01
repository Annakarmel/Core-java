class SpeakerTester
{
	public static void main(String speaker[])
	{
	System.out.println("Main method is staretd...");
	Speaker.brand = "renvolt";
	Speaker.color = "orange";
	Speaker.price = 1000;
	//invoking onoroff with zero argumrnt
	Speaker.onOrOff();
	Speaker.increaseVolume();
	Speaker.increaseVolume();
	Speaker.decreaseVolume();
	Speaker.increaseVolume();
	Speaker.increaseVolume();
	Speaker.decreaseVolume();
	Speaker.increaseVolume();
	Speaker.onOrOff();
	Speaker.decreaseVolume();
	Speaker.decreaseVolume();
	Speaker.onOrOff();

	System.out.println("Main method is ended");
	}
}