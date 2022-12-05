class FibonacciSeries{

      public static void main(String anu[]){
	  
	  int n = 12, firstTerm = 0, secondTerm = 1;	  
	  System.out.println("Fibonacci series till " + n + " terms: ");
	  
	  for(int i = 1; i <= n; i++){	  
	     System.out.println(firstTerm + " , ");
		 
		 int nextTerm = firstTerm + secondTerm;		 
		 firstTerm = secondTerm;
		 secondTerm = nextTerm;	  
	  }	  
	  
	}

}