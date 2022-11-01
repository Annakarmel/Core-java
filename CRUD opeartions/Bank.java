class Bank{

		static String bankNames[] = {null, null, null, null, null, null, null};	   
		static int index ;
	   
		public static void addBankNames(String bankName){
		System.out.println("inside addBankNames");
		   
			if(bankNames.length <= 7){
			   bankNames[index] = bankName;
			   index++;
			   }
			else{
				System.out.println("Exceed the data");
				}
				System.out.println("end addBankNames");
			}
	   
        //Read operation
	   
		public static void getBankNames(){
		for(int index = 0; index < bankNames.length; index++){
			String ref = bankNames[index];
			System.out.println("bank names is " + ref);
		
		}
		
		
	}

}