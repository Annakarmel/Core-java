class Toarch
{
	static String brand;
	static String color;
	static double price;
	static boolean isStarted;
	
	public static boolean onOrOff()
	{
		System.out.println("inside onOrOff()");
		if(isStarted == false)
		{
			isStarted = true;
			System.out.println("Toarch is on..");
		}
		else if(isStarted == true)
		{
			isStarted = false;
		System.out.println("inside onOrOff()");
		}
		System.out.println("end of onOrOff  ");
		return isStarted;
	}
}