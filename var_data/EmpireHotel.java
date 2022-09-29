class EmpireHotel{

	public static void main(String anu[]){
	
	String type = "4 Star hotel";
	String address = "Shivaji Nagar";
	String managerNames[] = {"Mahananda","Sneha","Priyanka","Pooja","Swati"};
	int noOfManagers = 5;
	String foodMenu[] = {"Chilly chicken","Egg Masala","Pindi Chole","Babycorn Masala","Tomato Fry",
						 "Aloo jeera","Ghee rice", "Lemon rice", "Kerala parota","Coin parota",
						 "Dry parota","Tandoori Roti","Veg noodles","Prawn fried rice","Ice cream"};
						 
	System.out.println("Welcome to Empire Hotel");
	System.out.println("\nType of the hotel: " + type);
	System.out.println("\nAddress of the hotel is: " + address);
	System.out.println("\nName of the Managers:");
	
	for(int z = 0; z < managerNames.length; z++){
	System.out.println(managerNames[z]);
	}
	System.out.println("\nNo. of Managers: " + noOfManagers);

	System.out.println("*****Menu*****");

	for(int z = 0; z < foodMenu.length; z++){
	System.out.println(foodMenu[z]);
	}
}
}
