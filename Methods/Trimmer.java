class Trimmer{

	public static void main(String anu[]){
	
	String color = "Grey";
	String brand = "PHILIPS";
	String working = "trimming";
	String warranty = "1 year";
	int price = 3997;
	
	String totalSettings[] = {"On","Off"};
	String trimmerFeatures [] = {color,brand,working,warranty};
	
	String ref0 = trimmerFeatures[0];
	String ref1 = trimmerFeatures[1];
	String ref2 = trimmerFeatures[2];
	String ref3 = trimmerFeatures[3];
	
	
	
	System.out.println("Trimmer color: " +ref0);
	System.out.println("Trimmer brand: " +ref1);
	System.out.println("Trimmer working: " +ref2);
	System.out.println("Trimmer warranty: " +ref3);
	System.out.println("Trimmer price: " +price);
	
	
	for(int a = 0; a < totalSettings.length; a++){
	System.out.println("\nTotal settings:" +totalSettings[a]+" ");
	}
	
	}


}