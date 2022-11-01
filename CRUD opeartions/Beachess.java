class Beachess{
  // static String beachNames[]={"Marina","Baga",null,null,null};
  
        static String beachNames[]={null,null,null,null,null};
		
		static int index ; 
		
		// saveBeach , storeBeachNames
		//beachName =  "Marina"
		// Create / save / add 
	  public static boolean addBeachNames(String beachName){
		  System.out.println("inside addBeachNames");
		//   beachNames[0]  ="Marina";
		//   beachNames[1] = "Malpe";
		//   beachNames[2]  = "Baga" ; 
		  
		if(beachNames.length > index && beachName != null){
		   beachNames[index] =  beachName ; 
			   index++ ;
			   return true  ; 
	      }
		  else {
			  System.out.println("Cannot add Beach Names as the size exceeds the array");
		  }
			  System.out.println("end of addBeachNames"); 
			   return false ; 
	  }
		
		// Read Operation
		public static void getBeachNames(){
	//x
		for(int index= 0 ; index < beachNames.length ; index++){
		      String ref=     beachNames[index]; 
        System.out.println("Beach Name is "+ ref);			  
		}
	
		}
		 public static void  findBeachName(String beachName)
			{
				  System.out.println("inside findBeachName ");
				  for(int index= 0 ; index < beachNames.length ; index++){
               
                  // "Baga" != null  &&     "Baga" == "Baga" 
			   if(beachName != null &&  beachNames[index] == beachName){
	              String ref=   beachNames[index]  ; 
              System.out.println("Beach Name is "+ ref);
				}
				else {
				System.out.println("No Beach name found... mundhe hogi");
				}
			 
				  }
               }
			 
			  
			  // newBeachName = "Paradise"
			  // oldBeachName  = "Marina"
			  public static boolean updateBeachName(String newBeachName, String oldBeachName){
				  System.out.println("updateBeach method started");
				if(newBeachName != null && oldBeachName != null){
				for(int index = 0 ; index < beachNames.length ; index++ ){
					 // beachNames[0] = "Marina"
					 // "Marina" == "Marina"
					 //oldBeachName  = "Marina"
					if( beachNames[index] ==  oldBeachName)	{
			System.out.println("Old Beach Name is"+beachNames[index]);
						  beachNames[index]  =     newBeachName ; 
		  System.out.println("New  Beach Name is"+beachNames[index]);
						  return true ; 
					}
				}
				}				
				  return false ; 
			  }
			  
}


/*
To join the video meeting, click this link: https://meet.google.com/bub-ukbd-obf
Otherwise, to join by phone, dial +1 904-438-3236 and enter this PIN: 614 964 876#
To view more phone numbers, click this link: https://tel.meet/bub-ukbd-obf?hs=5  */