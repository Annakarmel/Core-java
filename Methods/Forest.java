class Forest{

	public static void main(String anu[]){
	
	String forestName = "Amazon";
	String forestTotalArea = "6.7 million km^2";
	String forestType = "Moist tropical forest";
	String forestRegion = "Brazil";
	
	String primaryAnimals[] = {"Jaguar","Green Anaconda","Sloths","Golden lion tamarin","Capybara"};
	String forestFeatures[] = {forestName,forestTotalArea,forestType,forestRegion};
	
	String ref0 = forestFeatures[0];
	String ref1 = forestFeatures[1];
	String ref2 = forestFeatures[2];
	String ref3 = forestFeatures[3];
	//String ref4 = primaryAnimals[4];
	
	System.out.println("Forest name: " +ref0);
	System.out.println("Forest total area: " +ref1);
	System.out.println("Forest type: " +ref2);
	System.out.println("Forest region: " +ref3);
	//System.out.println("index 3: " +ref4);
	
	for(int z = 0; z < primaryAnimals.length; z++){
	System.out.println("Animals: " + primaryAnimals[z]+" ");
	}
		
	}
}