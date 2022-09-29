class Cricket{

	public static void main(String cricket[]){
	
	int rohitHighestScore = 264; // declare and initialization
	int sachinHighestScore = 200;
	int mandanaHighestScore = 135;
	int acKerrHighestScore = 232;
	int bjClarkHighestScore = 229;
	
	int highestScores[] = {rohitHighestScore,sachinHighestScore,mandanaHighestScore,acKerrHighestScore,bjClarkHighestScore};
	
	/*//variable returned from array element
	int ref4 = highestScores[4];
	
	int ref2 = highestScores[2];
	
	int ref3 = highestScores[3];
	
	System.out.println("Element at index 4: " +ref4);
	System.out.println("Element at index 2: " +ref2);
	System.out.println("Element at index 3: " +ref3);*/
	
	//length is a property of array
	System.out.println("The highest score " + highestScores.length );
	
	//for loop
	for(int index =0 ; index < highestScores.length; index++){
		int ref = highestScores[index];
	System.out.println("Element at index : " + index +" "+ ref);
	
	}
}

}