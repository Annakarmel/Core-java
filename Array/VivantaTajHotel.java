class VivantaTajHotel{

	public static void main(String anu[]){
	
	String type = "5 Star Hotel";
	String address = "MG road";
	String[] managerNames = {"Annakarmel","Muksana","Sunnyleon","Shreenidhi","Ashwini"};
	int noOfManagers = 5;
	String foodMenu[] = {"Paneer tikka masala","Kulcha","Jeera rice","Gobi","Masala papad",
						"Chicken biriyani","Chicken fry","Kaju masala","Seera","Ice-cream",
						"Egg fried rice","Manchorean soup","Milk-shake","Naan","Fish fry"};
	
	System.out.println("Welcome to Vivanta Taj Hotel");
	System.out.println("\nType of the hotel: " + type);
	System.out.println("\nAddress of the hotel is: " + address);
	System.out.println("\nName of the Managers:");
	for(int z = 0; z < managerNames.length; z++){
	System.out.println(managerNames[z]);
	}
	System.out.println("\nNo. of Managers: " + noOfManagers);
	
	System.out.println("\nName of the foods: ");
	for(int z = 0; z < foodMenu.length; z++){
	System.out.println(foodMenu[z]);
	}
}
						
}