class Beaches{
		
		//static String beachNames[] = {"Marina",null,null,null,null};

		static String beachNames[] = {null,null,null,null,null};		
		static int index ;
		
		// createBeach , storeBeachNames , saveBeach
		public static boolean addBeachNames(String beachName){
			System.out.println("inside addBeachNames ");
			//beachNames[0] = "Marina";
			//if(beachNames.length >= 5)
			if(beachNames.length >= 5 && beachName != null && beachName != "") //--> Negative scenario
			{
				beachNames[index] = beachName;
				index++;
				return true;
				}
			 
			else{				
				System.out.println("Cannot add the beach names");
				}
				System.out.println("end addBeachNames");
				return false;
			}
		
		//Read Operation
		public static void getBeachNames(/*boolean value*/){
		//if(value == true){
		for(int index= 0 ; index < beachNames.length ; index++){
			String ref =      beachNames[index];
		System.out.println("Beach name is " + ref);
		  //}
		}
		/*else if(value == false){
		System.out.println("No beach names available");
		}*/
		}
		
		public static void findBeachNames(String beach[]){
		System.out.println("inside  findBeachname");
		for(int index= 0 ; index < beachNames.length ; index++){
		//if(beachName != null && beachNames[index] == beachName){
			String ref = beachNames[index];
			System.out.println("Beach name is " + ref);
			}

		}

}