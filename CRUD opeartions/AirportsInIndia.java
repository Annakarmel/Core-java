class AirportsInIndia{

       static String airportNames[] = {null, null, null, null, null, null, null};
	   static int index ;
	   
	   public static void addAirportNames(String airportName){		   
		   System.out.println("inside addAirportNames");
			 
		       airportNames[index] = airportName;		       
			   index ++;			   
			   System.out.println("end addAirportNames");
			 }
	   
        //Read operation
	   
       public static void getAirportNames(){
		
	   for(int index = 0; index < airportNames.length; index++){
	   String ref = airportNames[index];
	   System.out.println("Air port name is " + ref);
		
		}
		
		
	}

}