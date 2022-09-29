class EcommerceTester{

public static void main(String v[])
	{
	 //We are not initializing any value directly instead we have 
	 //setter and getter
	 Ecommerce.setEcommerceId(5789) ;
	 Ecommerce.setEcommerceName("voovly") ;
	 Ecommerce.setEcommerceRating("5 star") ;
	 Ecommerce.setSinceYear(1920) ;
	
	 
	  //setter and getter
	  //variable can be chnge bt not type 
	System.out.println(Ecommerce.getEcommerceId());
	System.out.println(Ecommerce.getEcommerceName());
	System.out.println(Ecommerce.getEcommerceRating());
	System.out.println(Ecommerce.getSinceYear());
	}}