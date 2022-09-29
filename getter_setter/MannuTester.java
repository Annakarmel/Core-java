class MannuTester{

public static void main(String v[])
	{
	 //We are not initializing any value directly instead we have 
	 //setter and getter
	 Mannu.setMannuId(5789) ;
	 Mannu.setMannuColor("Black") ;
	 Mannu.setMannuType("Red Soil") ;

	
	 
	  //setter and getter
	  //variable can be chnge bt not type 
	System.out.println(Mannu.getMannuId());
	System.out.println(Mannu.getMannuColor());
	System.out.println(Mannu.getMannuType());

	}
}