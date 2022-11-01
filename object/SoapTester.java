class SoapTester{

	public static void main(String a[]){
	
	//"Object is a instance of a class"
	// -> purpose of object is to create a multiple copy of a class <--
	// create a multiple copy of Soap
	// Object creation of Soap class
	// ClassName ref = new ClassName(); --> Constructor
	Soap soap = new Soap();
	
	soap.shape = "Rectangle";
	soap.color = "Orange";
	soap.name = "Medimix";
	soap.toGetFresh();
	System.out.println(soap.shape +" "+ soap.color);
	
	Soap soap1 = new Soap();
	
	soap1.shape = "Oval";
	soap1.color = "Cream";
	soap1.name = "Pears";
	soap1.toGetFresh();
	System.out.println(soap1.shape +" "+ soap1.color);
	
	Soap sp = new Soap();
	sp.shape = "Round";
	sp.color = "Red";
	sp.name = "Lifebuy";
	sp.toGetFresh();
	System.out.println(sp.shape +" "+ sp.color);
	
	}
}