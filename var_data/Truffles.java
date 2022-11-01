class Truffles{
   
   public static void main(String anu[]){

    String type = "Fast food restaurant";
    String address = "Commercial Street"; 
    String[] managerNames = {"Laxmi","Kavi","Manjii","Snehi","Pondi"};
    int noOfManagers = 5;
    String foodMenu[] = {"Margarita","Cafe Mocha","Thai Basil Mashroom","Paneer Tikka","Irish hot chocolate",
						 "Watermelon Mojitos","Pasta", "Sun Dried tomato", "Hot Potch","Choco mousse","Apple Pie",
						 "Lemon Tart","Red velvet","Marshmellows"};


	System.out.println("\nWelcome to Truffles");
	System.out.println("\nNumber of Managers: " +noOfManagers);
	System.out.println("\nlist of Managers: ");
	for(int c = 0 ; c < managerNames.length ; c++){
     System.out.println(managerNames[c] + " ");
     }

	System.out.println("*****Menu*****");

    for(int v = 0 ; v < foodMenu.length ; v++){
    System.out.println(foodMenu[v] + " ");
    }
  }
}

