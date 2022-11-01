class TouristPlaces{

		static String placeNames[] = {null, null, null, null, null, null, null};
		static int index ;
	   
		public static void addPlaceNames(String placeName){
		System.out.println("inside addPlaceNames");
		   
			if(placeNames.length <= 7){
			   placeNames[index] = placeName;
			   index++;
				}
			 
		    else{
				System.out.println("Exceed the data");
				}
				System.out.println("end addPlaceNames");
			}
	   
        //Read operation
		public static void getPlaceNames(){
		
		for(int index = 0; index < placeNames.length; index++){
			String ref = placeNames[index];
			System.out.println("Place names is " + ref);
			}
		}

}