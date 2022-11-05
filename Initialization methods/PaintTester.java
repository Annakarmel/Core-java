class PaintTester{

public static void main(String v[])
	{
	 //We are not initializing any value directly instead we have 
	 //setter and getter
	 Paint.setPaintId(5789) ;
	 Paint.setPaintColor("Pista") ;
	 Paint.setPaintBrand("Nerolac") ;
	 Paint.setPaintPrice(2890.00) ;
	
	 
	  //setter and getter
	  //variable can be chnge bt not type 
	System.out.println(Paint.getPaintId());
	System.out.println(Paint.getPaintColor());
	System.out.println(Paint.getPaintBrand());
	System.out.println(Paint.getPaintPrice());
	}
}