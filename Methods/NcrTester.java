class NcrTester{

	public static void main(String a[]){
	
	//n!/(n-r)!*r!
	/*int n = 5;
	int r = 3;
	
	int finalValue = Factorial.fact(n)/(Factorial.fact(n-r)*Factorial.fact(r));*/
	int ncr = Factorial.fact(5)/(Factorial.fact(5-3)*Factorial.fact(3));
	
	
	System.out.println("Ncr of "+ ncr);

	}
}