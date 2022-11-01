class Stadiums{

		static String stadiumNames[] = {null, null, null, null, null, null, null, null};
		static int index ;
	   
		public static void addStadiumNames(String stadiumName){
		System.out.println("inside addStadiumNames");
		   
			if(stadiumNames.length <= 8){
				stadiumNames[index] = stadiumName;
				index++;
				}
			 
		    else{
				System.out.println("Exceed the data");
				}
				System.out.println("end addStadiumNames");
			}
	   
        //Read operation
		public static void getStadiumNames(){
		
		for(int index = 0; index < stadiumNames.length; index++){
			String ref = stadiumNames[index];
			System.out.println("Stadium names is " + ref);
			}
		}
}