class BeachTester{

		public static void main(String anu[]){
			
			Beaches.addBeachNames("Marina");
			//Beaches.getBeachNames();

			Beaches.addBeachNames("Malpe");
			Beaches.addBeachNames("Baga");
			Beaches.addBeachNames("Gokarna");
			//boolean value = Beaches.addBeachNames(null); --> Neagtive scenario
			//boolean value = Beaches.addBeachNames("Murdeshwara");
			Beaches.addBeachNames("Murdeshwara");
			//Beaches.addBeachNames(null);
			//Beaches.getBeachNames(/*value*/);
			
			//find the beach name
			Beaches.findBeachNames();
			}
}